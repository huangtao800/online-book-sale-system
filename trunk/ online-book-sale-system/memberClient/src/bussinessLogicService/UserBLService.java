package bussinessLogicService;
//尤佳琪
import java.util.ArrayList;

import po.*;

public interface UserBLService {
	
	//管理员增加用户
	public ResultMessage addUser(String userName,String id,String password,UserRole userRole);
	//管理员删除用户
	public ResultMessage deleteUser(UserPO userPO,UserRole userRole);
	//管理员修改用户信息
	public ResultMessage changeUser(UserPO beforeUserPO,UserPO afterUserPO) ;
	public ResultMessage changePassword(UserPO userPO);
	
	public UserPO findUser(String name,UserRole userRole);
    public ArrayList<UserPO> getAllUser();
   
    public String autoGetUserId(UserRole userRole);
}
