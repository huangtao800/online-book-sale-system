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
		this.setOrderNum("������ţ�" + orderPO.getOrderNum());
		this.setMemberID("��Ա��ţ�" + orderPO.getMemberID());
		this.setDate(orderPO.getDate());
		this.setTotalPrice("��Ʒ�ܼۣ�" + orderPO.getTotalPrice()+"");
		if(orderPO.getOrderState() == OrderState.ORDERDED)
			this.setOrderState("����״̬�����µ�");
		else if(orderPO.getOrderState() == OrderState.DISTRIBUTION)
			this.setOrderState("����״̬���ֿ����");
		else if(orderPO.getOrderState() == OrderState.DISTRIBUTION)
			this.setOrderState("����״̬����������");
		else 
			this.setOrderState("����״̬����ǩ��");	
		this.address = "�ջ���ַ��" + orderPO.getAddress();
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
		this.date = "�µ�ʱ�䣺"+ calendar.get(Calendar.YEAR)+"��"
				+calendar.get(Calendar.MONTH)+"��"
				+calendar.get(Calendar.DAY_OF_MONTH)+"��";
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
