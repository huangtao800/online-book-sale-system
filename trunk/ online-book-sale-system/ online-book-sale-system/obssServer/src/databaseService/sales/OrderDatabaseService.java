package databaseService.sales;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.OrderPO;
import po.PO;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface OrderDatabaseService extends DatabaseService{
	public ArrayList<OrderPO> getUnfinishedOrder() throws RemoteException;
	public ResultMessage insert(PO po) throws RemoteException;
	public ResultMessage delete(PO po) throws RemoteException;
	public ResultMessage update(PO po) throws RemoteException;
	

}
