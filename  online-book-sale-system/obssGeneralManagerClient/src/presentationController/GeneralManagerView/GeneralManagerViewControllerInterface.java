package presentationController.GeneralManagerView;

import java.util.ArrayList;
import po.GeneralManagerPO;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.PromotionPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public interface GeneralManagerViewControllerInterface {

	public PromotionPO getProPO();
	public ResultMessage setPromotion_YES(PromotionPO proPO);
	
	public ResultMessage  changeUser(UserPO old,UserPO newpo);
	public GeneralManagerPO getUserPO();
	 public ArrayList<Present_Equivalent> getPresent_EquivalentList();
     public ArrayList<Present_Coupon> getPresent_CouponList();
     public ResultMessage writePresnet_Equivalent(Present_Equivalent present_equivalent);
 	 public ResultMessage writePresent_Coupon(Present_Coupon present_coupon) ;
	public void freshName(String userName);
 	 
 	 
	
}
