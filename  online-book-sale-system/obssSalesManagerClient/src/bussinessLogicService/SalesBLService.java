package bussinessLogicService;
//������

import java.util.ArrayList;

import po.LineItemPO;
import po.ResultMessage;
import vo.OrderVO;

public interface SalesBLService {
	public ResultMessage putInCart(String isbn, int number);
	public ResultMessage removeFrromCart(int index);
	public double getTotalPrice();//�õ����ﳵ��Ʒ���ܼۣ�ԭ�ۣ�
	public ArrayList<String> showSpecial(double commonPrice);
	public double getSpecialPrice(int i);
	public OrderVO pay(double price);//�������ʵ�ʼ۸����ɶ���	
	public ArrayList<LineItemPO> getCartList();//�õ���Ʒ�б�
	public void endSale();//�õ�������VO,����������
	
}