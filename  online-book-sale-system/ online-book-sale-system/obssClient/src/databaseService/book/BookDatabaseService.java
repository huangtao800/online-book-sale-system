//�ȼ���
package databaseService.book;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.BookPO;
import po.PO;
import databaseService.DatabaseService;

//������Ա�Զ�̵��õķ���
public interface BookDatabaseService extends DatabaseService{
	public BookPO findThroughISBN(String isbn) throws RemoteException;
	//���ݹؼ��ַ�����Ӧ��ͼ���б�
	public ArrayList<BookPO>  findByKey(String name,String author,String press,
			     String publishDate) throws RemoteException; 	 
	//ͨ��ͼ�����Ͳ��ҷ�����Ӧ��ͼ���б�
	public ArrayList<BookPO> findByType(String type)  throws RemoteException;
}
