package bussinessLogic.controller;

import po.ResultMessage;

public class UserController {
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
