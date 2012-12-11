package bussinessLogic.domain;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import databaseService.user.UserDatabaseService;
import po.*;

//�ȼ���
public class User {
	private User user;
	private UserDatabaseService userDatabase;
	
	public User(){
		try {
			userDatabase = (UserDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/UserDatabase");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//ϵͳ����Ա�����û�������ɾ���ģ�
	public ResultMessage addUser(UserPO userPO,UserRole userRole){
		try{
			return userDatabase.insert(userPO);
		}catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
		
	}
	
	//ɾ���û�
	public ResultMessage deleteUser(String id) {
		UserPO userPO = user.findUserThroughID(id);
		try{
			return userDatabase.delete(userPO);
		}catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	//�޸��û���Ϣ
	public ResultMessage changeUser(UserPO u,String id){
        UserPO userPO = user.findUserThroughID(id);
        try{
			return userDatabase.update(userPO);
		}catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
		
	}
	
	public UserPO findUserThroughName(String name){
		UserPO userPO = null;
		try{
		     userPO = userDatabase.findUserThroughName(name);
		     return userPO;
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return userPO;
	}
	
	public UserPO findUserThroughID(String id){
		UserPO userPO = null;
		try{
		     userPO = userDatabase.findUserThroughID(id);
		     return userPO;
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return userPO;
	}

}
