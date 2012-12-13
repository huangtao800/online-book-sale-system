package bussinessLogic.controller;
//�ȼ���

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

	

	// ���û��ĵ���(���ӣ�ɾ�����޸�)
	public ResultMessage addUser(String userName, String id, String password,
			UserRole userRole) {
		UserPO userPO = new UserPO(userName,id,password,userRole,true);
		return user.addUser(userPO,userRole);
		
	}

	public ResultMessage deleteUser(String id,UserRole userRole) {
		return user.deleteUser(id,userRole);
	}
	
	//�����û�ͨ��name
	public UserPO findUser(String name){
            return user.findUserThroughName(name,UserRole.Member);
	}
	
	//�˿ͣ��ܾ������۾������룩 , ����Ա
	public ResultMessage changeUser(String userName, String id,
			String password, UserRole userRole) {
		UserPO userPO = findUser(id);
		return user.changeUser(userPO,id);
	}

	public ResultMessage findChangingUser(String id) {
		return ResultMessage.SUCCEED;
	}

	

}