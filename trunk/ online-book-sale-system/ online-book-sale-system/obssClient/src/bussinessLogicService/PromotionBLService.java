package bussinessLogicService;
//���ʹ�
import java.util.Calendar;

import po.*;

public interface PromotionBLService {
	//
	public PromotionPO getPromotion();//�鿴��ǰ�Ĵ����ֶ�
    public ResultMessage setPromotion(double exchangeOfScore,int valueOfCoupons,double proportionOfCoupons,double discount);//���ô����ֶ�
    public ResultMessage setEquivalent(String vipLevel,int quantity,Calendar startDate,Calendar endDate);//���ô�Χ�����еȼ�ȯ�����͹���
    public ResultMessage setCoupon(String vipLevel,int quantity);//���ô�Χ�����д���ȯ�����͹���
   
}
