package bussinessLogic.controller;

import java.util.ArrayList;

import bussinessLogic.domain.MockBook;
import bussinessLogic.domain.MockSales;
import bussinessLogic.domain.Sales;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.LineItemPO;
import po.OrderPO;
import po.ResultMessage;

public class MockSalesContrller extends SalesController {

	MockBook book = new MockBook();
	
	MemberController member = new MemberController();
	
	Sales sales = new MockSales();
	
	OrderPO orderPO;
	

		
	public ResultMessage putInCart(String isbn, int number){
		BookPO bookPo = book.findByISBN(isbn);
		ResultMessage result = sales.putInCart(bookPo, number);
		return result;		
	}
	
	public ResultMessage enterCart(){
		ResultMessage result = sales.enterCart();
		return result;
	}
	public ResultMessage removeFrromCart(String itemID){
		ResultMessage result = sales.removeFromCart(itemID);
		return result;
	}
	
	public ResultMessage purchase(){
		ArrayList<LineItemPO> cartList = sales.getSalesList();
		orderPO = new OrderPO(cartList, member.getMemberID());
		member.addOrder(orderPO);
		return ResultMessage.SUCCEED;
	}
	
	public double calucalte(){
		double totalPrice = sales.commonCalculate();
		return totalPrice;
	}
	public ResultMessage showSpecial(){
		ArrayList<CouponPO> couponList = member.getCouponList();
		ArrayList<EquivalentPO> equivalentList = member.getEquivalentList();
		return ResultMessage.SUCCEED;	
	}
	public double calculateByEquivalent(){
		double common = sales.commonCalculate();
		return common - 20;
		
	}
    public double calculateByCupon(){
    	double common = sales.commonCalculate();
		return common*0.8;
	}
	public ResultMessage endSale(){
		ArrayList<LineItemPO> salesList = sales.getSalesList();
		if(salesList == null)
			return ResultMessage.FAILED;
	    book.updateBook(salesList);
		member.update();
		return sales.updateSale();	
	}
}
