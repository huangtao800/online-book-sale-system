package presentationController.Admin;

import java.util.ArrayList;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface AdminOverviewService {
    public ArrayList<UserPO> overviewUser();
    public UserPO findUser(String name,UserRole userRole);
    public ResultMessage add(String userName,String userID,String userPassword,UserRole userRole);
	public ResultMessage change(String userName,String userID,String userPassword,UserRole userRole);
	public ResultMessage delete(String id,UserRole userRole);
}
