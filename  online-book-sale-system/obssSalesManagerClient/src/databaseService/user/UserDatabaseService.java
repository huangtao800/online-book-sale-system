//youjiaqi
package databaseService.user;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.PO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import databaseService.DatabaseService;

public interface UserDatabaseService extends DatabaseService{
	public UserPO isExisit(String userName,String password,UserRole userRole) throws RemoteException;
	public UserPO findUserThroughName(String name,UserRole userRole)throws RemoteException;
	
	public ArrayList<UserPO> getAllUser()throws RemoteException;
	public ResultMessage modify(UserPO beforeUserPO,UserPO after)throws RemoteException;
	public String autoGetUserId(UserRole userRole)throws RemoteException;
	
	public ArrayList<UserPO> getAdmin()throws RemoteException;
    public ArrayList<UserPO> getGeneralManager()throws RemoteException;
	public ArrayList<UserPO> getMember()throws RemoteException;
	public ArrayList<UserPO> getSalesManager()throws RemoteException;
	
	public ResultMessage writeAdmin(ArrayList<UserPO> arrayList)throws RemoteException;
	public ResultMessage writeMember(ArrayList<UserPO> arrayList)throws RemoteException;
	public ResultMessage writeSalesManager(ArrayList<UserPO> arrayList)throws RemoteException;
	public ResultMessage writeGeneralManager(ArrayList<UserPO> arrayList)throws RemoteException;
}
