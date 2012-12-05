//黄涛
package bussinessLogic.domain;

import java.util.ArrayList;

import po.*;


public class Member {
//	private MemberPO memberPO;

	public Member() {
//		this.memberPO = memberPO;
	}

	public ResultMessage addFavorities(BookPO bookPO,String memberID){
		
		return null;
	}
	
	
	public ResultMessage addFavorities(String id){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage removeFavorities(String id){
		return ResultMessage.SUCCEED;
	}
	
	
	
	public ResultMessage register(String name,String password){
		return ResultMessage.SUCCEED;
	}
	
	
	public ResultMessage cancel(String id,String password){
		return ResultMessage.SUCCEED;
	}
	
	//返回持有的打折券列表
	public ArrayList<CouponPO> getCouponList(){
		return null;
	}
	
	//返回持有的等价券列表
	public ArrayList<EquivalentPO> getEquivalentList(){
		return null;
	}
	
	//增加一条订单记录
	public ResultMessage addOrder(OrderPO order){
		return ResultMessage.SUCCEED;
	}
	
	//修改订单状态
	//目前尚缺少状态类！！！！



	// 修改订单状态
	// 目前尚缺少状态！！！！
	/*张雅婷————我觉得，虽然setOrderState是order的功能，当需要修改时，
	   只用调用order的setOrderState方法就够了,member类不用提供这个方法   */
//	public ResultMessage setOrderState(OrderPO orderPO) {
//>>>>>>> .r132
//		return ResultMessage.SUCCEED;
//	}
}
