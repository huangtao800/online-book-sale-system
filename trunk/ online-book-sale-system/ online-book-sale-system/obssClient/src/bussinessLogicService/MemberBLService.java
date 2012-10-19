//����
package bussinessLogicService;
import java.util.ArrayList;
import po.*;

public interface MemberBLService {
	public String getMemberName();//��û�Ա����
	public String getMemberID();//��û�ԱID
	
	public ResultMessage addFavorities(String id);//���ͼ������ղؼ�
	public ResultMessage removeFavorities(String id);//���ղؼ����Ƴ�
	
	public ResultMessage addEquivalent(EquivalentPO e);//��ӵȼ�ȯ
	public ResultMessage addCoupon(CouponPO c);//��Ӵ���ȯ

	public ResultMessage changeOrder();//�޸Ķ���״̬
	
	public ResultMessage register(String id,String password);//ע���Ա
	public ResultMessage cancel(String id,String password);//ע����Ա
	
	public ArrayList<OrderPO> getOrderRecord();//�鿴�����¼
	public MemberPO getInfo();//�鿴��Ա��Ϣ
	
}
