package bussinessLogicService;

import po.ResultMessage;
import po.UserRole;

public interface StartBLService {
	public void logIn(String name,String password,UserRole role);
	public void startRegistry();
}
