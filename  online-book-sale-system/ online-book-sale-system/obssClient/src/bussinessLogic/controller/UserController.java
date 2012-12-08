package bussinessLogic.controller;
//�ȼ���

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

	

	// ���û��ĵ���(���ӣ�ɾ�����޸�)
	public void addUser(String userName, String id, String password,
			UserRole userRole) {
		UserPO userPO = new UserPO(userName,id,password,userRole);
		user.addUser(userPO,userRole);
		
	}

	public ResultMessage deleteUser(String id) {
		return user.deleteUser(id);
	}
	
	//�˿ͣ��ܾ������۾������룩 , ����Ա
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