package presentationController.Sales;

import java.util.ArrayList;

import po.LineItemPO;
import po.ResultMessage;

public interface SalesViewService {
	public void initCartView();
	public void initPayFrame();
	public void initOrderView(OrderVO orderVO);
	public ResultMessage putInCart(String isbn, int number);
	public ResultMessage removeFromCart(int index);
	public double getSpecialPrice(int i);
	public void pay();
	public ArrayList<LineItemPO> getCartList();

}
