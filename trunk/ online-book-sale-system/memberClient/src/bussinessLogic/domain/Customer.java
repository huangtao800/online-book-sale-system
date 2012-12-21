//����
package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bussinessObject.CustomerBussiness;

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
	
	//���ղؼ������ͼ��
	public ResultMessage addFavorities(BookPO bookPO){
		CustomerBussiness customerBussiness=new CustomerBussiness(this.customerPO);
		ResultMessage resultMessage=customerBussiness.addFavority(bookPO);
		
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
	
	//���ղؼ���ɾ��ͼ��
	public ResultMessage removeFavorities(BookPO bookPO){
		CustomerBussiness customerBussiness=new CustomerBussiness(this.customerPO);
		ResultMessage resultMessage=customerBussiness.removeFavority(bookPO);
		
		if(resultMessage!=ResultMessage.SUCCEED){
			return resultMessage;
		}
		
		try {
			return memberDatabase.update(this.customerPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
		}
	}
	

	public ResultMessage cancel(String password){
		if(!password.equals(customerPO.getUserPassword())){
			return ResultMessage.ERROR;		//�����������
		}
		if(!checkIsOrderSigned()){
			return ResultMessage.NOTPREPARED;	//��δǩ�յĶ������ܾ�ע��
		}
		
		try {
			return memberDatabase.delete(customerPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
		}
	}
	
	//���˿����еĶ����Ƿ���ǩ��
	private boolean checkIsOrderSigned(){
		CustomerBussiness customerBussiness=new CustomerBussiness(this.customerPO);
		return customerBussiness.checkIsOrderSigned();
		
	}
	
	//���س��еĴ���ȯ�б�
	public ArrayList<CouponPO> getCouponList(){
		return customerPO.getCouponList();
	}
	
	//���س��еĵȼ�ȯ�б�
	public ArrayList<EquivalentPO> getEquivalentList(){
		return customerPO.getEquivalentList();
	}
	
	//����һ��������¼
	public ResultMessage addOrder(OrderPO order){
		CustomerBussiness customerBussiness=new CustomerBussiness(this.customerPO);
		customerBussiness.addOrder(order);

		try {
			return memberDatabase.update(this.customerPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
		}
	}
	
	public ArrayList<OrderPO> getOrderRecord(){
		return customerPO.getOrderList();
	}
	
	public ResultMessage changeName(String newName){
		if(newName.equals(customerPO.getUserName())){
			return ResultMessage.SUCCEED;
		}else {
			customerPO.setUserName(newName);
			try {
				return memberDatabase.update(customerPO);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return ResultMessage.FAILED;	//RMI�����쳣
			}
		}
	}
	
	public ResultMessage changePassword(String password){
		try {
			customerPO.setUserPassword(password);
			return memberDatabase.update(customerPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
		}
	}
	
	public ResultMessage putInCart(LineItemPO lineItemPO){
		customerPO.getCart().putInCart(lineItemPO);
		try {
			return memberDatabase.update(customerPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
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

	public String getAddress() {
		// TODO Auto-generated method stub
		return customerPO.getAddress();
	}

	public ResultMessage changeAddress(String newAddress) {
		// TODO Auto-generated method stub
		customerPO.setAddress(newAddress);
		try {
			return memberDatabase.update(customerPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}

	public ResultMessage clearCart() {
		// TODO Auto-generated method stub
		customerPO.getCart().clear();
		try {
			return memberDatabase.update(customerPO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}

	public CustomerPO freshMemberPO(String memberID) {
		// TODO Auto-generated method stub
		try {
			CustomerPO newMemberPO= memberDatabase.freshMemberPO(memberID);
			this.customerPO=newMemberPO;
			return newMemberPO;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public ResultMessage changeLineItemNumber(int index, int newNumber) {
		// TODO Auto-generated method stub
		CustomerBussiness customerBussiness=new CustomerBussiness(customerPO);
		try {
			memberDatabase.update(customerPO);
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}


}
