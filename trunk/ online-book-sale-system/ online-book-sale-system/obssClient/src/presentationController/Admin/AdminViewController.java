package presentationController.Admin;

import bussinessLogic.controller.BookController;
import bussinessLogic.controller.UserController;
import bussinessLogicService.BookBLService;
import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.AdminView;
import presentationController.book.BookViewController;

public class AdminViewController {
	 private static AdminViewController uniqueInstance;
	 private static UserBLService userController;
	 private AdminView adminView;

	 private AdminViewController (){
		 userController = UserController.getInstance();
	 }
	 
	 public static AdminViewController getInstance(){
		 if(userController==null){
			 uniqueInstance = new AdminViewController();
		 }
		 
		 return uniqueInstance;
	 }

	
	 public void initAdminView(){
		 adminView = new AdminView();
		 adminView.setVisible(true);
	 }
	 
     public ResultMessage add(String userName,String userID,String userPassword,UserRole userRole){
           ResultMessage result = userController.addUser(userName, userID, userPassword, userRole);	
           return result;
     }
    
     public UserPO search(String name){
    	UserPO userPO =  userController.findUser(name);
        return userPO;
     }
    
     public ResultMessage change(String userName,String userID,String userPassword,UserRole userRole){
    	return userController.changeUser(userName, userID, userPassword, userRole);
     }
     
}
