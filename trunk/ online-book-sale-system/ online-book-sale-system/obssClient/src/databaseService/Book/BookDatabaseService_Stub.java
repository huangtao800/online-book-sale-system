//»ÆÌÎ
package databaseService.Book;

import po.BookPO;
import po.PO;

public class BookDatabaseService_Stub implements BookDatabaseService{

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
		PO po=new BookPO();
		return po;
	}

}
