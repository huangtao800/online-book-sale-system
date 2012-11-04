package presentation;
//∂≠» π„

	import java.util.Calendar;
import java.util.GregorianCalendar;

import po.CouponPO;
	import bussinessLogic.controller.*;
import bussinessLogicService.PromotionBLService;

	public class PromotionView {

		PromotionBLService promotionBL=new PromotionBLService_Stub();
		public void start(){
	        promotionBL.setPromotion(0.1,20,200,0.8);
	        promotionBL.setEquivalent("1", 2, new GregorianCalendar() ,new GregorianCalendar());
	        promotionBL.setCoupon("1", 2,new GregorianCalendar(),new GregorianCalendar());
		}
	public static void main(String[] args){
		new PromotionView().start();
	}
}
