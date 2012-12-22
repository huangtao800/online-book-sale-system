package bussinessLogicService;
//������

import java.util.ArrayList;

import po.LineItemPO;
import po.ResultMessage;
import presentationController.Sales.OrderVO;

public interface SalesBLService {
//	public ResultMessage putInCart(String isbn, int number);
	public ResultMessage removeFrromCart(int index);
	public ResultMessage addFavorities(LineItemPO lineItemPO);//��ӵ��ղؼ�
	public double getTotalPrice();//�õ����ﳵ��Ʒ���ܼۣ�ԭ�ۣ�
	public ArrayList<String> showSpecial(double commonPrice);
	public double getSpecialPrice(int i);
	public OrderVO pay(double price, String address, int index);//�������ʵ�ʼ۸����ɶ���	
	public ArrayList<LineItemPO> getCartList();//�õ���Ʒ�б�
	public void endSale();//�õ�������VO,����������
	public String getAddress();//�õ�ԭ��ַ
	public int getSaveByISBN(String isbn);
	public ResultMessage changeLineItemNumber(int index, int number);
	
}
