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
		UserPO userPO = new UserPO(userName,id,password,userRole);
		return user.addUser(userPO,userRole);
		
	}

	public ResultMessage deleteUser(String id) {
		return user.deleteUser(id);
	}
	
	//�����û�ͨ��id ����name
	public UserPO findUser(String id,String name){
		
		if(id.equals(" ")){
			return user.findUserThroughName(name);
		}else{
			return user.findUserThroughID(id);
		}
	}
	
	//�˿ͣ��ܾ������۾������룩 , ����Ա
	public ResultMessage changeUser(String userName, String id,
			String password, UserRole userRole) {
		UserPO userPO = new UserPO(userName,id,password,userRole);
		return user.changeUser(userPO,id);
	}

	public ResultMessage findChangingUser(String id) {
		
	}

	

}