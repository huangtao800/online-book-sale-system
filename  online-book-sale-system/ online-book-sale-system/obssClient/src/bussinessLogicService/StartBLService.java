package bussinessLogicService;

import po.UserRole;

public interface StartBLService {
	public void logIn(String name,String password,UserRole role);
}
