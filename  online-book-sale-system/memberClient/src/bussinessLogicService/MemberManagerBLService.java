//黄涛
//Member模块中涉及顾客自身的接口
package bussinessLogicService;

import java.util.ArrayList;

import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;

public interface MemberManagerBLService {
	
	public ResultMessage addEquivalent(EquivalentPO e);//添加等价券
	public ResultMessage addCoupon(CouponPO c);//添加打折券

	public ResultMessage changeOrder(int orderNumber,OrderState state);//修改订单状态
	
	public ArrayList<OrderPO> getOrderRecord(String id);//查看特定购买记录
	public MemberPO getInfo(String id);//查看特定会员信息

}
