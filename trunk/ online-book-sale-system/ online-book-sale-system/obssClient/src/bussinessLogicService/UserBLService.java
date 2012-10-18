package bussinessLogicService;

import po.*;

public interface UserBLService {
	//用户界面获得用户信息
	public String getUserName(int id);
	public String getUserId();
	public String getUserPassword(int id);
	
	//根据输入查找是否存在相应的user
	public ResultMessage login(String id,String password);
	
	//对用户的调整
	public ResultMessage addUser(String id,String name,String identity,String password);
	public ResultMessage deleteUser(String id);
	public ResultMessage findChangingUser(String id);
	public ResultMessage changeUser(String id, String name,String identity,String password); 

}
