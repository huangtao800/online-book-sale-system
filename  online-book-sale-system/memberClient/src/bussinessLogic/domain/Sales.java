package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

import databaseService.sales.OrderDatabaseService;

import po.LineItemPO;
import po.OrderPO;
import po.ResultMessage;

public class Sales {
	private OrderDatabaseService orderDatabase;
	private OrderPO orderBuffer;
	
	public Sales() {
		try {
			orderDatabase = (OrderDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/OrderDatabase");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void addOrder(OrderPO orderBuffer){
		this.orderBuffer = orderBuffer;
	}

	public ResultMessage updateSale() {
		if(orderBuffer == null)
			return ResultMessage.FAILED;
		try {
			orderDatabase.insert(orderBuffer);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return ResultMessage.SUCCEED;
	}
	public OrderPO creareOrderPO(ArrayList<LineItemPO> cartList,
			String memberID, double price, String address) {
		OrderPO orderPO = null;
		long orderNum;
		try {
			orderNum = orderDatabase.getUId();
			orderPO = new OrderPO(orderNum, cartList, memberID, price, address);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return orderPO;
	}

}
