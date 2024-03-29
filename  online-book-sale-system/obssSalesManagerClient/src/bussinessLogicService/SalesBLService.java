package bussinessLogicService;
//张雅婷

import java.util.ArrayList;

import po.LineItemPO;
import po.ResultMessage;
import vo.OrderVO;

public interface SalesBLService {
	public ResultMessage putInCart(String isbn, int number);
	public ResultMessage removeFrromCart(int index);
	public double getTotalPrice();//得到购物车商品的总价（原价）
	public ArrayList<String> showSpecial(double commonPrice);
	public double getSpecialPrice(int i);
	public OrderVO pay(double price);//传入的是实际价格，生成订单	
	public ArrayList<LineItemPO> getCartList();//得到商品列表
	public void endSale();//得到订单的VO,并更新数据
	
}
