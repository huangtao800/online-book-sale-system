package presentationController.changeUserNameView;

import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;

public interface changeUserNameControllerInterface {
	 public ResultMessage  changeUser(UserPO userpo,UserPO newuserpo);
	 public SalesManagerPO getNewUserPO();

}
