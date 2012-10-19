//»ÆÌÎ
package databaseService.user;

import po.PO;
import po.UserPO;

public class UserDatabaseService_Stub implements UserDatabaseService{

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
		PO po=new UserPO();
		return po;
	}

}

