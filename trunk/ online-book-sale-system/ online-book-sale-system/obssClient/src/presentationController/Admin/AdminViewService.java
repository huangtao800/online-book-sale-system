package presentationController.Admin;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface AdminViewService {
	public ResultMessage add(String userName,String userID,String userPassword,UserRole userRole);
	public UserPO search(String name);
	public ResultMessage change(String userName,String userID,String userPassword,UserRole userRole);
	public ResultMessage delete(String id,UserRole userRole);
}
