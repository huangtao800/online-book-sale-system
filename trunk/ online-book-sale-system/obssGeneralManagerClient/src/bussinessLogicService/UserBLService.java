package bussinessLogicService;
//�ȼ���
import java.util.ArrayList;

import po.*;

public interface UserBLService {
	
	//����Ա�����û�
	public ResultMessage addUser(String userName,String id,String password,UserRole userRole);
	//����Աɾ���û�
	public ResultMessage deleteUser(UserPO userPO,UserRole userRole);
	//����Ա�޸��û���Ϣ
	public ResultMessage changeUser(UserPO beforeUserPO,UserPO afterUserPO) ;
	public ResultMessage changePassword(UserPO userPO);
	
	public UserPO findUser(String name,UserRole userRole);
    public ArrayList<UserPO> getAllUser();
   
    public String autoGetUserId(UserRole userRole);
}
