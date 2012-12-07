//»ÆÌÎ
package bussinessLogic.controller;

import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.ResultMessage;
import bussinessLogicService.MemberBLService;

public class MemberBLService_Driver {
	public void drive(MemberBLService memberBLService){
	
		
		ResultMessage m5=memberBLService.cancel("111111");
		if(m5==ResultMessage.SUCCEED){
			System.out.println("cancel succeed");
		}
		
	}
}
