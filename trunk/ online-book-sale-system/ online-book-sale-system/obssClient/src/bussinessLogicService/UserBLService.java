package bussinessLogicService;
//�ȼ���
import po.*;

public interface UserBLService {
	//�û��������û���Ϣ
	public String getUserName(String id);
	public String getUserId(String id);
	public String getUserPassword(String id);
	public UserRole getUserRole(String id);
	
	//������������Ƿ������Ӧ��user
	//public UserPO login(String userName,String password,UserRole userRole);
	
	//���û��ĵ���
	public ResultMessage addUser(String userName,String id,String password,UserRole userRole);
	public ResultMessage deleteUser(String id);
	public ResultMessage findChangingUser(String id);
	public ResultMessage changeUser(String userName, String id,String password,UserRole userRole); 

}
