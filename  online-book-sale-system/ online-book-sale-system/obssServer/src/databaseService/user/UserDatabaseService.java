package databaseService.user;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.AdministratorPO;
import po.CustomerPO;
import po.GeneralManagerPO;
import po.PO;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import databaseService.DatabaseService;

public interface UserDatabaseService extends DatabaseService{
	
	public UserPO findUserThroughName(String name,UserRole userRole)throws RemoteException;
	
	public ArrayList<UserPO> getAllUser()throws RemoteException;
	public ResultMessage modify(UserPO beforeUserPO,UserPO after)throws RemoteException;
	public String autoGetUserId(UserRole userRole)throws RemoteException;
	

}
