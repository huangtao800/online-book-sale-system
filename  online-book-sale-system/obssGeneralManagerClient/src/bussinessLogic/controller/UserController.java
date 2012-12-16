package bussinessLogic.controller;
//尤佳琪

import java.io.Serializable;
import java.util.ArrayList;

import po.*;
import bussinessLogic.domain.User;
import bussinessLogicService.UserBLService;

public class UserController implements UserBLService, Serializable {
	private static UserController uniqueInstance;
	private User user;
	
	private UserController(){
		user = new User();
	}

	public static UserController getInstance(){
		if(uniqueInstance==null){
			uniqueInstance = new UserController();
		}

		return uniqueInstance;
	}

	

	// 对用户的调整(增加，删除，修改)
	public ResultMessage addUser(String userName, String id, String password,
			UserRole userRole) {
		UserPO userPO = new UserPO(id,userName,password,userRole);
		return user.addUser(userPO,userRole);
		
	}

	public ResultMessage deleteUser(UserPO userPO,UserRole userRole) {
		return user.deleteUser(userPO,userRole);
	}
	
	//查找用户通过name
	public UserPO findUser(String name,UserRole userRole){
            return user.findUserThroughName(name,userRole);
	}
	
	//顾客，总经理，销售经理（密码） , 管理员
	public ResultMessage changeUser(UserPO beforeUserPO,UserPO afterUserPO) {
	      return user.changeUser(beforeUserPO, afterUserPO);
	}

	public ArrayList<UserPO> getAllUser(){
		return user.getAllUser();
	}
	
	 public ResultMessage changePassword(String name,String beforePassword,String afterPassword,UserRole userRole){
		 return user.changePassword(name, beforePassword, afterPassword, userRole);
	 }

	

}