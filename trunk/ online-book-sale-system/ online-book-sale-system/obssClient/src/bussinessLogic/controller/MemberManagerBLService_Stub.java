//黄涛
//Member模块中涉及销售经理的逻辑
package bussinessLogic.controller;

import java.util.ArrayList;

import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.OrderPO;
import po.ResultMessage;
import bussinessLogic.domain.*;
import bussinessLogicService.MemberManagerBLService;

public class MemberManagerBLService_Stub implements MemberManagerBLService{
	
	private MemberManager manager;
	
	public MemberManagerBLService_Stub(MemberManager manager){
		this.manager=manager;
	}
	
	
	@Override
	public ResultMessage addEquivalent(EquivalentPO e) {
		// TODO Auto-generated method stub
		return manager.addEquivalent(e);
	}
	
	@Override
	public ResultMessage addCoupon(CouponPO c) {
		// TODO Auto-generated method stub
		return manager.addCoupon(c);
	}

	@Override
	public ResultMessage changeOrder() {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCEED;
	}

	@Override
	public ArrayList<OrderPO> getOrderRecord(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberPO getInfo(String id) {
		// TODO Auto-generated method stub
		return manager.getInfo(id);
	}

}
