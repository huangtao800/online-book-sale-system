//»ÆÌÎ
package databaseService.member;

import po.MemberPO;
import po.PO;

public class MemberDatabaseService_Stub implements MemberDatabaseService{

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
		PO po=new MemberPO("111111", "huangtao");
		return po;
	}

}
