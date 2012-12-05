package bussinessLogicService;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface StartBLService {
	public void logIn(String name,String password,UserRole role);
	public void startRegistry();	//开始注册，启动注册界面
	public void enterMainView(UserRole role,UserPO userPO);	//根据用户身份，进入登陆后的主界面
}
