//youjiaqi
package databaseService.user;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
	public UserPO isExisit(String userName,String password,UserRole userRole) throws RemoteException;
	public UserPO findUserThroughName(String name,UserRole userRole)throws RemoteException;
	
	public ArrayList<UserPO> getAllUser()throws RemoteException;
	public ResultMessage modify(UserPO beforeUserPO,UserPO after)throws RemoteException;
	public String autoGetUserId(UserRole userRole)throws RemoteException;
	

	public ArrayList<AdministratorPO> getAdmin()throws RemoteException;
    public ArrayList<GeneralManagerPO> getGeneralManager()throws RemoteException;
	public ArrayList<CustomerPO> getMember()throws RemoteException;
	public ArrayList<SalesManagerPO> getSalesManager()throws RemoteException;

	
	
	public ResultMessage writeAdmin(ArrayList<UserPO> arrayList)throws RemoteException;
	public ResultMessage writeMember(ArrayList<UserPO> arrayList)throws RemoteException;
	public ResultMessage writeSalesManager(ArrayList<UserPO> arrayList)throws RemoteException;
	public ResultMessage writeGeneralManager(ArrayList<UserPO> arrayList)throws RemoteException;
}
