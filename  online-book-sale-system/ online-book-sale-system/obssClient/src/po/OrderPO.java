package po;
//张雅婷
import java.util.ArrayList;

public class OrderPO implements PO{
	//下单时间 date  单独做~  在utility包中添加一个Date类~
	//productItem 是订单中的商品信息列表
	private static long count = 00000;
	private long orderNum;
	private ArrayList<LineItemPO> productList;
	private double totalPrice;
	private OrderState state;
	private String memberID;
	
	public OrderPO(ArrayList<LineItemPO> productList, String memberID, double totalPrice){
		this.orderNum = count ++;
		this.state = OrderState.ORDERDED;
		this.productList = productList;
		this.memberID = memberID;
		this.totalPrice = totalPrice;
	}
	public long getOrderNum(){
		return orderNum;
	}
	public void setOrderState(OrderState state){
		this.state = state;
	}
	public OrderState getOrderState(){
		return state;
	}
	public ArrayList<LineItemPO> getProductList(){
		return productList;
	}
	public String getMemberID(){
		return memberID;
	}
	public double getTotalPrice(){
		return totalPrice;
	}
	


}
