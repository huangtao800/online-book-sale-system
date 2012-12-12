package bussinessLogicService;

import java.util.ArrayList;

import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;

public interface SalesManagerService {
	public MemberPO getMemberPO(String MemID);
	public ArrayList<OrderPO> getOrderPOList();
	public ResultMessage updateMember_Order(String memberID,OrderState state,long orderNum);
	public ResultMessage updateOrder(OrderPO orderPO);

}
