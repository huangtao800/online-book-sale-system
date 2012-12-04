package bussinessLogic.controller;
//�ȼ���
import po.*;
import po.ResultMessage;
import bussinessLogicService.UserBLService;

public class UserBLService_Stub {
    String userName,userPassword,userID;
	
    public UserBLService_Stub(String name,String password,String id){
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
		public PO login(String id,String password,UserRole userRole){
			PO po = new UserPO();
			if((id=="11111")&&(password=="123456")){
				return po;
			}else{
				return po;
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