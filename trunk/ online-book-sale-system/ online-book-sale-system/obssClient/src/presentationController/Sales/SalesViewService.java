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
	public ResultMessage addFavorities(int index);
	public double getSpecialPrice(int i);
	public void pay(String address);
	public void endSale();
	public ArrayList<LineItemPO> getCartList();

}
