package databaseService.user;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.UserPO;
import po.UserRole;
import databaseService.DatabaseService;

public interface UserDatabaseService extends DatabaseService{
	public UserPO isExisit(String userName,String password,UserRole userRole) throws RemoteException;
	public UserPO findUserThroughName(String name,UserRole userRole) throws RemoteException;
	
}
