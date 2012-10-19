package bussinessLogicService;
//������
import java.util.ArrayList;

import po.LineItemPO;
import po.OrderPO;
import po.ResultMessage;



public interface SalesBLService {
	public ResultMessage putInCart(LineItemPO lineItem);//����Ʒ���빺�ﳵ��������ӳɹ�
	public ArrayList<LineItemPO> enterCart();//���빺�ﳵ����ʾ���ﳵ��Ϣ
	public ResultMessage removeFromCart(String id);//���빺�ﳵ֮�󣬽���ɾ����������Ҫˢ��
	public double calculate();//�����ܼ�
	public double chooseCoupon (double percent);//ѡ�����ȯ
	public double chooseEquivalent (double voucher);//ѡ��ȼ�ȯ
	public OrderPO purchase();//���ɶ���
	public void endSale ();//������������ ����д����������������������
}
