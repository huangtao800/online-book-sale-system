package database.sales;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import databaseService.sales.OrderDatabaseService;

import po.OrderPO;
import po.OrderState;
import po.PO;
import po.ResultMessage;

public class OrderDatabase extends UnicastRemoteObject implements OrderDatabaseService{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<OrderPO> orderList = reloadOrderList();
	private long orderNum = reloadOrderNum();

	private static OrderDatabase instance = null;

	protected OrderDatabase() throws RemoteException{
		super();
	}

	public static OrderDatabase getInstance(){
		if(instance==null){
			try {
				instance=new OrderDatabase();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}	
		return instance;
	}
	
	public ResultMessage insert(PO orderpo) {
		if(orderpo instanceof OrderPO){
			orderList.add((OrderPO)orderpo);
			save();
			return ResultMessage.SUCCEED;
		}
		return ResultMessage.FAILED;
	}

	public ResultMessage delete(PO orderpo){
		if(orderpo instanceof OrderPO){
			OrderPO order = (OrderPO)orderpo;
			orderList.remove(order);
			save();
			return ResultMessage.SUCCEED;
		}
		return ResultMessage.FAILED;
	}
	
	public ResultMessage update(PO orderpo) throws RemoteException {
		if(orderpo instanceof OrderPO){
			OrderPO order = (OrderPO)orderpo;
			for(int i = 0;i < orderList.size(); i ++)
				if(orderList.get(i).getOrderNum() == order.getOrderNum()){
					orderList.set(i, order);
					if(orderList.get(i).getOrderState() == OrderState.SIGNED)
						orderList.remove(i);
				}
			save();
			return ResultMessage.SUCCEED;
		}
		return ResultMessage.FAILED;
	}
	
	public ArrayList<OrderPO> getUnfinishedOrder(){
		return orderList;
	}
	
	@Override
	public long getUId() throws RemoteException {
		long UId = orderNum;
		orderNum ++;
		return UId;
	}
	
	private ResultMessage save() {
		ObjectOutputStream oos, oosNum;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("OrderList.ser"));
			oosNum = new ObjectOutputStream(new FileOutputStream("OrderNumber.ser"));
			try {
				oos.writeObject(orderList);
				oos.close();
				oosNum.writeObject(orderNum);
				oosNum.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return ResultMessage.SUCCEED;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResultMessage.FAILED;
	}
	@SuppressWarnings("unchecked")
	private ArrayList<OrderPO> reloadOrderList() {
		ArrayList<OrderPO> list = new ArrayList<OrderPO>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OrderList.ser"));
			list = (ArrayList<OrderPO>) ois.readObject();
			ois.close();
			return list;
		} catch (FileNotFoundException e) {
			System.out.println("System initializing(orderlist)");
			return list;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return new ArrayList<OrderPO>();
	}
	
	private long reloadOrderNum(){
		long number = 0;
		try {
			ObjectInputStream oisNum = new ObjectInputStream(new FileInputStream("OrderNumber.ser"));
			number = (Long) oisNum.readObject();
			oisNum.close();
			return number;
		} catch (FileNotFoundException e) {
			System.out.println("System initializing(orderNumber)");
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return number;
		
	}

}
