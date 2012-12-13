//黄涛
package databaseService.member;

import java.rmi.RemoteException;


import po.BookPO;
import po.LineItemPO;
import po.MemberPO;
import po.OrderState;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface MemberDatabaseService extends DatabaseService{
	public ResultMessage changeName(String newName,MemberPO memberPO) throws RemoteException;
	public ResultMessage changePassword(String password,MemberPO memberPO) throws RemoteException;
	
	//供销售经理使用
	public ResultMessage changeOrder(String memberID,long orderID,OrderState orderState) throws RemoteException;
	public MemberPO searchMemberPO(String memberID) throws RemoteException;
	public ResultMessage addPoint(String memberID,double sum) throws RemoteException;
}
