package bussinessLogic.controller;

import java.util.ArrayList;

import bussinessLogic.domain.Book;
import bussinessLogic.domain.Sales;
import bussinessLogicService.MemberBLService;
import bussinessLogicService.SalesBLService;

import po.BookPO;
import po.Cart;
import po.CouponPO;
import po.EquivalentPO;
import po.LineItemPO;
import po.MemberPO;
import po.OrderPO;
import po.PO;
import po.ResultMessage;
import presentationController.Sales.OrderVO;

public class SalesController implements SalesBLService{
	private MemberBLService memberController ;
	Book book = new Book(); //改成单键
	private Sales sales;
	
	private static SalesController uniqueInstance;
	
	private SalesController(){
		sales = new Sales();
	}
	
	public static SalesController getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new SalesController();
		}
		return uniqueInstance;
	}
	
	@Override
	public ResultMessage putInCart(String isbn, int number){
		BookPO bookPO = book.findByISBN(isbn);
		if(book == null)
			return ResultMessage.FAILED;
		LineItemPO lineItemPO = new LineItemPO(bookPO, number);
		ResultMessage result = memberController.putInCart(lineItemPO);
		return result;		
	}
	
	@Override
	public ResultMessage removeFrromCart(int index){
		ResultMessage result = memberController.removeFromCart(index);
		return result;
	}
	
	@Override
	public double getTotalPrice() {
		return memberController.getTotalPrice();
		//memberController 调用 memberPO中cart的总价
	}
	
	@Override
	public ArrayList<String> showSpecial(double commonPrice){//需要修改
		ArrayList<CouponPO> couponList = memberController.getCouponList();
		ArrayList<EquivalentPO> equivalentList = memberController.getEquivalentList();
		ArrayList<String> voList = new ArrayList<String>();
		
		for(int i = 0; i < couponList.size(); i ++){
			String s = couponList.get(i).getRate() * 10 + "折"; 
			voList.add(s);
		}
		for(int i = 0; i < equivalentList.size(); i ++){
			EquivalentPO equivalentPO = equivalentList.get(i);
			if(commonPrice >= equivalentPO.getMin())
				break;
			String s = equivalentPO.getDeno() + "元"; 
			voList.add(s);
		}
		return voList;	
	}
	
	@Override  
	public double getSpecialPrice(int i) {//else的情况需要修改
		double specialPrice = 0;
		PO special = getSpecialList().get(i);
		if(special instanceof EquivalentPO){
			EquivalentPO equivalentPO = (EquivalentPO)special;
			specialPrice = calculateByEquivalent(equivalentPO.getDeno());
		}
		else if(special instanceof CouponPO){
			CouponPO couponPO = (CouponPO)special;
			specialPrice = calculateByCupon(couponPO.getRate());
		}	
		return specialPrice;
	}
	
	public ResultMessage purchase(double price){
		ArrayList<LineItemPO> cartList = getCartList();
		OrderPO orderPO = new OrderPO(cartList, memberController.getMemberID(), price);
		memberController.addOrder(orderPO);
		sales.addOrder(orderPO);
		return ResultMessage.SUCCEED;
	}
    
	@Override
	public ArrayList<LineItemPO> getCartList() {
		memberController.getCartList();
		//只返还list给我，不要cart,对cart的操作交付给memberController
		return null;
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
	
	private double calculateByEquivalent(double deno){
		double common = getTotalPrice();
		double price = common - deno;
		if(price > 0)
			return price;
		else 
			return 0;
	}
	
    private double calculateByCupon(double rate){
    	double common = getTotalPrice();
    	double price = common * rate;
		return price;
	}

	public OrderVO endSale(){
		OrderPO orderPO = sales.endSale();
		OrderVO orderVO = new OrderVO(orderPO);
		ArrayList<LineItemPO> salesList = getCartList();
	    book.updateBook(salesList);
		sales.updateSale();	
		return orderVO;
	}



	
}
