package databaseService.init;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.MemberPO;
import po.PresentPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;

import databaseService.DatabaseService;

public interface InitDatabaseService extends Remote {
	public void initAllUser() throws RemoteException;

	public UserPO logIn(String userName, String password, UserRole userRole)
			throws RemoteException;

	public ResultMessage updateUserPO(UserPO userPO, UserRole role)
			throws RemoteException; // ����UserPO����Ϣ
	
	public MemberPO registry(String name,String password,String address) throws RemoteException;
	

    public ArrayList<PresentPO> getPresentPOList();//���ʹ�
    public ResultMessage sendPresent();
}
