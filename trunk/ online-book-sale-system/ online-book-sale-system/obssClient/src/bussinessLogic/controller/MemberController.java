//����
//Memberģ�����漰�˿Ͳ��ֵ��߼�
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
	

}
