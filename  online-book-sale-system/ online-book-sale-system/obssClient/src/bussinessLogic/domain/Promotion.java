package bussinessLogic.domain;

import java.util.Calendar;

import po.CouponPO;
import po.EquivalentPO;
import po.PromotionPO;
import po.ResultMessage;

public class Promotion {
    private PromotionPO promotion;
    private EquivalentPO equantity;
    private CouponPO coupon;
    
    
	public ResultMessage setPromotion(double exchangeOfScore,int valueOfCoupons, double proportionOfCoupons,double discount){//设置促销手段
    	return ResultMessage.SUCCEED;
    }
    
    //
    public PromotionPO getPromotion(){
    	return promotion;
    }
    
    public ResultMessage setEquivalent(String vipLevel,int quantity,Calendar startDate,Calendar endDate){//设置大范围促销中等价券的赠送规则
    	return ResultMessage.SUCCEED;
    }
    
    public ResultMessage setCoupon(String vipLevel,int quantity,Calendar startDate,Calendar endDate){//设置大范围促销中打折券的赠送规则
    	return ResultMessage.SUCCEED;
    }
}
