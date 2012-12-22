//黄涛
//Member模块中涉及顾客部分的逻辑
package bussinessLogic.controller;
import java.util.ArrayList;

import po.*;
import bussinessLogicService.*;
import bussinessLogic.domain.*;

public class CustomerController implements CustomerBLService{
	private static Customer customer;
	
	private static CustomerBLService instance;
	
	public static CustomerBLService getInstance(){
		if(instance==null){
			instance=new CustomerController();
		}
		return instance;
	}
	
	private CustomerController(){

	}
	
	public static void setMember(CustomerPO customerPO){
		customer=new Customer(customerPO);
	}

	@Override
	public String getMemberName() {
		// TODO Auto-generated method stub
		return customer.getMemberName();
	}

	@Override
	public String getMemberID() {
		// TODO Auto-generated method stub
		return customer.getMemberID();
	}


	@Override
	public ResultMessage cancel(String password) {
		// TODO Auto-generated method stub
		return customer.cancel(password); 
	}

	@Override
	public ArrayList<OrderPO> getOrderRecord() {
		// TODO Auto-generated method stub
		return customer.getOrderRecord();
	}

	@Override
	public ArrayList<CouponPO> getCouponList() {
		// TODO Auto-generated method stub
		return customer.getCouponList();
	}

	@Override
	public ArrayList<EquivalentPO> getEquivalentList() {
		// TODO Auto-generated method stub
		return customer.getEquivalentList();
	}


	@Override
	public ResultMessage addFavorities(BookPO bookPO) {
		// TODO Auto-generated method stub
		return customer.addFavorities(bookPO);
	}

	@Override
	public ResultMessage removeFavorities(BookPO bookPO) {
		// TODO Auto-generated method stub
		return customer.removeFavorities(bookPO);
	}

	@Override
	public ResultMessage addOrder(OrderPO order) {
		// TODO Auto-generated method stub
		return customer.addOrder(order);
	}

	@Override
	public ResultMessage changeName(String newName) {
		// TODO Auto-generated method stub
		return customer.changeName(newName);
	}

	@Override
	public ResultMessage changePassword(String password) {
		// TODO Auto-generated method stub
		return customer.changePassword(password);
	}

	@Override
	public ResultMessage putInCart(BookPO bookPO, int number) {
		// TODO Auto-generated method stub
		int save=bookPO.getNumOfBook();
		if(number>save){
			return ResultMessage.NOTPREPARED;
		}
		
		LineItemPO newItemPO =new LineItemPO(bookPO,number);
		return customer.putInCart(newItemPO);
	}

	@Override
	public ResultMessage removeFromCart(int index) {
		// TODO Auto-generated method stub
		return customer.removeFromCart(index);
	}

	@Override
	public ResultMessage deleteEquivalent(EquivalentPO equivalentPO) {
		// TODO Auto-generated method stub
		return customer.deleteEquivalenet(equivalentPO);
	}

	@Override
	public ResultMessage deleteCouponPO(CouponPO couponPO) {
		// TODO Auto-generated method stub
		return customer.deleteCoupon(couponPO);
	}

	@Override
	public ArrayList<LineItemPO> getCartList() {
		// TODO Auto-generated method stub
		return customer.getCartList();
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return customer.getAddress();
	}

	@Override
	public ResultMessage changeAddress(String newAddress) {
		// TODO Auto-generated method stub
		return customer.changeAddress(newAddress);
	}

	@Override
	public ResultMessage clearCart() {
		// TODO Auto-generated method stub
		return customer.clearCart();
	}

	@Override
	public CustomerPO freshMemberPO(String memberID) {
		// TODO Auto-generated method stub
		CustomerPO newMemberPO= customer.freshMemberPO(memberID);
		return newMemberPO;
	}

	@Override
	public ArrayList<String> getBookType() {
		// TODO Auto-generated method stub
		return BookController.getInstance().getBookType();
	}

	@Override
	public ResultMessage changeLineItemNumber(int index, int newNumber) {
		// TODO Auto-generated method stub
		return customer.changeLineItemNumber(index,newNumber);
	}

	public ResultMessage freshBookNumber(){
		return customer.freshBookNumber();
	}

}
