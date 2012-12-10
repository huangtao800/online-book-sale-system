package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;

import databaseService.sales.OrderDatabaseService;

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
	public OrderPO endSale(){
		return orderBuffer;
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

}
