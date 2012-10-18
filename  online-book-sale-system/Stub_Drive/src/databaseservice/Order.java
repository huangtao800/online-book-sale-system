package databaseservice;

public class Order {
	static long count = 00000;
	private long orderNum;
	public Order(){
		orderNum = count ++;
	}
	public long getOrderNum(){
		return orderNum;
	}

}
