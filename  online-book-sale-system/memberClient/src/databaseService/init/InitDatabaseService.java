package databaseService.init;

import java.rmi.RemoteException;

import po.MemberPO;
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
	
	public MemberPO registry(String name,String password,String address) throws RemoteException;
	public void saveMember() throws RemoteException;
}
