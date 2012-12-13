package presentationController.PromotionView;

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
import po.PresentPO;
import po.PromotionPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.PromotionView;

public class PromotionViewController implements PromotionViewControllerInterface{
	private static PromotionBLService promotionController=PromotionController.getInstance();
	private static PresentBLService presentController=PresentController.getInstance();
//	private static GeneralManagerBLService generalController=GeneralManagerController.getInstance();
	private static UserBLService userController=UserController.getInstance();
	private static 
	GeneralManagerPO generalManagerPO;
	PromotionView view;
	PromotionPO promotionPO;
	
	
	public PromotionViewController(GeneralManagerPO generalManagerPO){
		this.generalManagerPO= generalManagerPO;
		view=new PromotionView(this);
		view.createProView();	
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
	
//	public void setPromotion_NO(){//ȡ�����ô����ֶ�

	
	public ResultMessage present_YES(PresentPO presentPO){//ȷ����ȯ��������
		return presentController.writePresentPOList(presentPO); 
	}
	
	public ArrayList<PresentPO> getPresentPOList(){
		return presentController.getPresentPOList();
	}
	
	//�޸��û���Ϣ
	public ResultMessage  changeUser(String userName, String id,String password,UserRole userRole){
//		return generalController.updateUserPO(userPO, role);
		return userController .changeUser(userName, id, password, userRole);
	}

	public GeneralManagerPO getUserPO(){
		return generalManagerPO;
	}

}
