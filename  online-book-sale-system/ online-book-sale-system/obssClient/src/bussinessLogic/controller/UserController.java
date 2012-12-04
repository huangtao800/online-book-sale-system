package bussinessLogic.controller;

import java.io.Serializable;

import po.*;
import bussinessLogic.domain.User;
import bussinessLogicService.UserBLService;

public class UserController implements UserBLService,Serializable{
	   //用户界面获得用户信息
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
		
		//根据输入查找是否存在相应的user
		public UserPO login(String userName,String password,UserRole userRole){
				User user = new User();
				UserPO userPO = user.isExist(userName, password, userRole);
				return userPO;
		}
		
		//对用户的调整
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