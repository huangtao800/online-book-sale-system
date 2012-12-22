//����
//Memberģ�����漰���۾�����߼��ӿ�
package bussinessLogicService;
import java.util.ArrayList;
import po.*;

public interface CustomerBLService {
	public String getMemberName();//��û�Ա����
	public String getMemberID();//��û�ԱID
	public String getAddress();//��õ�ַ
	
	public ResultMessage addFavorities(BookPO bookPO);//���ͼ������ղؼ�
	public ResultMessage removeFavorities(BookPO bookPO);//���ղؼ����Ƴ�
	
	public ResultMessage cancel(String password);//ע����Ա
	
	public ArrayList<CouponPO> getCouponList();//��ô���ȯ�б�
	public ArrayList<EquivalentPO> getEquivalentList();//��õȼ�ȯ�б�
	
	public ResultMessage addOrder(OrderPO order);//����һ��������¼
	
	public ArrayList<OrderPO> getOrderRecord();//�鿴�Լ��Ĺ����¼
	public ResultMessage changeName(String newName);//�޸��û���
	public ResultMessage changePassword(String password);//�޸�����
	
	public ResultMessage putInCart(BookPO bookPO,int number);//��ӵ����ﳵ
	public ResultMessage removeFromCart(int index);	//�ӹ��ﳵ��ɾ��
	public ResultMessage changeLineItemNumber(int index,int newNumber);//���Ĺ��ﳵ����Ʒ������
	
	public ResultMessage deleteEquivalent(EquivalentPO equivalentPO);	//ɾ���ȼ�ȯ
	public ResultMessage deleteCouponPO(CouponPO couponPO);		//ɾ������ȯ
	
	public ArrayList<LineItemPO> getCartList();	//���ع��ﳵ
	public ResultMessage changeAddress(String newAddress);//�޸ĵ�ַ
	
	public ResultMessage clearCart();//��չ��ﳵ
	
	public ArrayList<String> getBookType();//�������ͼ�����
	
	public CustomerPO freshMemberPO(String memberID);
	public ResultMessage freshBookNumber();
}
