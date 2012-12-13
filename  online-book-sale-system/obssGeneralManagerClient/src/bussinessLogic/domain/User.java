package bussinessLogic.domain;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import databaseService.user.UserDatabaseService;
import po.*;

//尤佳琪
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

	//系统管理员管理用户（增，删，改）
	public ResultMessage addUser(UserPO userPO,UserRole userRole){
		try{
			return userDatabase.insert(userPO);
		}catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
		
	}
	
	//系统管理员删除用户
	public ResultMessage deleteUser(String name,UserRole userRole) {
		UserPO userPO = user.findUserThroughName(name,userRole);
		try{
			return userDatabase.delete(userPO);
		}catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	//系统管理员 修改用户信息
	public ResultMessage changeUser(UserPO u,String name){
        UserPO userPO = user.findUserThroughName(name,u.getUserRole());
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

}
