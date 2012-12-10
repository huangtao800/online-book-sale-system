//»ÆÌÎ
package databaseService.user;

import java.rmi.RemoteException;

import po.PO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;

public class UserDatabaseService_Stub implements UserDatabaseService{

	@Override
	public ResultMessage insert(PO po) {
		// TODO Auto-generated method stub
		System.out.println("insert succeed");
		return null;
	}

	@Override
	public ResultMessage delete(PO po) {
		// TODO Auto-generated method stub
		System.out.println("Delete succeed");
		return null;
	}

	@Override
	public ResultMessage update(PO po) {
		// TODO Auto-generated method stub
		System.out.println("Update succeed");
		return null;
	}

	@Override
	public UserPO isExisit(String userName, String password, UserRole userRole)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}

