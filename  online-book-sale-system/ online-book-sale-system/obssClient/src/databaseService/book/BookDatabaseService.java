//����
package databaseService.book;

import java.rmi.RemoteException;

import po.PO;
import databaseService.DatabaseService;

//������Ա�Զ�̵��õķ���
public interface BookDatabaseService extends DatabaseService{
	public PO find(String id) throws RemoteException;
}
