//黄涛
package bussinessLogicService;
import java.util.ArrayList;
import po.*;

public interface MemberBLService {
	public String getMemberName();//获得会员名称
	public String getMemberID();//获得会员ID
	
	public ResultMessage addFavorities(String id);//添加图书进入收藏夹
	public ResultMessage removeFavorities(String id);//从收藏夹中移除
	
	public ResultMessage addEquivalent(EquivalentPO e);//添加等价券
	public ResultMessage addCoupon(CouponPO c);//添加打折券

	public ResultMessage changeOrder();//修改订单状态
	
	public ResultMessage register(String id,String password);//注册会员
	public ResultMessage cancel(String id,String password);//注销会员
	
	public ArrayList<OrderPO> getOrderRecord();//查看购买记录
	public MemberPO getInfo();//查看会员信息
	
}
