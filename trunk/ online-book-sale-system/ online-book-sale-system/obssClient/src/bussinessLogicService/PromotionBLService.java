package bussinessLogicService;
//董仁广
import java.util.Calendar;

import po.*;

public interface PromotionBLService {
	//
	public PromotionPO getPromotion();//查看当前的促销手段
    public ResultMessage setPromotion(double exchangeOfScore,int valueOfCoupons,double proportionOfCoupons,double discount);//设置促销手段
    public ResultMessage setEquivalent(String vipLevel,int quantity,Calendar startDate,Calendar endDate);//设置大范围促销中等价券的赠送规则
    public ResultMessage setCoupon(String vipLevel,int quantity);//设置大范围促销中打折券的赠送规则
   
}
