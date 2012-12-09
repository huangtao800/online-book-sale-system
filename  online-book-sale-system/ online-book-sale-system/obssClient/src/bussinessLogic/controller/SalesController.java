package bussinessLogic.controller;

import java.util.ArrayList;

import bussinessLogic.domain.Book;
import bussinessLogic.domain.Sales;
import bussinessLogicService.MemberBLService;
import bussinessLogicService.SalesBLService;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.LineItemPO;
import po.MemberPO;
import po.OrderPO;
import po.PO;
import po.ResultMessage;

public class SalesController implements SalesBLService{
	private MemberBLService memberController;//改成单键
	Book book = new Book(); //改成单键
	private Sales sales;
	private MemberPO memberPO;
	
	private static SalesController uniqueInstance;
	
	private SalesController(MemberPO memberPO){
		this.memberPO = memberPO;
		sales = new Sales(memberPO);
		memberController = MemberController.getInstance(memberPO); 
	}
	
	public static SalesController getInstance(MemberPO memberPO){
		if(uniqueInstance == null)
			uniqueInstance = new SalesController(memberPO);
		return uniqueInstance;
	}
	
	public ResultMessage putInCart(String isbn, int number){
		BookPO bookPo = book.findByISBN(isbn);
		ResultMessage result = sales.putInCart(bookPo, number);
		return result;		
	}
	
	public ArrayList<LineItemPO> enterCart(){
		ArrayList<LineItemPO> cartList = sales.getCartList();
		return cartList;
	}
	
	public ResultMessage removeFrromCart(String isbn){
		ResultMessage result = sales.removeFromCart(isbn);
		return result;
	}
	
	public ResultMessage purchase(double price){
		ArrayList<LineItemPO> cartList = sales.getCartList();
		OrderPO orderPO = new OrderPO(cartList, memberPO.getUserID(), price);
		memberController.addOrder(orderPO);
		endSale(orderPO);
		return ResultMessage.SUCCEED;
	}
	
	public double calucalte(){
		double totalPrice = sales.commonCalculate();
		return totalPrice;
	}
	
	public ArrayList<String> showSpecial(){//需要修改
		ArrayList<CouponPO> couponList = memberController.getCouponList();
		ArrayList<EquivalentPO> equivalentList = memberController.getEquivalentList();
		ArrayList<String> voList = new ArrayList<String>();
		
		for(int i = 0; i < couponList.size(); i ++){
			String s = couponList.get(i).getRate() * 10 + "折"; 
			voList.add(s);
		}
		for(int i = 0; i < equivalentList.size(); i ++){
			EquivalentPO equivalentPO = equivalentList.get(i);
			if(sales.commonCalculate() >= equivalentPO.getMin())
				break;
			String s = equivalentPO.getDeno() + "元"; 
			voList.add(s);
		}
		return voList;	
	}
	private ArrayList<PO> getSpecialList(){
		//优惠券要不要做继承？
		ArrayList<PO> specialList = new ArrayList<PO>();
		ArrayList<CouponPO> couponList = memberController.getCouponList();
		ArrayList<EquivalentPO> equivalentList = memberController.getEquivalentList();
		for(int i = 0; i < couponList.size(); i ++){
			specialList.add(couponList.get(i));
		}
		for(int i = 0; i < equivalentList.size(); i ++){
			specialList.add(equivalentList.get(i));
		}
		return specialList;
	}
	
	public double calculateByEquivalent(double deno){
		double common = sales.commonCalculate();
		double price = common - deno;
		if(price > 0)
			return price;
		else 
			return 0;
	}
	
    public double calculateByCupon(double rate){
    	double common = sales.commonCalculate();
    	double price = common * rate;
		return price;
	}
    
	@Override
	public double getSpecialPrice(int i) {//else的情况需要修改
		double specialPrice = 0;
		PO special = getSpecialList().get(i);
		if(special instanceof EquivalentPO){
			EquivalentPO equivalentPO = (EquivalentPO)special;
			specialPrice = calculateByCupon(equivalentPO.getDeno());
		}
		else if(special instanceof CouponPO){
			CouponPO couponPO = (CouponPO)special;
			specialPrice = calculateByCupon(couponPO.getRate());
		}	
		return specialPrice;
	}
    
	public ResultMessage endSale(OrderPO orderPO){
		ArrayList<LineItemPO> salesList = sales.getCartList();
	    book.updateBook(salesList);
		sales.updateSale(orderPO);	
		return ResultMessage.SUCCEED;
	}

	
}
