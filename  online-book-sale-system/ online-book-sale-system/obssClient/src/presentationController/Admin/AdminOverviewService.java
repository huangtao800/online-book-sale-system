package presentationController.Admin;

import java.util.ArrayList;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface AdminOverviewService {
	 public ArrayList<UserPO> overviewUser();
	    
	 public UserPO findUser(String name,UserRole userRole);

	 public void initAdminView(int index);
}
