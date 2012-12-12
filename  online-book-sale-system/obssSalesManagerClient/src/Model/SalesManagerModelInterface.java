package Model;

import java.util.ArrayList;

import po.BookPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.PresentPO;
import po.ResultMessage;



//public interface SalesManagerModelInterface {
	public ArrayList<PresentPO> readPresentPOList();
//	public void writePresentPOList();
	public void sendPresent();
	public ResultMessage addBook(BookPO bookPO);
	public ResultMessage deleteBook(String isbm);
//	public ResultMessage changeBook(String isbn,BookPO  bookPO);
	public int indexOfBook(String s);
	public BookPO getBookPO(String s);
	public MemberPO getMemberPO(String s);
	public ArrayList<OrderPO> getUncompletedOrderPOList();
	public void writeUncompletedOrderPOList();
	public void updateMember_Order(String memberID,OrderState state,long orderNum);
	
}
