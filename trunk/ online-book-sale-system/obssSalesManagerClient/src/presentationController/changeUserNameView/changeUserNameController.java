package presentationController.changeUserNameView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import presentation.changeUserNameView;

public class changeUserNameController implements changeUserNameControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private SalesManagerPO userPO;
      private  changeUserNameView View;
      
      public changeUserNameController(SalesManagerPO userPO){
    	  this.userPO=userPO;
    	  View=new changeUserNameView(this,this.userPO);
      }
	
	  public ResultMessage  changeUser(UserPO oldUserpo,UserPO newPo){
		  return userController.changeUser(oldUserpo,newPo);
	  }
	  
}
