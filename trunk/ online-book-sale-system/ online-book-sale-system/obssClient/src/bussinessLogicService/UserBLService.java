package bussinessLogicService;
//�ȼ���
import java.util.ArrayList;

import po.*;

public interface UserBLService {
	
	//����Ա�����û�
	public ResultMessage addUser(String userName,String id,String password,UserRole userRole);
	//����Աɾ���û�
	public ResultMessage deleteUser(String id,UserRole userRole);
	//����Ա�޸��û���Ϣ�������ÿ����޸�����
	public ResultMessage changeUser(String userName, String id,String password,UserRole userRole);
	
	public UserPO findUser(String name);
	public ResultMessage findChangingUser(String id);
	
	public ArrayList<UserPO> getAllUser();

}
