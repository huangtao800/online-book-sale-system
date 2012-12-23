package presentationController.Admin;

import java.util.ArrayList;
import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.AdminView;

public class AdminViewController implements AdminViewService{
	 private static AdminViewService uniqueInstance;
	 private static UserBLService userController;
	 private AdminView adminView;
	 
	 private AdminViewController (){
		 userController = UserController.getInstance();
	
	 }
	 
	
	 public static AdminViewService getInstance(){
		 if(userController==null){
			 uniqueInstance = new AdminViewController();
		 }
		 
		 return uniqueInstance;
	 }

	 public void init(int index){
		 adminView = new AdminView(index);
		 adminView.setVisible(true);
	 }
	
     public ResultMessage add(String userName,String userID,String userPassword,UserRole userRole){
           ResultMessage result = userController.addUser(userName, userID, userPassword, userRole);	
           return result;
     }
    
    
     public ResultMessage change(UserPO beforeUserPO,UserPO afterUserPO){
    	return userController.changeUser(beforeUserPO,afterUserPO);
     }
     
     public ResultMessage update(UserPO userPO){
    	 return userController.update(userPO);
     }
     
     public ResultMessage delete(UserPO userPO,UserRole userRole){
    	 return userController.deleteUser(userPO, userRole);
     }
     
     
 	 public UserPO findUser(String name,UserRole userRole){
 		UserPO userPO =  userController.findUser(name,userRole);
        return userPO;
 	 }
 	 
 	public ArrayList<UserPO> getAllUser(){
 		return userController.getAllUser();
 	}
     
 	public String autoGetUserId(UserRole userRole){
 		return userController.autoGetUserId(userRole);
 	}
}
