package bussinessLogicService;
//尤佳琪
import po.*;

public interface UserBLService {
	
	//对用户的调整
	public ResultMessage addUser(String userName,String id,String password,UserRole userRole);
	public ResultMessage deleteUser(String id,UserRole userRole);
	public ResultMessage findChangingUser(String id);
	public ResultMessage changeUser(String userName, String id,String password,UserRole userRole);
	public UserPO findUser(String id,String name);

}
