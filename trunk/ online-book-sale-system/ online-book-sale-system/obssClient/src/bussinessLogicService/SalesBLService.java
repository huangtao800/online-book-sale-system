package bussinessLogicService;
//’≈—≈Ê√

import java.util.ArrayList;

import po.LineItemPO;
import po.OrderPO;
import po.ResultMessage;

public interface SalesBLService {
	public ResultMessage putInCart(String isbn, int number);
	public ArrayList<LineItemPO> enterCart();
	public ResultMessage removeFrromCart(String isbn);	
	public ResultMessage purchase(double price);	
	public double calucalte();
	public ArrayList<String> showSpecial();
	public double calculateByEquivalent(double deno);
    public double calculateByCupon(double rate);
	public ResultMessage endSale(OrderPO orderPO);
}
