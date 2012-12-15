package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;

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
    	try {
			return promotionDatabase.promotionPORead();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
    
    public ResultMessage promotionPOWrite(PromotionPO proPO){
    	try {
			return promotionDatabase.promotionPOWrite(proPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
    
  
    }
	

