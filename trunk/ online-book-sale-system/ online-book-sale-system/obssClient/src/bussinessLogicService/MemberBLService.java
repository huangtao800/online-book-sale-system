//����
//Memberģ�����漰���۾�����߼��ӿ�
package bussinessLogicService;
import java.util.ArrayList;
import po.*;

public interface MemberBLService {
	public String getMemberName();//��û�Ա����
	public String getMemberID();//��û�ԱID
	
	public ResultMessage addFavorities(String id);//���ͼ������ղؼ�
	public ResultMessage removeFavorities(String id);//���ղؼ����Ƴ�
	
	public ResultMessage register(String id,String password);//ע���Ա
	public ResultMessage cancel(String id,String password);//ע����Ա
	
	public ArrayList<OrderPO> getOrderRecord();//�鿴�Լ��Ĺ����¼
	public MemberPO getInfo();//�鿴�Լ��Ļ�Ա��Ϣ
	
}
