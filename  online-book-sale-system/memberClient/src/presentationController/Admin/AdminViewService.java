package presentationController.Admin;

import java.util.ArrayList;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface AdminViewService {
	public ResultMessage add(String userName,String userID,String userPassword,UserRole userRole);
	public ResultMessage change(UserPO beforeUserPO,UserPO afterUserPO); 
	public ResultMessage delete(UserPO userPO,UserRole userRole);
	public UserPO findUser(String name,UserRole userRole);
	public ArrayList<UserPO> getAllUser();
	public void init(int index);
	public String autoGetUserId(UserRole userRole);
}
