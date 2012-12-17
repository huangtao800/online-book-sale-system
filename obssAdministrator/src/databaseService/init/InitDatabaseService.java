package databaseService.init;

import java.rmi.RemoteException;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import databaseService.DatabaseService;

public interface InitDatabaseService extends DatabaseService{
	public void initData() throws RemoteException;

	public UserPO logIn(String userName, String password, UserRole userRole)
			throws RemoteException;

	public ResultMessage updateUserPO(UserPO userPO, UserRole role)
			throws RemoteException; // 更新UserPO的信息
	

	public void saveMember() throws RemoteException;
}
