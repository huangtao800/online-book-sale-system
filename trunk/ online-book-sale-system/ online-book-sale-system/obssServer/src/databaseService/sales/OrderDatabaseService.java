package databaseService.sales;

import java.util.ArrayList;

import po.OrderPO;
import databaseService.DatabaseService;

public interface OrderDatabaseService extends DatabaseService{
	public ArrayList<OrderPO> getUnfinishedOrder();
	

}
