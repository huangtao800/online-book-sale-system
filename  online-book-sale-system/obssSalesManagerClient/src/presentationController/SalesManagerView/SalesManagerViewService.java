package presentationController.SalesManagerView;

import java.util.ArrayList;

import po.BookPO;
import po.CustomerPO;
import po.OrderPO;
import po.OrderState;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.ResultMessage;
import po.SalesManagerPO;

public interface SalesManagerViewService {
	public ArrayList<Present_Equivalent> getPresent_EquivalentList();
    public ArrayList<Present_Coupon> getPresent_CouponList();
    public ResultMessage sendPresent();
    public ResultMessage addBook(BookPO bookPO);
    public ResultMessage deleteBook(String s);
    public BookPO getBookPO(String s);
    public ResultMessage changeBookPO(BookPO bookPO);
    public CustomerPO getMemberPO(String s);
    public ArrayList<OrderPO> getUncompletedOrderPOList();
    public ResultMessage writeUncompletedOrderPOList(OrderPO orderPO);
    public ResultMessage updateMember_Order(String memberID,OrderState state,long orderNum);
    public ArrayList<String> getTypeList();
    
    public ResultMessage addBookType(String newType);
    public ResultMessage changeBookType(String oldType,String newType);
    public ResultMessage deleteBookType(String type);
    
	public SalesManagerPO getUserPO();
	
	public void freshName(String name);
	public void freshPassword(String newPW);
}