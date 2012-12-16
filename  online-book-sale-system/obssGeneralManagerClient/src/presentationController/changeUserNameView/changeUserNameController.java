package presentationController.changeUserNameView;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;
import po.GeneralManagerPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.changeUserNameView;

public class changeUserNameController implements changeUserNameControllerInterface{
	  private UserBLService userController=UserController.getInstance();
      private GeneralManagerPO userPO;
      private  changeUserNameView View;
      
      public changeUserNameController(GeneralManagerPO userPO){
    	  this.userPO=userPO;
    	  View=new changeUserNameView(this,this.userPO);
      }
	
	  public ResultMessage  changeUser(UserPO old,UserPO newPo){
		  return userController.changeUser(old,newPo);
	  }
}
