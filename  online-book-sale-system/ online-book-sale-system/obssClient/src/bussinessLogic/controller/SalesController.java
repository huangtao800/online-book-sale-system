package bussinessLogic.controller;

import java.util.ArrayList;

import bussinessLogic.domain.Book;
import bussinessLogic.domain.Sales;
import bussinessLogicService.SalesBLService;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.LineItemPO;
import po.MemberPO;
import po.OrderPO;
import po.ResultMessage;
//end sale需要完善
public class SalesController implements SalesBLService{
	
	MemberController member = new MemberController();
	Book book = new Book();
	Sales sales = new Sales();
	
	public ResultMessage putInCart(String isbn, int number){
		BookPO bookPo = book.findByISBN(isbn);
		ResultMessage result = sales.putInCart(bookPo, number);
		return result;		
	}
	
	public ArrayList<LineItemPO> enterCart(){
		ArrayList<LineItemPO> cartList = sales.getCartList();
		return cartList;
	}
	
	public ResultMessage removeFrromCart(String itemID){
		ResultMessage result = sales.removeFromCart(itemID);
		return result;
	}
	
	public ResultMessage purchase(double price, MemberPO memberPO){
		ArrayList<LineItemPO> cartList = sales.getCartList();
		OrderPO orderPO = new OrderPO(cartList, memberPO.getUserID(), price);
		member.addOrder(orderPO, memberPO);
		return ResultMessage.SUCCEED;
	}
	
	public double calucalte(){
		double totalPrice = sales.commonCalculate();
		return totalPrice;
	}
	
	public ArrayList<String> showSpecial(){
		ArrayList<CouponPO> couponList = member.getCouponList();
		ArrayList<EquivalentPO> equivalentList = member.getEquivalentList();
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
    
	public ResultMessage endSale(){
		ArrayList<LineItemPO> salesList = sales.getCartList();
	    book.updateBook(salesList);
		member.update();
		sales.updateSale();	
		return ResultMessage.SUCCEED;
	}
	
}
