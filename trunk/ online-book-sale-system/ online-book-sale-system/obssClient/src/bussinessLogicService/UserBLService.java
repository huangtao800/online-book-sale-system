package bussinessLogicService;
//�ȼ���
import po.*;

public interface UserBLService {
	
	//���û��ĵ���
	public ResultMessage addUser(String userName,String id,String password,UserRole userRole);
	public ResultMessage deleteUser(String id,UserRole userRole);
	public ResultMessage findChangingUser(String id);
	public ResultMessage changeUser(String userName, String id,String password,UserRole userRole);
	public UserPO findUser(String id,String name);

}
