package presentationController.changePasswordView;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface changePasswordControllerInterface {
	public ResultMessage  changeUser(UserPO userpo,UserPO newuserpo);

}
