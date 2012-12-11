//黄涛
package databaseService.book;

import java.rmi.RemoteException;

import po.PO;
import databaseService.DatabaseService;

//定义可以被远程调用的方法
public interface BookDatabaseService extends DatabaseService{
	public PO find(String id) throws RemoteException;
}
