//»ÆÌÎ
package databaseService.promotion;

import po.PO;
import po.PromotionPO;

public class PromotionDatabaseService_Stub implements PromotionDatabaseService{

	@Override
	public void insert(PO po) {
		// TODO Auto-generated method stub
		System.out.println("insert succeed");
	}

	@Override
	public void delete(PO po) {
		// TODO Auto-generated method stub
		System.out.println("Delete succeed");
	}

	@Override
	public void update(PO po) {
		// TODO Auto-generated method stub
		System.out.println("Update succeed");
	}

	@Override
	public PO find(String id) {
		// TODO Auto-generated method stub
		System.out.println("find succeed");
		PO po=new PromotionPO();
		return po;
	}

}

