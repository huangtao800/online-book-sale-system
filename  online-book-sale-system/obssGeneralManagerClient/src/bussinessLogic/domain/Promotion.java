package bussinessLogic.domain;

import java.rmi.Naming;
import po.PromotionPO;
import po.ResultMessage;

import databaseService.promotion.PromotionDatabaseService;

public class Promotion {

	private PromotionDatabaseService promotionDatabase;
	
	public Promotion(){
		try {
			promotionDatabase=(PromotionDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/PromotionDatabase");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
    public PromotionPO promotionPORead(){
    	return promotionDatabase.promotionPORead();
    }
    
    public ResultMessage promotionPOWrite(PromotionPO proPO){
    	return promotionDatabase.promotionPOWrite(proPO);
    }
    
  
    }
	

