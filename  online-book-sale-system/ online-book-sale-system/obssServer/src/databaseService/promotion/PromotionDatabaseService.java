//∂≠» π„
package databaseService.promotion;

import po.PresentPO;
import po.PromotionPO;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface PromotionDatabaseService extends DatabaseService{

	    public PromotionPO promotionPORead();  
	    public ResultMessage promotionPOWrite(PromotionPO proPO);
	
}
