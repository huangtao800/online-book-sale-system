package presentationController.changeUserNameView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.GeneralManagerPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.changeUserNameView;
import presentationController.GeneralManagerView.GeneralManagerViewControllerInterface;

public class changeUserNameController implements changeUserNameControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private GeneralManagerPO userPO;
      private  changeUserNameView View;
      private GeneralManagerViewControllerInterface mainViewController;
      
      public changeUserNameController(GeneralManagerPO userPO,GeneralManagerViewControllerInterface mainViewController){
    	  this.userPO=userPO;
    	  View=new changeUserNameView(this,this.userPO);
    	  this.mainViewController=mainViewController;
      }
	
	  public ResultMessage  changeUser(UserPO old,UserPO newPo){
		  ResultMessage result= userController.changeUser(old,newPo);
		  if(result==ResultMessage.SUCCEED){
			  mainViewController.freshName(newPo.getUserName());
		  }
		  return result;
	  }
}
