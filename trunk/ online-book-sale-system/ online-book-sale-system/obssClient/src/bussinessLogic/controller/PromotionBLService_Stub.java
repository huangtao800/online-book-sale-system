package bussinessLogic.controller;
//���ʹ�
import java.util.Calendar;

import bussinessLogicService.PromotionBLService;
import po.*;

public class PromotionBLService_Stub implements PromotionBLService  {
	
    public ResultMessage setPromotion(double exchangeOfScore,int valueOfCoupons, double proportionOfCoupons,double discount){//���ô����ֶ�
    	return ResultMessage.SUCCEED;
    }
    
    public PromotionPO getPromotion(){
    	return new PromotionPO();
    }
    
    public ResultMessage setEquivalent(String vipLevel,int quantity,Calendar startDate,Calendar endDate){//���ô�Χ�����еȼ�ȯ�����͹���
    	return ResultMessage.SUCCEED;
    }
    
    public ResultMessage setCoupon(String vipLevel,int quantity,Calendar startDate,Calendar endDate){//���ô�Χ�����д���ȯ�����͹���
    	return ResultMessage.SUCCEED;
    }
    
}
