package po;
//������
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class OrderPO implements PO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//�µ�ʱ�� date  ������~  ��utility�������һ��Date��~
	//productItem �Ƕ����е���Ʒ��Ϣ�б�
	private static long count = 00000;
	private long orderNum;
	private ArrayList<LineItemPO> productList;
	private double totalPrice;
	private OrderState state;
	private String memberID;
	private Calendar date;
	private String address;
	
	public OrderPO(ArrayList<LineItemPO> productList, String memberID, double totalPrice, String address){
		this.orderNum = count ++;
		this.state = OrderState.ORDERDED;
		this.productList = productList;
		this.memberID = memberID;
		this.totalPrice = totalPrice;
		this.date=new GregorianCalendar();
		this.address = address;
	}
	public Calendar getDate() {
		return date;
	}
	public long getOrderNum(){
		return orderNum;
	}
	public void setOrderState(OrderState state){
		this.state = state;
	}
	public OrderState getOrderState(){
		return state;
	}
	public ArrayList<LineItemPO> getProductList(){
		return productList;
	}
	public String getMemberID(){
		return memberID;
	}
	public double getTotalPrice(){
		return totalPrice;
	}
	
	public String toString(){
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		 String product="";
		 for(int i=0;i<productList.size(); i++){
			 product += ("\n"+"    "+productList.get(i).getBook().getBookName()+"  "+productList.get(i).getNumber()
					              + "��  "+ productList.get(i).getSumPrice()+"Ԫ");
		 }
		return "�������:"+orderNum+"\n��Ʒ�б�:"+product+"\n�µ�����:"+
		            sdf.format(date.getTime())+"\n�ܼ�:"+totalPrice+"\n����״̬:"+state ;
	
	}
	public String getAddress(){
		return address;
	}


}
