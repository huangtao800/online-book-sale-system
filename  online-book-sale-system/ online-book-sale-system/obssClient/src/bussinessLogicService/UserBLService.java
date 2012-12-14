package bussinessLogicService;
//尤佳琪
import java.util.ArrayList;

import po.*;

public interface UserBLService {
	
	//管理员增加用户
	public ResultMessage addUser(String userName,String id,String password,UserRole userRole);
	//管理员删除用户
	public ResultMessage deleteUser(String id,UserRole userRole);
	//管理员修改用户信息，其他用可以修改密码
	public ResultMessage changeUser(String userName, String id,String password,UserRole userRole);
	
	public UserPO findUser(String name);
	public ResultMessage findChangingUser(String id);
	
	public ArrayList<UserPO> getAllUser();

}
