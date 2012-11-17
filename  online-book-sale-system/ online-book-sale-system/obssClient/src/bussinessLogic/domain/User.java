package bussinessLogic.domain;

import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.UserPO;

//�ȼ���
public class User implements UserBLService{
    String userName,userPassword,userID;
	
    public User(String name,String password,String id){
    	userName=name;
    	userPassword=password;
    	userID=id;
    }
    
    //�û��������û���Ϣ
 	public String getUserName(int id){
		return userName;
	}
	
	public String getUserId(){
		return userID;
	}
	
	public String getUserPassword(int id){
		return userPassword;
	}
	
	//������������Ƿ������Ӧ��user
	public ResultMessage login(String id,String password){
		if((id=="11111")&&(password=="123456")){
			return ResultMessage.SUCCEED;
		}else{
			return ResultMessage.FAILED;
		}
	}
	
	//���û��ĵ���
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
