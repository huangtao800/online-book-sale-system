//黄涛
package bussinessLogic.controller;

import po.BookPO;
import po.MemberPO;
import bussinessLogic.domain.Member;
import bussinessLogicService.MemberBLService;

public class Client {

	public static void main(String[] args){
		MemberBLService memberBLService=new MemberBLService_Stub(new MemberPO("111111", "huang", "111111"));
		MemberBLService_Driver driver=new MemberBLService_Driver();
		System.out.println("test MemberBLService_Driver:");
		driver.drive(memberBLService);
		System.out.println();
		
		System.out.println("test PromotionBLService_Driver:");
		PromotionBLService_Driver promotionBLService_Driver = new PromotionBLService_Driver();
		promotionBLService_Driver.drive(new PromotionBLService_Stub());
		System.out.println();
		
		System.out.println("test SalesBLService_Driver:");
		SalesBLService_Driver salesBLService_Driver = new SalesBLService_Driver();
		salesBLService_Driver.drive(new SalesBLService_Stub(20));
		System.out.println();
		
		System.out.println("test BookBLService_Driver:");
		BookBLService_Driver bookBLService_Driver = new BookBLService_Driver();
		bookBLService_Driver.drive(new BookBLService_Stub("Java语言程序设计","计算机类","11111",new BookPO()));
		System.out.println();
		
		System.out.println("test UserBLService_Driver:");
		UserBLService_Driver userBLService_Driver = new UserBLService_Driver();
		userBLService_Driver.drive(new UserBLService_Stub("李四","123456","11111"));
		System.out.println();
	}
}
