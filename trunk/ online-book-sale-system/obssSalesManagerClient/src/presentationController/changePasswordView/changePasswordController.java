package presentationController.changePasswordView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import presentation.changePassWordView;
import presentation.changeUserNameView;
import presentationController.mainView.MainViewControllerInterface;

public class changePasswordController implements changePasswordControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private SalesManagerPO userPO;
      private  changePassWordView View;
      MainViewControllerInterface mainViewController;
      
      public changePasswordController(SalesManagerPO userPO, MainViewControllerInterface mainViewController){
    	  this.userPO=userPO;
    	  this.mainViewController=mainViewController;
    	  View=new changePassWordView(this,this.userPO);
      }
	
	  public ResultMessage  changeUser(UserPO userpo,UserPO newuserpo){
		  ResultMessage result= userController.changeUser(userpo,newuserpo);
		  if(result==ResultMessage.SUCCEED){
			  mainViewController.freshPassword(newuserpo.getUserPassword());
		  }
		  return result;
	  }
	  

}
