//»ÆÌÎ
package po;
import java.util.*;


public class CustomerPO extends UserPO{

	private boolean isOn;
	public boolean isOn() {
		return isOn;
	}


	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	private ArrayList<OrderPO> orderList;
	private FavorityPO favority;
	private ArrayList<CouponPO> couponList;
	private ArrayList<EquivalentPO> equivalentList;
	private Cart cart;
	private String address;
	private int points;
	private VIPRank rank;
	private int[] pointBorder={1000,2000,3000,4000,5000};

	public CustomerPO(String id,String name,String password,String address){
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
		setRank();
	}


	public VIPRank getRank() {
		return rank;
	}


	private void setRank() {
		if(points<=pointBorder[0]){
			this.rank=VIPRank.VIP1;
		}else if(points<=pointBorder[1]){
			this.rank=VIPRank.VIP2;
		}else if(points<=pointBorder[2]){
			this.rank=VIPRank.VIP3;
		}else if(points<=pointBorder[3]){
			this.rank=VIPRank.VIP4;
		}else {
			this.rank=VIPRank.VIP5;
		}
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
