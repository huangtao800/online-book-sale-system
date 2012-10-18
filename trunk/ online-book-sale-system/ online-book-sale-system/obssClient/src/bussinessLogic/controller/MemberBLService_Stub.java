package bussinessLogic.controller;
import java.util.ArrayList;

import po.*;
import bussinessLogicService.*;
import bussinessLogic.domain.*;

public class MemberBLService_Stub implements MemberBLService{
	private String name;
	private String id;
	
	public MemberBLService_Stub(String id,String name){
		this.id=id;
		this.name=name;
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
	public ResultMessage addFavorities(String id) {
		// TODO Auto-generated method stub
		if(id.equals("111111")){
			return ResultMessage.SUCCEED;
		}else {
			return ResultMessage.FAILED;
		}
	}

	@Override
	public ResultMessage removeFavorities(String id) {
		// TODO Auto-generated method stub
		if(id.equals("111111")){
			return ResultMessage.SUCCEED;
		}else {
			return ResultMessage.FAILED;
		}
	}

	@Override
	public ResultMessage addEquivalent(String id) {
		// TODO Auto-generated method stub
		if(id.equals("111111")){
			return ResultMessage.SUCCEED;
		}else {
			return ResultMessage.FAILED;
		}
	}

	@Override
	public ResultMessage addCoupon(String id) {
		// TODO Auto-generated method stub
		if(id.equals("111111")){
			return ResultMessage.SUCCEED;
		}else {
			return ResultMessage.FAILED;
		}
	}

	@Override
	public ResultMessage changeOrder() {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCEED;
	}

	@Override
	public ResultMessage register(String id, String password) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCEED;
	}

	@Override
	public ResultMessage cancel(String id, String password) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCEED;
	}

	@Override
	public ArrayList<OrderPO> getOrderRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberPO getInfo() {
		// TODO Auto-generated method stub
		return new MemberPO("111111", "member");
	}

}
