//黄涛
//Member模块中涉及销售经理的逻辑接口
package bussinessLogicService;
import java.util.ArrayList;
import po.*;

public interface MemberBLService {
	public String getMemberName();//获得会员名称
	public String getMemberID();//获得会员ID
	
	public ResultMessage addFavorities(BookPO bookPO);//添加图书进入收藏夹
	public ResultMessage removeFavorities(BookPO bookPO);//从收藏夹中移除
	
	public ResultMessage cancel(String password);//注销会员
	
	public ArrayList<CouponPO> getCouponList();//获得打折券列表
	public ArrayList<EquivalentPO> getEquivalentList();//获得等价券列表
	
	public ResultMessage addOrder(OrderPO order);//增加一条订单记录
	
	public ArrayList<OrderPO> getOrderRecord();//查看自己的购买记录
	
}
