//»ÆÌÎ
package po;
import java.util.*;

public class MemberPO extends UserPO{
//	private String id;
//	private String name;
//	private String password;
	private ArrayList<OrderPO> orderList;
	private FavorityPO favority;
	private ArrayList<PromotionPO> promotionList;
	
	public MemberPO(String id,String name,String password){
		super(id, name, password, UserRole.Member);
	}

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public ArrayList<OrderPO> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<OrderPO> orderList) {
		this.orderList = orderList;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public FavorityPO getFavority() {
		return favority;
	}

	public void setFavority(FavorityPO favority) {
		this.favority = favority;
	}

	public ArrayList<PromotionPO> getPromotionList() {
		return promotionList;
	}

	public void setPromotionList(ArrayList<PromotionPO> promotionList) {
		this.promotionList = promotionList;
	}

	
	
}

