//黄涛
package databaseService.customer;

import java.rmi.RemoteException;


import po.BookPO;
import po.LineItemPO;
import po.CustomerPO;
import po.OrderState;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface CustomerDatabaseService extends DatabaseService{
//	public ResultMessage updateMember(MemberPO memberPO) throws RemoteException;
	public ResultMessage cancel(CustomerPO customerPO) throws RemoteException;
	public ResultMessage changeName(String newName,CustomerPO customerPO) throws RemoteException;
	public ResultMessage changePassword(String password,CustomerPO customerPO) throws RemoteException;
	
	//供销售经理使用
		public ResultMessage changeOrder(String memberID,long orderID,OrderState orderState) throws RemoteException;
		public CustomerPO searchMemberPO(String memberID) throws RemoteException;
		public ResultMessage addPoint(String memberID,double sum) throws RemoteException;
}
