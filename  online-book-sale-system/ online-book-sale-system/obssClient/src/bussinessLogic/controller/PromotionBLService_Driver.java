package bussinessLogic.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

import po.PromotionPO;
import po.ResultMessage;
import bussinessLogicService.PromotionBLService;

public class PromotionBLService_Driver {

	public void drive(PromotionBLService promotionBLService){
		ResultMessage result1=promotionBLService.setPromotion(0.1,20,200,0.8);
		if(result1==ResultMessage.SUCCEED)
			System.out.println("Set promotion successfully!");
		else  System.out.println("Set promotion unsuccessfully!");
		
		//
		PromotionPO promotion=promotionBLService.getPromotion();
		System.out.println("Look up  promotion successfully!");
			
		
		ResultMessage result2=promotionBLService.setEquivalent("1", 2, new GregorianCalendar() ,new GregorianCalendar());
		if(result2==ResultMessage.SUCCEED)
			System.out.println("Set equivalent successfully!");
		else  System.out.println("Set equivalent unsuccessfully!");
		
		ResultMessage result3=promotionBLService.setCoupon("1", 2,new GregorianCalendar(),new GregorianCalendar());
		if(result3==ResultMessage.SUCCEED)
			System.out.println("Set coupon successfully!");
		else  System.out.println("Set coupon unsuccessfully!");
		
		
	}
}
