package bussinessLogic.controller;
//尤佳琪

import java.io.Serializable;

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
		UserPO userPO = new UserPO(userName,id,password,userRole);
		return user.addUser(userPO,userRole);
		
	}

	public ResultMessage deleteUser(String id,UserRole userRole) {
		return user.deleteUser(id,userRole);
	}
	
	//查找用户通过name
	public UserPO findUser(String name){
            return user.findUserThroughName(name,UserRole.Member);
	}
	
	//顾客，总经理，销售经理（密码） , 管理员
	public ResultMessage changeUser(String userName, String id,
			String password, UserRole userRole) {
		UserPO userPO = findUser(id);
		return user.changeUser(userPO,id);
	}

	public ResultMessage findChangingUser(String id) {
		return ResultMessage.SUCCEED;
	}

	

}