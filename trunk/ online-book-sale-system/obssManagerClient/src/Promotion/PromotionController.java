package Promotion;

import View.PromotionView;

public class PromotionController implements PromotionControllerInterface{
	PromotionModelInterface model;
	PromotionView view;
	PromotionPO promotionPO;
	
	public PromotionController(PromotionModelInterface model){
		this.model=model;
		view=new PromotionView(this,model);
		view.createProView();	
	}
	
//	public PromotionPO checkUpdate(){//查看促销手段，返回promotionPO对象
//		getProPO();
//		return promotionPO;
//	}
	
	public PromotionPO getProPO(){//从数据层获取promotionPo对象
		this.promotionPO=model.promotionPORead();
		return promotionPO;
	}
	
	public void setPromotion_YES(PromotionPO proPO){//确认设置促销手段
		 model.promotionPOWrite(proPO);
	}
	
//	public void setPromotion_NO(){//取消设置促销手段

	
	public void present_YES(PresentPO presentPO){//确认礼券赠送设置
		model.presentPOWrite(presentPO);
	}
	
//	public void present_NO(){//取消礼券赠送设置


}
