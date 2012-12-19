package vo;

import java.util.ArrayList;
import java.util.Calendar;

import po.LineItemPO;
import po.OrderPO;
import po.OrderState;

public class NewOrderVO {

	public long orderNum;
	public double totalPrice;
	public String state;
	public String memberID;
	public String date;
	public String address;

	public ArrayList<LineItemVO> lineItemVOList = new ArrayList<LineItemVO>();

	public NewOrderVO(OrderPO orderPO) {
		orderNum = orderPO.getOrderNum();
		totalPrice = orderPO.getTotalPrice();
		state = orderPO.getOrderState().toString();
		memberID = orderPO.getMemberID();
		address = orderPO.getAddress();

		Calendar calendar = orderPO.getDate();
		date = calendar.get(Calendar.YEAR) + "Äê"
				+ (1 + calendar.get(Calendar.MONTH)) + "ÔÂ"
				+ calendar.get(Calendar.DATE) + "ÈÕ";

		initLineItem(orderPO.getProductList());
	}

	private void initLineItem(ArrayList<LineItemPO> lineItemList) {
		for (int i = 0; i < lineItemList.size(); i++) {
			LineItemVO lineItemVO = new LineItemVO(lineItemList.get(i));
			lineItemVOList.add(lineItemVO);
		}
	}
}
