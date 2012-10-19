package po;
//张雅婷
import java.util.ArrayList;

public class OrderPO implements PO{
	//下单时间 date  单独做~  在utility包中添加一个Date类~
	//productItem 是订单中的商品信息列表
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
