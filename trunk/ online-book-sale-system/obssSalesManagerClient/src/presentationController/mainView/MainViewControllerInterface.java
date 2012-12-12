package presentationController.mainView;

import java.util.ArrayList;

import po.BookPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.PresentPO;
import po.ResultMessage;



public interface MainViewControllerInterface {
    public ArrayList<PresentPO> getPresentPOList();
    public ResultMessage sendPresent();
    public ResultMessage addBook(BookPO bookPO);
    public ResultMessage deleteBook(String s);
    public int indexOfBook(String s); 
    public BookPO getBookPO(String s);
    public MemberPO getMemberPO(String s);
    public ArrayList<OrderPO> getUncompletedOrderPOList();
    public void writeUncompletedOrderPOList();
    public void updateMember_Order(String memberID,OrderState state,long orderNum);
}
