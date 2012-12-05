//����
//Memberģ�����漰���۾�����߼��ӿ�
package bussinessLogicService;
import java.util.ArrayList;
import po.*;

public interface MemberBLService {
	public String getMemberName();//��û�Ա����
	public String getMemberID();//��û�ԱID
	
	public ResultMessage addFavorities(BookPO bookPO ,MemberPO memberPO);//���ͼ������ղؼ�
	public ResultMessage removeFavorities(BookPO bookPO,MemberPO memberPO);//���ղؼ����Ƴ�
	
	public ResultMessage register(String id,String password);//ע���Ա
	public ResultMessage cancel(String id,String password);//ע����Ա
	
	public ArrayList<CouponPO> getCouponList();//��ô���ȯ�б�
	public ArrayList<EquivalentPO> getEquivalentList();//��õȼ�ȯ�б�
	
	public ResultMessage addOrder(OrderPO order,MemberPO memberPO);//����һ��������¼
	
	public ArrayList<OrderPO> getOrderRecord();//�鿴�Լ��Ĺ����¼
	public ResultMessage update();//���»�Ա��Ϣ
	public MemberPO getInfo();//�鿴�Լ��Ļ�Ա��Ϣ
	
}
