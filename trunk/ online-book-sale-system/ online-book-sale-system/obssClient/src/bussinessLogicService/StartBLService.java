package bussinessLogicService;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface StartBLService {
	public void logIn(String name,String password,UserRole role);
	public void startRegistry();	//��ʼע�ᣬ����ע�����
	public void enterMainView(UserRole role,UserPO userPO);	//�����û���ݣ������½���������
}
