package bussinessLogicService;

import po.*;

public interface UserBLService {
	//�û��������û���Ϣ
	public String getUserName(int id);
	public String getUserId();
	public String getUserPassword(int id);
	
	//������������Ƿ������Ӧ��user
	public ResultMessage login(String id,String password);
	
	//���û��ĵ���
	public ResultMessage addUser(String id,String name,String identity,String password);
	public ResultMessage deleteUser(String id);
	public ResultMessage findChangingUser(String id);
	public ResultMessage changeUser(String id, String name,String identity,String password); 

}
