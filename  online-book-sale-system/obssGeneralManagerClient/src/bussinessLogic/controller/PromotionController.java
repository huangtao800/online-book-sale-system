package bussinessLogic.controller;

import po.PresentPO;
import po.PromotionPO;
import po.ResultMessage;
import bussinessLogic.domain.Promotion;
import bussinessLogicService.PromotionBLService;

public class PromotionController implements PromotionBLService{
	private static Promotion promotion=new Promotion();
	private static PromotionBLService promotionController;
	
	
	private PromotionController(){
		
	}
	
	public static PromotionBLService getInstance(){
		if(promotionController==null){
			promotionController=new PromotionController();
		}
		return promotionController;
	}
	
    public PromotionPO promotionPORead(){
    	return promotion.promotionPORead();
    }
    
    public ResultMessage promotionPOWrite(PromotionPO proPO){
    	return promotion.promotionPOWrite(proPO);
    }
    
//    public PresentPO readPresentPOList(){
//    	return promotion.readPresentPOList();
//    }
//    
//    public ResultMessage presentPOWrite(PresentPO proPO){
//    	return promotion.presentPOWrite(proPO);
//    }

}
