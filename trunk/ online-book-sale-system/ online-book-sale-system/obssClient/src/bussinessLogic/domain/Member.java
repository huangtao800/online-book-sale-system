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

	public String getMemberName(){
		return memberPO.getUserName();
	}
	
	public String getMemberID(){
		return memberPO.getUserID();
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
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	

	public ResultMessage cancel(String password){
		if(!password.equals(memberPO.getUserPassword())){
			return ResultMessage.ERROR;		//密码输入错误
		}
		if(!checkIsOrderSigned()){
			return ResultMessage.NOTPREPARED;	//有未签收的订单，拒绝注销
		}
		
		try {
			return memberDatabase.delete(memberPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	//检查顾客所有的订单是否都已签收
	private boolean checkIsOrderSigned(){
		Customer customer=new Customer(this.memberPO);
		return customer.checkIsOrderSigned();
		
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
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	public ArrayList<OrderPO> getOrderRecord(){
		return memberPO.getOrderList();
	}
	
	public ResultMessage changeName(String newName){
		if(newName.equals(memberPO.getUserName())){
			return ResultMessage.SUCCEED;
		}else {
			try {
				return memberDatabase.changeName(newName,memberPO);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return ResultMessage.FAILED;	//RMI出现异常
			}
		}
	}
	
	public ResultMessage changePassword(String password){
		try {
			return memberDatabase.changePassword(password, memberPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	public ResultMessage putInCart(LineItemPO lineItemPO){
		memberPO.getCart().putInCart(lineItemPO);
		try {
			return memberDatabase.update(memberPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	public ResultMessage removeFromCart(int index){
		memberPO.getCart().removeFromCart(index);
		
		try {
			return memberDatabase.update(memberPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	public ResultMessage deleteEquivalenet(EquivalentPO equivalentPO){
		int index=searchEquivalentIndex(equivalentPO);
		if(index==-1){
			return ResultMessage.NOTEXIST;
		}
		
		memberPO.getEquivalentList().remove(index);
		try {
			return memberDatabase.update(memberPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	public ResultMessage deleteCoupon(CouponPO couponPO){
		int index=searchCoupon(couponPO);
		if(index==-1){
			return ResultMessage.NOTEXIST;
		}
		
		memberPO.getCouponList().remove(index);
		try {
			return memberDatabase.update(memberPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	private int searchCoupon(CouponPO couponPO){
		for(int i=0;i<memberPO.getCouponList().size();i++){
			if(couponPO.getID()==memberPO.getCouponList().get(i).getID()){
				return i;
			}
		}
		
		return -1;
	}
	
	private int searchEquivalentIndex(EquivalentPO equivalentPO){
		for(int i=0;i<memberPO.getEquivalentList().size();i++){
			if(equivalentPO.getID()==memberPO.getEquivalentList().get(i).getID()){
				return i;
			}
		}
		return -1;
	}


}
