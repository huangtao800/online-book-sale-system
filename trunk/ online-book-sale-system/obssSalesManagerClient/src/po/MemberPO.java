//»ÆÌÎ
package po;
import java.util.*;


public class MemberPO extends UserPO{

	private ArrayList<OrderPO> orderList;
	private FavorityPO favority;
	private ArrayList<CouponPO> couponList;
	private ArrayList<EquivalentPO> equivalentList;
	private Cart cart;
	private String address;
	private int points;
	private VIPRank rank;

	public MemberPO(String id,String name,String password,String address){
		super(id, name, password, UserRole.Member);
		setAddress(address);
		this.orderList=new ArrayList<OrderPO>();
		favority=new FavorityPO();
		couponList=new ArrayList<CouponPO>();
		equivalentList=new ArrayList<EquivalentPO>();
		cart=new Cart();
		points=0;
		rank=VIPRank.VIP1;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public VIPRank getRank() {
		return rank;
	}


	public void setRank(VIPRank rank) {
		this.rank = rank;
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
	
	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}	
	
}
