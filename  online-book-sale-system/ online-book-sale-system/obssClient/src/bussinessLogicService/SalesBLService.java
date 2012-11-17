package bussinessLogicService;
//’≈—≈Ê√
import java.util.ArrayList;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;

public interface SalesBLService {
	public ResultMessage putInCart(BookPO book, int number);
	public ResultMessage enterCart();
	public ResultMessage removeFromCart(String id);
	public double commonCalculate();
	public ArrayList<LineItemPO> purchase();
	public ArrayList<LineItemPO> getSalesList();
	public ResultMessage updateSale() ;
}
