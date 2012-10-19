//黄涛
package bussinessLogic.domain;

import po.*;

public class Member {
	private MemberPO memberPO;

	public Member(MemberPO memberPO) {
		this.memberPO = memberPO;
	}

	public ResultMessage addFavorities() {
		return ResultMessage.SUCCEED;
	}

	public ResultMessage addEquivalent(String id) {
		return ResultMessage.SUCCEED;
	}
	
	//修改订单状态
	//目前尚缺少状态类！！！！
	public ResultMessage setOrderState(OrderPO orderPO,OrderState state){
		return ResultMessage.SUCCEED;
	}


	// 修改订单状态
	// 目前尚缺少状态！！！！
	/*张雅婷————我觉得，虽然setOrderState是order的功能，当需要修改时，
	   只用调用order的setOrderState方法就够了,member类不用提供这个方法   */
//	public ResultMessage setOrderState(OrderPO orderPO) {
//>>>>>>> .r132
//		return ResultMessage.SUCCEED;
//	}
}
