package bussinessLogic.controller;

import po.ResultMessage;
import bussinessLogicService.MemberBLService;

public class MemberBLService_Driver {
	public void drive(MemberBLService memberBLService){
		ResultMessage m=memberBLService.addFavorities("111111");
		if(m==ResultMessage.SUCCEED){
			System.out.println("add succeed");
		}
		
		ResultMessage m2=memberBLService.addCoupon("111111");
		if(m2==ResultMessage.SUCCEED){
			System.out.println("add succeed");
		}
		
		ResultMessage m3=memberBLService.addEquivalent("111111");
		if(m3==ResultMessage.SUCCEED){
			System.out.println("add succeed");
		}
		
		ResultMessage m4=memberBLService.register("111111", "111111");
		if(m4==ResultMessage.SUCCEED){
			System.out.println("register succeed");
		}
		
		ResultMessage m5=memberBLService.cancel("111111", "111111");
		if(m5==ResultMessage.SUCCEED){
			System.out.println("cance succeed");
		}
		
	}
}
