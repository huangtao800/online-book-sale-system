package bussinessLogic.controller;
//尤佳琪

import java.io.Serializable;

import po.*;
import bussinessLogic.domain.User;
import bussinessLogicService.UserBLService;

public class UserController implements UserBLService, Serializable {
	private static UserController userController;
	private User user;

	public static UserController getInstance(){
		if(userController==null){
			userController=new UserController();
			return userController;
		}else{
			return userController;
		}
	}

	

	// 对用户的调整(增加，删除，修改)
	public void addUser(String userName, String id, String password,
			UserRole userRole) {
		UserPO userPO = new UserPO(userName,id,password,userRole);
		user.addUser(userPO,userRole);
		
	}

	public ResultMessage deleteUser(String id) {
		return user.deleteUser(id);
	}
	
	//查找用户通过id 或者name
	public UserPO findUser(String id,String name){
		
		if(id.equals(" ")){
			return user.findUserThroughName(name);
		}else{
			return user.findUserThroughID(id);
		}
	}
	
	//顾客，总经理，销售经理（密码） , 管理员
	public ResultMessage changeUser(String userName, String id,
			String password, UserRole userRole) {
		UserPO userPO = new UserPO(userName,id,password,userRole);
		return user.changeUser(userPO,id);
	}

	public ResultMessage findChangingUser(String id) {
		if (id == "11111") {
			return ResultMessage.SUCCEED;
		} else {
			return ResultMessage.FAILED;
		}
	}

	

}