//∂≠» π„
package databaseService.promotion;

import java.rmi.RemoteException;

import po.PresentPO;
import po.PromotionPO;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface PromotionDatabaseService extends DatabaseService{

	    public PromotionPO promotionPORead() throws RemoteException;  
	    public ResultMessage promotionPOWrite(PromotionPO proPO) throws RemoteException;
	
}
