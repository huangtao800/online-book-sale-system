//黄涛
//Member模块中涉及顾客部分的逻辑
package bussinessLogic.controller;
import java.util.ArrayList;

import po.*;
import bussinessLogicService.*;
import bussinessLogic.domain.*;

public class MemberBLService_Stub implements MemberBLService{
	private String name;
	private String id;
	private Member member;
	
	public MemberBLService_Stub(MemberPO memberPO){
		this.id=id;
		this.name=name;
		this.member=new Member(memberPO);
		
	}

	@Override
	public String getMemberName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getMemberID() {
		// TODO Auto-generated method stub
		return id;
	}


	@Override
	public ResultMessage cancel(String password) {
		// TODO Auto-generated method stub
		return member.cancel(password); 
	}

	@Override
	public ArrayList<OrderPO> getOrderRecord() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<CouponPO> getCouponList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<EquivalentPO> getEquivalentList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage addFavorities(BookPO bookPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage removeFavorities(BookPO bookPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addOrder(OrderPO order) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
