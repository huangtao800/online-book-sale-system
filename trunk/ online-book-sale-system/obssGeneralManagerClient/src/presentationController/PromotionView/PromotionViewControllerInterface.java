package presentationController.PromotionView;

import java.util.ArrayList;

import po.GeneralManagerPO;
import po.PresentPO;
import po.PromotionPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import  po.GeneralManagerPO;

public interface PromotionViewControllerInterface {

	public PromotionPO getProPO();
	public ResultMessage present_YES(PresentPO presentPO);
	public ResultMessage setPromotion_YES(PromotionPO proPO);
	public ArrayList<PresentPO> getPresentPOList();
	public ResultMessage  changeUser(String userName, String id,String password,UserRole userRole);
	public GeneralManagerPO getUserPO();
	
}
