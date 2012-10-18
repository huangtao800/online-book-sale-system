package businessLogicservice;

import java.util.ArrayList;

import databaseservice.Order;
import databaseservice.ResultMessage;

public interface SalesBLService {
	public ResultMessage putInCart(String id);//����Ʒ���빺�ﳵ��������ӳɹ�
	public ArrayList<String> enterCart();//���빺�ﳵ����ʾ���ﳵ��Ϣ
	public ResultMessage removeFromCart(String id);//���빺�ﳵ֮�󣬽���ɾ����������Ҫˢ��
	public double calculate();//�����ܼ�
	public double chooseCoupon (double percent);//ѡ�����ȯ
	public double chooseVoucher (double voucher);//ѡ��ȼ�ȯ
	public Order purchase();//���ɶ���
	public void endSale ();//������������ ����д����������������������
}
