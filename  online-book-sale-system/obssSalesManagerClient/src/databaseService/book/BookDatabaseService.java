//尤佳琪
package databaseService.book;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.BookPO;
import po.PO;
import databaseService.DatabaseService;

//定义可以被远程调用的方法
public interface BookDatabaseService extends DatabaseService{
	public BookPO findThroughISBN(String isbn) throws RemoteException;
	//根据关键字返回相应的图书列表
	public ArrayList<BookPO>  findByKey(String name,String author,String press,
			     String publishDate) throws RemoteException; 	 
	//通过图书类型查找返回相应的图书列表
	public ArrayList<BookPO> findByType(String type)  throws RemoteException;
}
