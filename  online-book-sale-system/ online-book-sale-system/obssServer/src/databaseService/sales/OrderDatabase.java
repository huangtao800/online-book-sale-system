package databaseService.sales;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.OrderPO;
import po.PO;
import po.ResultMessage;

public class OrderDatabase implements OrderDatabaseService{
	//在创建的时候就能够初始化，所以不需加载
	//初始化，只是把数据从文件中读入服务器，客户端要单独储存吗？？
	private ArrayList<OrderPO> orderList = reloadOrderList();

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
				if(orderList.get(i).getOrderNum() == order.getOrderNum())
					orderList.set(i, order);
			save();
			return ResultMessage.SUCCEED;
		}
		return ResultMessage.FAILED;
	}
	
	public ArrayList<OrderPO> getUnfinishedOrder(){
		return orderList;
	}
	
	public ResultMessage save() {
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("OrderList.ser"));
			try {
				oos.writeObject(orderList);
				oos.close();
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
}
