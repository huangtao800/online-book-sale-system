//����
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
	
	//���ղؼ������ͼ��
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
	
	//���ղؼ���ɾ��ͼ��
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
			return ResultMessage.FAILED;	//RMI�����쳣
		}
	}
	

	public ResultMessage cancel(String password){
		if(!password.equals(memberPO.getUserPassword())){
			return ResultMessage.ERROR;		//�����������
		}
		if(!checkIsOrderSigned()){
			return ResultMessage.NOTPREPARED;	//��δǩ�յĶ������ܾ�ע��
		}
		
		try {
			return memberDatabase.delete(memberPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
		}
	}
	
	//���˿����еĶ����Ƿ���ǩ��
	private boolean checkIsOrderSigned(){
		Customer customer=new Customer(this.memberPO);
		return customer.checkIsOrderSigned();
		
	}
	
	//���س��еĴ���ȯ�б�
	public ArrayList<CouponPO> getCouponList(){
		return memberPO.getCouponList();
	}
	
	//���س��еĵȼ�ȯ�б�
	public ArrayList<EquivalentPO> getEquivalentList(){
		return memberPO.getEquivalentList();
	}
	
	//����һ��������¼
	public ResultMessage addOrder(OrderPO order){
		Customer customer=new Customer(this.memberPO);
		customer.addOrder(order);

		try {
			return memberDatabase.update(this.memberPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
		}
	}
	
	public ArrayList<OrderPO> getOrderRecord(){
		return memberPO.getOrderList();
	}
	
	
}
