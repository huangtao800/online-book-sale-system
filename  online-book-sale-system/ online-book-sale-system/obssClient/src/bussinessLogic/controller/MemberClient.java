package bussinessLogic.controller;

import bussinessLogicService.MemberBLService;

public class MemberClient {

	public static void main(String[] args){
		MemberBLService memberBLService=new MemberBLService_Stub("111111", "huangtao");
		MemberBLService_Driver driver=new MemberBLService_Driver();
		driver.drive(memberBLService);
	}
}
