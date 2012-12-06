//»ÆÌÎ
package po;
import java.util.*;

public class MemberPO extends UserPO{

	private ArrayList<OrderPO> orderList;
	private FavorityPO favority;
	private ArrayList<CouponPO> couponList;
	private ArrayList<EquivalentPO> equivalentList;
	
	public MemberPO(String id,String name,String password){
		super(id, name, password, UserRole.Member);
	}


	public ArrayList<CouponPO> getCouponList() {
		return couponList;
	}


	public void setCouponList(ArrayList<CouponPO> couponList) {
		this.couponList = couponList;
	}


	public ArrayList<EquivalentPO> getEquivalentList() {
		return equivalentList;
	}


	public void setEquivalentList(ArrayList<EquivalentPO> equivalentList) {
		this.equivalentList = equivalentList;
	}


	public ArrayList<OrderPO> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<OrderPO> orderList) {
		this.orderList = orderList;
	}


	public FavorityPO getFavority() {
		return favority;
	}

	public void setFavority(FavorityPO favority) {
		this.favority = favority;
	}	
	
}
