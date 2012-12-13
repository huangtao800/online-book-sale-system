package bussinessLogicService;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface GeneralManagerBLService {
	public ResultMessage updateUserPO(UserPO userPO, UserRole role);
}
