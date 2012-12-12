//����
package databaseService.member;

import java.rmi.RemoteException;


import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;
import po.VIPRank;
import databaseService.DatabaseService;

public interface MemberDatabaseService extends DatabaseService {
	public ResultMessage cancel(MemberPO memberPO) throws RemoteException;
	public ResultMessage changeName(String newName,MemberPO memberPO) throws RemoteException;
	public ResultMessage changePassword(String password,MemberPO memberPO) throws RemoteException;
	
	//�����۾���ʹ��
	public ResultMessage changeOrder(String memberID,long orderID,OrderState orderState) throws RemoteException;
	public MemberPO searchMemberPO(String memberID) throws RemoteException;
	public ResultMessage addPoint(String memberID,double sum) throws RemoteException;
}
