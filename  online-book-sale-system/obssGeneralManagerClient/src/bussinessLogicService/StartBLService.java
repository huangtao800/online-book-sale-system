package bussinessLogicService;

import po.UserPO;
import po.UserRole;

public interface StartBLService {
	public void logIn(String name,String password,UserRole role);

	public void setStartViewFalse();	//将登陆界面隐藏
	public void enterMainView(UserRole role,UserPO userPO);	//根据用户身份，进入登陆后的主界面
}
