package presentationController.Admin;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface AdminViewService {
	 public void add(String userName,String userID,String userPassword,UserRole userRole);
	 public UserPO search(String id,String name);
	 public ResultMessage change(String userName,String userID,String userPassword,UserRole userRole);
}
