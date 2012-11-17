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
	private MockMember mockMember;
	
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
		return mockMember.addFavorities(id);
	}


	@Override
	public ResultMessage removeFavorities(String id) {
		// TODO Auto-generated method stub
		return mockMember.removeFavorities(id);
	}


	@Override
	public ResultMessage register(String name, String password) {
		// TODO Auto-generated method stub
		return mockMember.register(name,password);
	}

	@Override
	public ResultMessage cancel(String id, String password) {
		// TODO Auto-generated method stub
		return mockMember.cancel(id, password); 
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
