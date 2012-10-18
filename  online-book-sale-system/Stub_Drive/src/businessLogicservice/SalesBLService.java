package businessLogicservice;

import java.util.ArrayList;

import databaseservice.Order;
import databaseservice.ResultMessage;

public interface SalesBLService {
	public ResultMessage putInCart(String id);//把商品加入购物车，返回添加成功
	public ArrayList<String> enterCart();//进入购物车，显示购物车信息
	public ResultMessage removeFromCart(String id);//进入购物车之后，进行删除，结束后要刷新
	public double calculate();//计算总价
	public double chooseCoupon (double percent);//选择打折券
	public double chooseVoucher (double voucher);//选择等价券
	public Order purchase();//生成订单
	public void endSale ();//结束整个购买 不会写！！！！！！！！！！！
}
