//黄涛
//Member模块中涉及顾客部分的逻辑
package bussinessLogic.controller;
import java.util.ArrayList;

import po.*;
import bussinessLogicService.*;
import bussinessLogic.domain.*;

public class MemberController implements MemberBLService{
	private static Member member;
	
	private static MemberBLService instance;
	
	public static MemberBLService getInstance(){
		if(instance==null){
			instance=new MemberController();
		}
		return instance;
	}
	
	private MemberController(){

	}
	
	public static void setMember(MemberPO memberPO){
		member=new Member(memberPO);
	}

	@Override
	public String getMemberName() {
		// TODO Auto-generated method stub
		return member.getMemberName();
	}

	@Override
	public String getMemberID() {
		// TODO Auto-generated method stub
		return member.getMemberID();
	}


	@Override
	public ResultMessage cancel(String password) {
		// TODO Auto-generated method stub
		return member.cancel(password); 
	}

	@Override
	public ArrayList<OrderPO> getOrderRecord() {
		// TODO Auto-generated method stub
		return member.getOrderRecord();
	}

	@Override
	public ArrayList<CouponPO> getCouponList() {
		// TODO Auto-generated method stub
		return member.getCouponList();
	}

	@Override
	public ArrayList<EquivalentPO> getEquivalentList() {
		// TODO Auto-generated method stub
		return member.getEquivalentList();
	}


	@Override
	public ResultMessage addFavorities(BookPO bookPO) {
		// TODO Auto-generated method stub
		return member.addFavorities(bookPO);
	}

	@Override
	public ResultMessage removeFavorities(BookPO bookPO) {
		// TODO Auto-generated method stub
		return member.removeFavorities(bookPO);
	}

	@Override
	public ResultMessage addOrder(OrderPO order) {
		// TODO Auto-generated method stub
		return member.addOrder(order);
	}

	@Override
	public ResultMessage changeName(String newName) {
		// TODO Auto-generated method stub
		return member.changeName(newName);
	}

	@Override
	public ResultMessage changePassword(String password) {
		// TODO Auto-generated method stub
		return member.changePassword(password);
	}

	@Override
	public ResultMessage putInCart(LineItemPO lineItemPO) {
		// TODO Auto-generated method stub
		return member.putInCart(lineItemPO);
	}

	@Override
	public ResultMessage removeFromCart(int index) {
		// TODO Auto-generated method stub
		return member.removeFromCart(index);
	}

	@Override
	public ResultMessage deleteEquivalent(EquivalentPO equivalentPO) {
		// TODO Auto-generated method stub
		return member.deleteEquivalenet(equivalentPO);
	}

	@Override
	public ResultMessage deleteCouponPO(CouponPO couponPO) {
		// TODO Auto-generated method stub
		return member.deleteCoupon(couponPO);
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return member.getTotalPrice();
	}

	

}
