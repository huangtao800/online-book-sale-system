package Controller;

import ModelService.PromotionModelInterface;
import PO.PresentPO;
import PO.PromotionPO;
import View.PromotionView;

public class PromotionController implements PromotionControllerInterface{
	PromotionModelInterface model;
	PromotionView view;
	PromotionPO promotionPO;
	
	public PromotionController(PromotionModelInterface model){
		this.model=model;
		view=new PromotionView(this);
		view.createProView();	
	}
	
//	public PromotionPO checkUpdate(){//�鿴�����ֶΣ�����promotionPO����
//		getProPO();
//		return promotionPO;
//	}
	
	public PromotionPO getProPO(){//�����ݲ��ȡpromotionPo����
		this.promotionPO=model.promotionPORead();
		return promotionPO;
	}
	
	public void setPromotion_YES(PromotionPO proPO){//ȷ�����ô����ֶ�
		 model.promotionPOWrite(proPO);
	}
	
//	public void setPromotion_NO(){//ȡ�����ô����ֶ�

	
	public void present_YES(PresentPO presentPO){//ȷ����ȯ��������
		model.presentPOWrite(presentPO);
	}
	
//	public void present_NO(){//ȡ����ȯ��������


}
