package presentationController.changePasswordView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.GeneralManagerPO;
import po.ResultMessage;
import po.UserRole;
import presentation.changePassWordView;
import presentation.changeUserNameView;

public class changePasswordController implements changePasswordControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private GeneralManagerPO userPO;
      private  changePassWordView View;
      
      public changePasswordController(GeneralManagerPO userPO){
    	  this.userPO=userPO;
    	  View=new changePassWordView(this,this.userPO);
      }
	
	  public ResultMessage  changeUser(String userName, String id,String password,UserRole userRole){
		  return userController.changeUser(userName, id, password, userRole);
	  }
}
