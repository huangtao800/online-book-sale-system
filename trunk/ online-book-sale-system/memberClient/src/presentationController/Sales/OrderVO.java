package presentationController.Sales;

import java.util.ArrayList;
import java.util.Calendar;

import po.LineItemPO;
import po.OrderPO;
import po.OrderState;

public class OrderVO {
	
	private String orderNum, memberID, date, orderState, totalPrice,address;
	private ArrayList<LineItemPO> productList;
	
	public OrderVO(OrderPO orderPO){
		this.productList = orderPO.getProductList();
		this.setOrderNum("订单编号：" + orderPO.getOrderNum());
		this.setMemberID("会员编号：" + orderPO.getMemberID());
		this.setDate(orderPO.getDate());
		this.setTotalPrice("商品总价：" + orderPO.getTotalPrice()+"");
		if(orderPO.getOrderState() == OrderState.ORDERDED)
			this.setOrderState("订单状态：已下单");
		else if(orderPO.getOrderState() == OrderState.DISTRIBUTION)
			this.setOrderState("订单状态：仓库配货");
		else if(orderPO.getOrderState() == OrderState.DISTRIBUTION)
			this.setOrderState("订单状态：物流配送");
		else 
			this.setOrderState("订单状态：已签收");	
		this.address = "收货地址：" + orderPO.getAddress();
	}
	
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	
	public String getOrderNum() {
		return orderNum;
	}
	
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	
	public String getMemberID() {
		return memberID;
	}
	
	public void setDate(Calendar calendar) {
		this.date = "下单时间："+ calendar.get(Calendar.YEAR)+"年"
				+calendar.get(Calendar.MONTH)+"月"
				+calendar.get(Calendar.DAY_OF_MONTH)+"日";
	}
	
	public String getDate() {
		return date;
	}
	
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	
	public String getOrderState() {
		return orderState;
	}
	
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getTotalPrice() {
		return totalPrice;
	}
	
	public ArrayList<LineItemPO> getProductList(){
		return productList;
	}
	public String getAddres(){
		return address;
	}

}
