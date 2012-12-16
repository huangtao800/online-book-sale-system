package bussinessLogic.controller;

import java.util.ArrayList;

import bussinessLogic.domain.Sales;
import bussinessLogicService.BookBLService;
import bussinessLogicService.MemberBLService;
import bussinessLogicService.SalesBLService;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.LineItemPO;
import po.OrderPO;
import po.PO;
import po.ResultMessage;
import presentationController.Sales.OrderVO;

public class SalesController implements SalesBLService{
	private MemberBLService memberController = MemberController.getInstance();
	private BookBLService bookController = BookController.getInstance(); //改成单键
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
		BookPO bookPO = bookController.findByISBN(isbn);
		if(bookPO == null)
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
	public ResultMessage addFavorities(LineItemPO lineItemPO) {
		BookPO bookPO = lineItemPO.getBook();
		return memberController.addFavorities(bookPO);
	}
	
	@Override
	public double getTotalPrice() {
		ArrayList<LineItemPO> cartList = getCartList();
		double totalPrice = 0;
		for(int i = 0; i < cartList.size(); i ++)
			totalPrice += cartList.get(i).getSumPrice();
		return totalPrice;
	}
	
	@Override
	public ArrayList<String> showSpecial(double commonPrice){//需要修改
		ArrayList<CouponPO> couponList = memberController.getCouponList();
		ArrayList<EquivalentPO> equivalentList = memberController.getEquivalentList();
		ArrayList<String> voList = new ArrayList<String>();
		
		for(int i = 0; i < couponList.size(); i ++){
			String s = couponList.get(i).toString(); 
			voList.add(s);
		}
		for(int i = 0; i < equivalentList.size(); i ++){
			EquivalentPO equivalentPO = equivalentList.get(i);
			if(commonPrice < equivalentPO.getMin())			
				break;
			String s = equivalentPO.toString(); 
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
	
	public OrderVO pay(double price,String address,int index){
		ArrayList<LineItemPO> cartList = getCartList();
		OrderPO orderPO = sales.creareOrderPO(cartList, memberController.getMemberID(), price, address);
		PO special = getSpecialList().get(index);
		if(special instanceof EquivalentPO){
			EquivalentPO equivalentPO = (EquivalentPO)special;
			memberController.deleteEquivalent(equivalentPO);
		}
		else if(special instanceof CouponPO){
			CouponPO couponPO = (CouponPO)special;
			memberController.deleteCouponPO(couponPO);
		}	
		memberController.addOrder(orderPO);
		sales.addOrder(orderPO);
		OrderVO orderVO = new OrderVO(orderPO);
		return orderVO;
	}
    
	@Override
	public ArrayList<LineItemPO> getCartList() {
		return memberController.getCartList();	
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

	public void endSale(){		
		ArrayList<LineItemPO> salesList = getCartList();
	    bookController.updateBook(salesList);
		sales.updateSale();	
		memberController.clearCart();
	}

	@Override
	public String getAddress() {
		return memberController.getAddress();
	}


	
}
