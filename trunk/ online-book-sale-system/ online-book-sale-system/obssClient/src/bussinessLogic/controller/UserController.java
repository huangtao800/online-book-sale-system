package bussinessLogic.controller;

import java.io.Serializable;

import po.*;
import bussinessLogic.domain.User;
import bussinessLogicService.UserBLService;

public class UserController implements UserBLService,Serializable{
	   //�û��������û���Ϣ
		public String getUserName(String id){
			return id;
		}
		
		public String getUserId(String id){
			return id;
		}
		
		public String getUserPassword(String id){
			return id;
		}
		
		public UserRole getUserRole(String id){
			return UserRole.Member;
		}
		
		//������������Ƿ������Ӧ��user
		public UserPO login(String userName,String password,UserRole userRole){
				User user = new User();
				UserPO userPO = user.isExist(userName, password, userRole);
				return userPO;
		}
		
		//���û��ĵ���
		public ResultMessage addUser(String userName,String id,String password,UserRole userRole){
			if(id=="11111"){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
		
		public ResultMessage deleteUser(String id){
			if(id=="11111"){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
		
		public ResultMessage findChangingUser(String id){
			if(id=="11111"){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
		
		public ResultMessage changeUser(String userName, String id,String password,UserRole userRole){
			if(id=="11111"){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
	
	
}