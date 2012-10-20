package bussinessLogic.controller;
//董仁广
import java.util.Calendar;

import bussinessLogicService.PromotionBLService;
import po.*;

public class PromotionBLService_Stub implements PromotionBLService  {
	
    public ResultMessage setPromotion(double exchangeOfScore,int valueOfCoupons, double proportionOfCoupons,double discount){//设置促销手段
    	return ResultMessage.SUCCEED;
    }
    
    public PromotionPO getPromotion(){
    	return new PromotionPO();
    }
    
    public ResultMessage setEquivalent(String vipLevel,int quantity,Calendar startDate,Calendar endDate){//设置大范围促销中等价券的赠送规则
    	return ResultMessage.SUCCEED;
    }
    
    public ResultMessage setCoupon(String vipLevel,int quantity,Calendar startDate,Calendar endDate){//设置大范围促销中打折券的赠送规则
    	return ResultMessage.SUCCEED;
    }
    
}
