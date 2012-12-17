package presentationController.changePasswordView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.GeneralManagerPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.changePassWordView;
import presentation.changeUserNameView;
import presentationController.GeneralManagerView.GeneralManagerViewControllerInterface;

public class changePasswordController implements changePasswordControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private GeneralManagerPO userPO;
      private  changePassWordView View;
      private GeneralManagerViewControllerInterface mainViewController;
      
      public changePasswordController(GeneralManagerPO userPO,GeneralManagerViewControllerInterface mainViewController){
    	  this.userPO=userPO;
    	  this.mainViewController=mainViewController;
    	  View=new changePassWordView(this,this.userPO);
      }
	
	  public ResultMessage  changeUser(UserPO old,UserPO newpo){		  
		  ResultMessage resultMessage= userController.changeUser(old,newpo);
		  if(resultMessage==ResultMessage.SUCCEED){
			  mainViewController.freshPassword(newpo.getUserPassword());
		  }
		  return resultMessage;
	  }
}
