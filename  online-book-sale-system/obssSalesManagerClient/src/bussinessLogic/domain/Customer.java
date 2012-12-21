//黄涛
package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bussinessObject.CustomerBusiness;

import databaseService.customer.CustomerDatabaseService;

import po.*;


public class Customer {
	private CustomerPO customerPO;
	private CustomerDatabaseService memberDatabase;

	public Customer(CustomerPO customerPO) {
		this.customerPO = customerPO;
		try {
			memberDatabase=(CustomerDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/MemberDatabase");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public String getMemberName(){
		return customerPO.getUserName();
	}
	
	public String getMemberID(){
		return customerPO.getUserID();
	}
	
	//想收藏夹中添加图书
	public ResultMessage addFavorities(BookPO bookPO){
		CustomerBusiness customerBusiness=new CustomerBusiness(this.customerPO);
		ResultMessage resultMessage=customerBusiness.addFavority(bookPO);
		
		if(resultMessage==ResultMessage.FULL){
			return resultMessage;
		}
		
		try {
			return memberDatabase.update(this.customerPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	//从收藏夹中删除图书
	public ResultMessage removeFavorities(BookPO bookPO){
		CustomerBusiness customerBusiness=new CustomerBusiness(this.customerPO);
		ResultMessage resultMessage=customerBusiness.removeFavority(bookPO);
		
		if(resultMessage!=ResultMessage.SUCCEED){
			return resultMessage;
		}
		
		try {
			return memberDatabase.update(this.customerPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	

	public ResultMessage cancel(String password){
		if(!password.equals(customerPO.getUserPassword())){
			return ResultMessage.ERROR;		//密码输入错误
		}
		if(!checkIsOrderSigned()){
			return ResultMessage.NOTPREPARED;	//有未签收的订单，拒绝注销
		}
		
		try {
			return memberDatabase.delete(customerPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	//检查顾客所有的订单是否都已签收
	private boolean checkIsOrderSigned(){
		CustomerBusiness customerBusiness=new CustomerBusiness(this.customerPO);
		return customerBusiness.checkIsOrderSigned();
		
	}
	
	//返回持有的打折券列表
	public ArrayList<CouponPO> getCouponList(){
		return customerPO.getCouponList();
	}
	
	//返回持有的等价券列表
	public ArrayList<EquivalentPO> getEquivalentList(){
		return customerPO.getEquivalentList();
	}
	
	//增加一条订单记录
	public ResultMessage addOrder(OrderPO order){
		CustomerBusiness customerBusiness=new CustomerBusiness(this.customerPO);
		customerBusiness.addOrder(order);

		try {
			return memberDatabase.update(this.customerPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	public ArrayList<OrderPO> getOrderRecord(){
		return customerPO.getOrderList();
	}
	
	public ResultMessage changeName(String newName){
		if(newName.equals(customerPO.getUserName())){
			return ResultMessage.SUCCEED;
		}else {
			try {
				return memberDatabase.changeName(newName,customerPO);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return ResultMessage.FAILED;	//RMI出现异常
			}
		}
	}
	
	public ResultMessage changePassword(String password){
		try {
			return memberDatabase.changePassword(password, customerPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	public ResultMessage putInCart(LineItemPO lineItemPO){
		customerPO.getCart().putInCart(lineItemPO);
		try {
			return memberDatabase.update(customerPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	public ResultMessage removeFromCart(int index){
		customerPO.getCart().removeFromCart(index);
		
		try {
			return memberDatabase.update(customerPO);
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
		
		customerPO.getEquivalentList().remove(index);
		try {
			return memberDatabase.update(customerPO);
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
		
		customerPO.getCouponList().remove(index);
		try {
			return memberDatabase.update(customerPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	private int searchCoupon(CouponPO couponPO){
		for(int i=0;i<customerPO.getCouponList().size();i++){
			if(couponPO.getID()==customerPO.getCouponList().get(i).getID()){
				return i;
			}
		}
		
		return -1;
	}
	
	private int searchEquivalentIndex(EquivalentPO equivalentPO){
		for(int i=0;i<customerPO.getEquivalentList().size();i++){
			if(equivalentPO.getID()==customerPO.getEquivalentList().get(i).getID()){
				return i;
			}
		}
		return -1;
	}

	public ArrayList<LineItemPO> getCartList() {
		// TODO Auto-generated method stub
		return customerPO.getCart().getCartList();
	}


}
