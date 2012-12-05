//黄涛
//Member模块中涉及顾客部分的逻辑
package bussinessLogic.controller;
import java.util.ArrayList;

import po.*;
import bussinessLogicService.*;
import bussinessLogic.domain.*;

public class MemberController implements MemberBLService{
	private String name;
	private String id;
	private Member member;
	
	public MemberController(){
		
		this.member=new Member();
		
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
	public ResultMessage register(String name, String password) {
		// TODO Auto-generated method stub
		return member.register(name,password);
	}

	@Override
	public ResultMessage cancel(String id, String password) {
		// TODO Auto-generated method stub
		return member.cancel(id, password); 
	}

	@Override
	public ArrayList<OrderPO> getOrderRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberPO getInfo() {
		// TODO Auto-generated method stub
		return new MemberPO("111111", "member","111111");
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
	public ResultMessage update() {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCEED;
	}

	@Override
	public ResultMessage addFavorities(BookPO bookPO, MemberPO memberPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage removeFavorities(BookPO bookPO, MemberPO memberPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addOrder(OrderPO order, MemberPO memberPO) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
