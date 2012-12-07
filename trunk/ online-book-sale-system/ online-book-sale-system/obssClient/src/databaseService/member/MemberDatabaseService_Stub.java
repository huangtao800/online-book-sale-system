//»ÆÌÎ
package databaseService.member;

import java.rmi.RemoteException;

import po.BookPO;
import po.MemberPO;
import po.PO;
import po.ResultMessage;

public class MemberDatabaseService_Stub implements MemberDatabaseService{

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
	public ResultMessage cancel(MemberPO memberPO){
		// TODO Auto-generated method stub
		return null;
	}

}
