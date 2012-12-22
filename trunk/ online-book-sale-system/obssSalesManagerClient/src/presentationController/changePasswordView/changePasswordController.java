package presentationController.changePasswordView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import presentation.changePassWordView;
import presentation.changeUserNameView;
import presentationController.SalesManagerView.SalesManagerViewService;

public class changePasswordController implements changePasswordControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private SalesManagerPO userPO;
      private  changePassWordView View;
      private SalesManagerViewService salesManagerViewController;
      
      public changePasswordController(SalesManagerPO userPO, SalesManagerViewService salesManagerViewController){
    	  this.userPO=userPO;
    	  this.salesManagerViewController = salesManagerViewController;
    	  View=new changePassWordView(this,this.userPO);
      }
	
	  public ResultMessage  changeUser(UserPO userpo,UserPO newuserpo){
		  ResultMessage result= userController.changeUser(userpo,newuserpo);
		  if(result==ResultMessage.SUCCEED){
			  salesManagerViewController.freshPassword(newuserpo.getUserPassword());
		  }
		  return result;
	  }
	  

}
