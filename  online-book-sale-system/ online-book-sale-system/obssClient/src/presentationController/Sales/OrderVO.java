package presentationController.Sales;

import java.util.ArrayList;

import po.LineItemPO;
import po.OrderPO;
import po.OrderState;

public class OrderVO {
	
	private String orderNum, memberID, date, orderState, totalPrice;
	private ArrayList<LineItemPO> productList;
	
	public OrderVO(OrderPO orderPO){
		this.productList = orderPO.getProductList();
		this.setOrderNum(orderPO.getOrderNum()+ "");
		this.setMemberID(orderPO.getMemberID());
		//date
		this.setTotalPrice(orderPO.getTotalPrice()+"");
		if(orderPO.getOrderState() == OrderState.ORDERDED)
			this.setOrderState("已下单");
		else if(orderPO.getOrderState() == OrderState.DISTRIBUTION)
			this.setOrderState("仓库配货");
		else if(orderPO.getOrderState() == OrderState.DISTRIBUTION)
			this.setOrderState("物流配送");
		else 
			this.setOrderState("已签收");	
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
	
	public void setDate(String date) {
		this.date = date;
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

}
