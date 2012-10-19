package po;
//������
import java.util.ArrayList;

public class OrderPO implements PO{
	//�µ�ʱ�� date  ������~  ��utility�������һ��Date��~
	//productItem �Ƕ����е���Ʒ��Ϣ�б�
	private static long count = 00000;
	private long orderNum;
	private ArrayList<LineItemPO> productItem;
	private double totalPrice;
	private OrderState state;
	public OrderPO(ArrayList<LineItemPO> productItem){
		orderNum = count ++;
		this.productItem = productItem;
		this.state = OrderState.ORDERDED;
	}
	public long getOrderNum(){
		return orderNum;
	}
	public double getTotalPrice(){
		return totalPrice;
	}
	public void setOrderState(OrderState state){
		this.state = state;
	}
	public OrderState getOrderState(){
		return state;
	}
	public ArrayList<LineItemPO> getProductItem(){
		return productItem;
	}
	


}
