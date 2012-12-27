package bussinessLogic.domain;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import databaseService.user.UserDatabaseService;
import po.*;

//�ȼ���
public class User {
	
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
	
	//ϵͳ����Աɾ���û�
	public ResultMessage deleteUser(UserPO userPO,UserRole userRole) {
		
		try{
			return userDatabase.delete(userPO);
		}catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	//ϵͳ����Ա �޸��û���Ϣ
	public ResultMessage changeUser(UserPO beforeUserPO,UserPO afterUserPO){
       
        try{
			return userDatabase.modify(beforeUserPO, afterUserPO);
		}catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
		
	}
	
	public ResultMessage changePassword(UserPO userPO){
	       
        try{
			return userDatabase.update(userPO);
		}catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
		
	}
	
	
	public  UserPO findUserThroughName(String name,UserRole userRole){
		UserPO userPO = null;
		try{
		     userPO = userDatabase.findUserThroughName(name,userRole);
		     return userPO;
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return userPO;
	}
	
	
	
	public ArrayList<UserPO> getAllUser(){
		ArrayList<UserPO> userList = new ArrayList<>();
		try{
		     userList = userDatabase.getAllUser();
		     
		}catch (RemoteException e) {
			e.printStackTrace();
		}
		return userList;
		
	}
	
	
	
	public String autoGetUserId(UserRole userRole) {
		try{
	       return userDatabase.autoGetUserId(userRole);
		     
		}catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

}
