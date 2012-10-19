package bussinessLogic.domain;

import po.ResultMessage;
import po.UserPO;

//ÓÈ¼Ñç÷
public class User {
     UserPO userPO = new UserPO();
     
     public User(UserPO u){
    	 userPO = u;
     }
     
     public ResultMessage login(String id,String password){
    	 return ResultMessage.SUCCEED;
     }
 	
 	public ResultMessage addUser(String id,String name,String identity,String password){
 		return ResultMessage.SUCCEED;
 	}
 	
 	public ResultMessage deleteUser(String id){
 		return ResultMessage.SUCCEED;
 	}
 	
 	public ResultMessage findChangingUser(String id){
 		return ResultMessage.SUCCEED;
 	}
 	
 	public ResultMessage changeUser(String id, String name,String identity,String password){
 		return ResultMessage.SUCCEED;
 	}
}
