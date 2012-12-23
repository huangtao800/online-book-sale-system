package presentationController.Sales;

import java.util.ArrayList;

import po.LineItemPO;
import po.ResultMessage;

public interface SalesViewService {
	public void initCartView();
	public ResultMessage initPayFrame();
	public void initOrderView(OrderVO orderVO);
	
	public ResultMessage removeFromCart(int index);
	public ResultMessage addFavorities(int index);
	public ResultMessage changeLineItemNumber(int i, int number);
	public void refreshCartList();
	
	public double getSpecialPrice(int i);
	public void pay(String address,int index);
	
	public ArrayList<LineItemPO> getCartList();
}