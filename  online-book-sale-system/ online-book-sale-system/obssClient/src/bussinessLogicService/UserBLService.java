package bussinessLogicService;
//尤佳琪
import po.*;

public interface UserBLService {
	//用户界面获得用户信息
	public String getUserName(String id);
	public String getUserId(String id);
	public String getUserPassword(String id);
	public UserRole getUserRole(String id);
	
	//根据输入查找是否存在相应的user
	//public UserPO login(String userName,String password,UserRole userRole);
	
	//对用户的调整
	public ResultMessage addUser(String userName,String id,String password,UserRole userRole);
	public ResultMessage deleteUser(String id);
	public ResultMessage findChangingUser(String id);
	public ResultMessage changeUser(String userName, String id,String password,UserRole userRole); 

}
