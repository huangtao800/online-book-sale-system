package bussinessLogic.controller;
import po.CouponPO;
import po.EquivalentPO;
import po.ResultMessage;
import bussinessLogicService.*;

public class MemberManagerBLService_Driver {
	
	public void drive(MemberManagerBLService memberManagerBLService){
		ResultMessage m2=memberManagerBLService.addCoupon(new CouponPO());
		if(m2==ResultMessage.SUCCEED){
			System.out.println("add succeed");
		}
		
		ResultMessage m3=memberManagerBLService.addEquivalent(new EquivalentPO());
		if(m3==ResultMessage.SUCCEED){
			System.out.println("add succeed");
		}
	}

}
