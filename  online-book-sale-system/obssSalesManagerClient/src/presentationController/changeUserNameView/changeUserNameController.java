package presentationController.changeUserNameView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import presentation.changeUserNameView;
import presentationController.mainView.MainViewControllerInterface;

public class changeUserNameController implements changeUserNameControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private SalesManagerPO userPO;
      private  changeUserNameView View;
      private MainViewControllerInterface mainViewController;
      
      public changeUserNameController(SalesManagerPO userPO, MainViewControllerInterface mainViewController){
    	  this.userPO=userPO;
    	  View=new changeUserNameView(this,this.userPO);
    	  this.mainViewController=mainViewController;
      }
	
	  public ResultMessage  changeUser(UserPO oldUserpo,UserPO newPo){
		  ResultMessage result= userController.changeUser(oldUserpo,newPo);
		  if(result==ResultMessage.SUCCEED){
			  mainViewController.freshName(newPo.getUserName());
		  }
		  return result;
	  }
	  
	  public SalesManagerPO getNewUserPO(){
		  return (SalesManagerPO)View.getNewUserPO();
	  }
	  
}
