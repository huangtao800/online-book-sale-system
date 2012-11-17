package bussinessLogic.domain;

import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.UserPO;

//尤佳琪
public class User implements UserBLService{
    String userName,userPassword,userID;
	
    public User(String name,String password,String id){
    	userName=name;
    	userPassword=password;
    	userID=id;
    }
    
    //用户界面获得用户信息
 	public String getUserName(int id){
		return userName;
	}
	
	public String getUserId(){
		return userID;
	}
	
	public String getUserPassword(int id){
		return userPassword;
	}
	
	//根据输入查找是否存在相应的user
	public ResultMessage login(String id,String password){
		if((id=="11111")&&(password=="123456")){
			return ResultMessage.SUCCEED;
		}else{
			return ResultMessage.FAILED;
		}
	}
	
	//对用户的调整
	public ResultMessage addUser(String id,String name,String identity,String password){
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
	
	public ResultMessage changeUser(String id, String name,String identity,String password){
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
	
}
