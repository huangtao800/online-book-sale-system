//黄涛
package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bussinessObject.Customer;

import databaseService.member.MemberDatabaseService;

import po.*;


public class Member {
	private MemberPO memberPO;
	private MemberDatabaseService memberDatabase;

	public Member(MemberPO memberPO) {
		this.memberPO = memberPO;
		try {
			memberDatabase=(MemberDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/MemberDatabase");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	//想收藏夹中添加图书
	public ResultMessage addFavorities(BookPO bookPO){
		Customer customer=new Customer(this.memberPO);
		ResultMessage resultMessage=customer.addFavority(bookPO);
		
		if(resultMessage==ResultMessage.FULL){
			return resultMessage;
		}
		
		try {
			return memberDatabase.update(this.memberPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	//从收藏夹中删除图书
	public ResultMessage removeFavorities(BookPO bookPO){
		Customer customer=new Customer(this.memberPO);
		ResultMessage resultMessage=customer.removeFavority(bookPO);
		
		if(resultMessage!=ResultMessage.SUCCEED){
			return resultMessage;
		}
		
		try {
			return memberDatabase.update(this.memberPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	

	public ResultMessage cancel(String password){
		if(!password.equals(memberPO.getUserPassword())){
			return ResultMessage.ERROR;		//密码输入错误
		}
		try {
			return memberDatabase.delete(memberPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	//返回持有的打折券列表
	public ArrayList<CouponPO> getCouponList(){
		return memberPO.getCouponList();
	}
	
	//返回持有的等价券列表
	public ArrayList<EquivalentPO> getEquivalentList(){
		return memberPO.getEquivalentList();
	}
	
	//增加一条订单记录
	public ResultMessage addOrder(OrderPO order){
		Customer customer=new Customer(this.memberPO);
		customer.addOrder(order);

		try {
			return memberDatabase.update(this.memberPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
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
