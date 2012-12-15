package presentationController.changeUserNameView;

import po.ResultMessage;
import po.UserRole;

public interface changeUserNameControllerInterface {
	  public ResultMessage  changeUser(String userName, String id,String password,UserRole userRole);

}
