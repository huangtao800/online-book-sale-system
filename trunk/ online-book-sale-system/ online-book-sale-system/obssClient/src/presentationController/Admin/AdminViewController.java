package presentationController.Admin;

import bussinessLogic.controller.UserController;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public class AdminViewController implements AdminViewService{
	UserController userController = UserController.getInstance();
	
    public void add(String userName,String userID,String userPassword,UserRole userRole){
           userController.addUser(userName, userID, userPassword, userRole);	
    }
    
    public UserPO search(String id,String name){
    	UserPO userPO =  userController.findUser(id, name);
        return userPO;
    }
    
    public ResultMessage change(String userName,String userID,String userPassword,UserRole userRole){
    	return userController.changeUser(userName, userID, userPassword, userRole);
    }
    
}
