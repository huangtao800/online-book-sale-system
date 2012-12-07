package databaseService.init;

import java.rmi.RemoteException;

import po.MemberPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import databaseService.DatabaseService;

public interface InitDatabaseService extends DatabaseService{
	public void initAllUser() throws RemoteException;
	public UserPO logIn(String userName, String password, UserRole userRole) throws RemoteException;
	public MemberPO registry(String name,String password) throws RemoteException;
}
