//����
//Memberģ�����漰���۾�����߼��ӿ�
package bussinessLogicService;
import java.util.ArrayList;
import po.*;

public interface MemberBLService {
	public String getMemberName();//��û�Ա����
	public String getMemberID();//��û�ԱID
	
	public ResultMessage addFavorities(BookPO bookPO);//���ͼ������ղؼ�
	public ResultMessage removeFavorities(BookPO bookPO);//���ղؼ����Ƴ�
	
	public ResultMessage cancel(String password);//ע����Ա
	
	public ArrayList<CouponPO> getCouponList();//��ô���ȯ�б�
	public ArrayList<EquivalentPO> getEquivalentList();//��õȼ�ȯ�б�
	
	public ResultMessage addOrder(OrderPO order);//����һ��������¼
	
	public ArrayList<OrderPO> getOrderRecord();//�鿴�Լ��Ĺ����¼
	
}
