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
    
    
	public ResultMessage setPromotion(double exchangeOfScore,int valueOfCoupons, double proportionOfCoupons,double discount){//���ô����ֶ�
    	return ResultMessage.SUCCEED;
    }
    
    //
    public PromotionPO getPromotion(){
    	return promotion;
    }
    
    public ResultMessage setEquivalent(String vipLevel,int quantity,Calendar startDate,Calendar endDate){//���ô�Χ�����еȼ�ȯ�����͹���
    	return ResultMessage.SUCCEED;
    }
    
    public ResultMessage setCoupon(String vipLevel,int quantity,Calendar startDate,Calendar endDate){//���ô�Χ�����д���ȯ�����͹���
    	return ResultMessage.SUCCEED;
    }
}
