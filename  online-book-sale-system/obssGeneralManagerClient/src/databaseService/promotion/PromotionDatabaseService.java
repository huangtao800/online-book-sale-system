package databaseService.promotion;

import java.rmi.RemoteException;
import po.PromotionPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import databaseService.DatabaseService;

public interface PromotionDatabaseService extends DatabaseService{

    public PromotionPO promotionPORead();  
    public ResultMessage promotionPOWrite(PromotionPO proPO);
 
}
