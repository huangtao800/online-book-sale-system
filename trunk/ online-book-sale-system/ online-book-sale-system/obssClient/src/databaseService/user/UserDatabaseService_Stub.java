//»ÆÌÎ
package databaseService.user;

import java.rmi.RemoteException;

import po.PO;
import po.UserPO;
import po.UserRole;

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

	@Override
	public UserPO isExisit(String userName, String password, UserRole userRole)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}

