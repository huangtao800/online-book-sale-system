package bussinessLogic.domain;

import java.util.ArrayList;

import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;

public class MemberManager {

	public ResultMessage addEquivalent(EquivalentPO e) {
		return ResultMessage.SUCCEED;
	}

	public ResultMessage addCoupon(CouponPO c){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage setOrderState(OrderPO orderPO,OrderState state){
		return ResultMessage.SUCCEED;
	}
	
	public MemberPO getInfo(String id){
		return new MemberPO("111111", "huang","111111");
	}
	
	public ResultMessage changeOrder(int orderNumber,OrderState state){
		return ResultMessage.SUCCEED;
	}
	
	public ArrayList<OrderPO> getOrderRecord(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
