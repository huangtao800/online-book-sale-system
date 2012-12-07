//»ÆÌÎ
package databaseService.member;

import java.rmi.RemoteException;

import po.BookPO;
import po.MemberPO;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface MemberDatabaseService extends DatabaseService{
//	public ResultMessage updateMember(MemberPO memberPO) throws RemoteException;
	public ResultMessage cancel(MemberPO memberPO) throws RemoteException;
}
