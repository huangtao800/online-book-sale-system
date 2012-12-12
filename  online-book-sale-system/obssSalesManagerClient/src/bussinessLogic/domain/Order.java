package bussinessLogic.domain;

import po.OrderPO;
import po.OrderState;
import po.ResultMessage;

public class Order {
	private OrderPO orderPO;
	
	public Order(OrderPO orderPO){
		this.orderPO = orderPO;
	}
	public ResultMessage setOrderState(OrderState state){
		orderPO.setOrderState(state);
		return ResultMessage.SUCCEED;
	}
	
	

}
