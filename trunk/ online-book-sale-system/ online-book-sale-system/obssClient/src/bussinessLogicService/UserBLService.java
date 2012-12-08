package bussinessLogicService;
//尤佳琪
import po.*;

public interface UserBLService {
	
	//对用户的调整
	public void addUser(String userName,String id,String password,UserRole userRole);
	public ResultMessage deleteUser(String id);
	public ResultMessage findChangingUser(String id);
	public ResultMessage changeUser(String userName, String id,String password,UserRole userRole); 

}
