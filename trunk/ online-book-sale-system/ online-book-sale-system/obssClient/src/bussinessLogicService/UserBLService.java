package bussinessLogicService;
//�ȼ���
import po.*;

public interface UserBLService {
	
	//���û��ĵ���
	public void addUser(String userName,String id,String password,UserRole userRole);
	public ResultMessage deleteUser(String id);
	public ResultMessage findChangingUser(String id);
	public ResultMessage changeUser(String userName, String id,String password,UserRole userRole); 

}
