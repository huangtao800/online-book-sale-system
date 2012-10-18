package bussinessLogic.controller;

import po.ResultMessage;
import bussinessLogicService.UserBLService;

public class UserBLService_Stub implements UserBLService{
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
		public ResultMessage login(String id,String password){
			if((id=="00001")&&(password=="123456")){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
		
		//���û��ĵ���
		public ResultMessage addUser(String id,String name,String identity,String password){
			if(id=="00001"){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
		
		public ResultMessage deleteUser(String id){
			if(id=="00001"){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
		
		public ResultMessage findChangingUser(String id){
			if(id=="00001"){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
		
		public ResultMessage changeUser(String id, String name,String identity,String password){
			if(id=="00001"){
				return ResultMessage.SUCCEED;
			}else{
				return ResultMessage.FAILED;
			}
		}
}
