package presentationController.changeUserNameView;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface changeUserNameControllerInterface {
	  public ResultMessage  changeUser(UserPO old,UserPO newPo);

}
