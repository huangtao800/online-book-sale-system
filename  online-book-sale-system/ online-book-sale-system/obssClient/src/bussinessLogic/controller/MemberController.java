//黄涛
//Member模块中涉及顾客部分的逻辑
package bussinessLogic.controller;
import java.util.ArrayList;

import po.*;
import bussinessLogicService.*;
import bussinessLogic.domain.*;

public class MemberController implements MemberBLService{
	private Member member;
	
	private static MemberBLService instance;
	
	public static MemberBLService getInstance(MemberPO memberPO){
		if(instance==null){
			instance=new MemberController(memberPO);
		}
		return instance;
	}
	
	private MemberController(MemberPO memberPO){
		
		this.member=new Member(memberPO);
		
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
		return null;
	}

	@Override
	public ResultMessage removeFromCart(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
