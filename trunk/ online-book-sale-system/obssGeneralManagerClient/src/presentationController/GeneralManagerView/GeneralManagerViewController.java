package presentationController.GeneralManagerView;

import java.util.ArrayList;
import bussinessLogic.controller.GeneralManagerController;
import bussinessLogic.controller.PresentController;
import bussinessLogic.controller.PromotionController;
import bussinessLogic.controller.UserController;
import bussinessLogicService.GeneralManagerBLService;
import bussinessLogicService.PresentBLService;
import bussinessLogicService.PromotionBLService;
import bussinessLogicService.UserBLService;
import po.GeneralManagerPO;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.PromotionPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.GeneralManagerView;

public class GeneralManagerViewController implements GeneralManagerViewControllerInterface{
	private static PromotionBLService promotionController=PromotionController.getInstance();
	private static PresentBLService presentController=PresentController.getInstance();
//	private static GeneralManagerBLService generalController=GeneralManagerController.getInstance();
	private static UserBLService userController=UserController.getInstance();
	private static 	GeneralManagerPO generalManagerPO;
	private GeneralManagerView view;
	private PromotionPO promotionPO;
	 private ArrayList<Present_Equivalent> present_EquivalentList;
	 private ArrayList<Present_Coupon> present_CouponList;
	
	
	public GeneralManagerViewController(GeneralManagerPO generalManagerPO){
		this.generalManagerPO= generalManagerPO;
		view=new GeneralManagerView(this);
		view.createView();	
	}
	
//	public PromotionPO checkUpdate(){//�鿴�����ֶΣ�����promotionPO����
//		getProPO();
//		return promotionPO;
//	}
	
	public PromotionPO getProPO(){//�����ݲ��ȡpromotionPo����
		this.promotionPO= promotionController.promotionPORead();
		return promotionPO;
	}
	
	public ResultMessage setPromotion_YES(PromotionPO proPO){//ȷ�����ô����ֶ�
		return  promotionController.promotionPOWrite(proPO);
	}
	
	//�����ݲ��ȡ��ȯ������Ϣ�б�
    public ArrayList<Present_Equivalent> getPresent_EquivalentList(){
    	this.present_EquivalentList=presentController.getPresent_EquivalentList();
    	return present_EquivalentList;
    }
    public ArrayList<Present_Coupon> getPresent_CouponList(){
    	this.present_CouponList=presentController.getPresent_CouponList();
    	return present_CouponList;
    }
   
    //�洢������Ϣ
    public ResultMessage writePresnet_Equivalent(Present_Equivalent present_equivalent){
    	return presentController.writePresnet_Equivalent(present_equivalent);
    }
	 public ResultMessage writePresent_Coupon(Present_Coupon present_coupon) {
		 return presentController.writePresent_Coupon(present_coupon);
	 }
	
	//�޸��û���Ϣ
	public ResultMessage  changeUser(UserPO old,UserPO newpo){
//		return generalController.updateUserPO(userPO, role);
		return userController .changeUser(old,newpo);
	}

	public GeneralManagerPO getUserPO(){
		return generalManagerPO;
	}

	@Override
	public void freshName(String userName) {
		// TODO Auto-generated method stub
		view.freshName(userName);
	}
	public void freshPassword(String newPW){
		view.freshPassword(newPW);
	}

}
