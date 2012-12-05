package databaseService.init;

import java.rmi.RemoteException;

import po.UserPO;
import po.UserRole;

import databaseService.DatabaseService;

public interface InitDatabaseService extends DatabaseService{
	public void initAllUser() throws RemoteException;
	public UserPO logIn(String userName, String password, UserRole userRole) throws RemoteException;
}
