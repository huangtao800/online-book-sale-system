package presentationController.changePasswordView;

import po.ResultMessage;
import po.UserRole;

public interface changePasswordControllerInterface {
	  public ResultMessage  changeUser(String userName, String id,String password,UserRole userRole);

}
