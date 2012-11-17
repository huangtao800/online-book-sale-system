package bussinessLogic.controller;

import java.awt.print.Book;
import java.util.ArrayList;

import bussinessLogic.domain.*;
import bussinessLogic.domain.MockBook;
import bussinessLogic.domain.MockSales;
import bussinessLogicService.BookBLService;
import bussinessLogicService.MemberBLService;
import bussinessLogicService.SalesBLService;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.LineItemPO;
import po.MemberPO;
import po.OrderPO;
import po.PromotionPO;
import po.ResultMessage;

public class MockSalesContrller extends SalesController {
	Book book =new Book();
	MemberBLService member = new Member();
	SalesBLService sales = new MockSales();
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
		member.addOder(order);
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
	public ResultMessage calculateByEquivalent(){
		//getStrategy
		return ResultMessage.SUCCEED;
		
	}
    public ResultMessage calculateByCupon(){
    	//getStrategy
		return ResultMessage.SUCCEED;
	}
	public ResultMessage endSale(){
		ArrayList<LineItemPO> salesList = sales.getSalesList();
	    book.updateBook(salesList);
		member.updateMember();
		sales.updateSale();	
		return ResultMessage.SUCCEED;
	}
}
