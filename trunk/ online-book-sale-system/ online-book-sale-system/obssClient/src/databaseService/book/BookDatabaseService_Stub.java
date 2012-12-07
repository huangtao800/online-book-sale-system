package databaseService.book;

import po.BookPO;
import po.PO;
import po.ResultMessage;

public class BookDatabaseService_Stub implements BookDatabaseService{

	@Override
	public ResultMessage insert(PO po) {
		// TODO Auto-generated method stub
		System.out.println("insert succeed");
		return null;
	}

	@Override
	public ResultMessage delete(PO po) {
		// TODO Auto-generated method stub
		System.out.println("delete succeed");
		return null;
	}

	@Override
	public ResultMessage update(PO po) {
		// TODO Auto-generated method stub
		System.out.println("update succeed");
		return null;
	}

	@Override
	public PO find(String id) {
		// TODO Auto-generated method stub
		System.out.println("find succeed");
		PO po=new BookPO();
		return po;
	}

}
