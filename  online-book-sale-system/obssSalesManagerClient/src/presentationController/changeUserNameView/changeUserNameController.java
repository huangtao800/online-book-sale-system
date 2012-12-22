package presentationController.changeUserNameView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import presentation.changeUserNameView;
import presentationController.SalesManagerView.SalesManagerViewService;

public class changeUserNameController implements changeUserNameControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private SalesManagerPO userPO;
      private  changeUserNameView View;
      private SalesManagerViewService salesManagerViewController;
      
      public changeUserNameController(SalesManagerPO userPO, SalesManagerViewService salesManagerViewController){
    	  this.userPO=userPO;
    	  View=new changeUserNameView(this,this.userPO);
    	  this.salesManagerViewController = salesManagerViewController;
      }
	
	  public ResultMessage  changeUser(UserPO oldUserpo,UserPO newPo){
		  ResultMessage result= userController.changeUser(oldUserpo,newPo);
		  if(result==ResultMessage.SUCCEED){
			  salesManagerViewController.freshName(newPo.getUserName());
		  }
		  return result;
	  }
	  
	  public SalesManagerPO getNewUserPO(){
		  return (SalesManagerPO)View.getNewUserPO();
	  }
	  
}
