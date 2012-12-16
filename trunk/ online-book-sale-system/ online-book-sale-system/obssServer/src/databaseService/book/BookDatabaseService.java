//youjiaqi
package databaseService.book;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.BookPO;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface BookDatabaseService extends DatabaseService{
	public BookPO findThroughISBN(String isbn) throws RemoteException;
	//���ݹؼ��ַ�����Ӧ��ͼ���б�
	public ArrayList<BookPO>  findByKey(String name,String author,String press,
			     String publishDate) throws RemoteException; 	 
	//ͨ��ͼ�����Ͳ��ҷ�����Ӧ��ͼ���б�
	public ArrayList<BookPO> findByType(String type)  throws RemoteException;
	//��ͼ�����Ĵ���
	public ArrayList<String> getBookType() throws RemoteException;
	public ResultMessage addBookType(String type) throws RemoteException;
	public ResultMessage changeBookType(String beforeType,String afterType)throws RemoteException;
	public ArrayList<BookPO> readFile() throws RemoteException;
}
