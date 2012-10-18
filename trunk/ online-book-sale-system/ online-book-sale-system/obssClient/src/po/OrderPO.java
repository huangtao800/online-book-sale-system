package po;

public class OrderPO implements PO{
	static long count = 00000;
	private long orderNum;
	public OrderPO(){
		orderNum = count ++;
	}
	public long getOrderNum(){
		return orderNum;
	}


}
