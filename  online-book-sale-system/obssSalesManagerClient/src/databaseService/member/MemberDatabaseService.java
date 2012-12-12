//黄涛
package databaseService.member;

import java.rmi.RemoteException;


import po.BookPO;
import po.LineItemPO;
import po.MemberPO;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface MemberDatabaseService extends DatabaseService{
//	public ResultMessage updateMember(MemberPO memberPO) throws RemoteException;
	public ResultMessage cancel(MemberPO memberPO) throws RemoteException;
	public ResultMessage changeName(String newName,MemberPO memberPO) throws RemoteException;
	public ResultMessage changePassword(String password,MemberPO memberPO) throws RemoteException;
	
	//供销售经理使用
	public MemberPO searchMemberPO(String memberID) throws RemoteException;
}
