//����
//Memberģ�����漰�˿�����Ľӿ�
package bussinessLogicService;

import java.util.ArrayList;

import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;

public interface MemberManagerBLService {
	
	public ResultMessage addEquivalent(EquivalentPO e);//��ӵȼ�ȯ
	public ResultMessage addCoupon(CouponPO c);//��Ӵ���ȯ

	public ResultMessage changeOrder(int orderNumber,OrderState state);//�޸Ķ���״̬
	
	public ArrayList<OrderPO> getOrderRecord(String id);//�鿴�ض������¼
	public MemberPO getInfo(String id);//�鿴�ض���Ա��Ϣ

}
