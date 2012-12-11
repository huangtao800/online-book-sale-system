package database.book;

import java.awt.print.Book;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.BookPO;
import po.PO;
import po.ResultMessage;

import database.init.InitDatabase;
import databaseService.book.BookDatabaseService;
import databaseService.init.InitDatabaseService;

//代理
public class BookDatabase extends UnicastRemoteObject implements BookDatabaseService{
	private BookDatabaseService bookDatabaseService;
	private static BookDatabase instance=null;

	protected BookDatabase() throws RemoteException{
		super();
		
	}

	
	public static BookDatabase getInstance(){
		if(instance==null){
			try {
				instance=new BookDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return instance;
	}


	@Override
	public ResultMessage insert(PO po){
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage delete(PO po) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage update(PO po) {
		// TODO Auto-generated method stub
		BookPO bookPO=(BookPO) po;
		
		return null;
	}
	
	public BookPO findThroughISBN(String isbn) {
		BookPO bookPO = new BookPO();
		return bookPO;
	}
	
	//根据关键字返回相应的图书列表
	public ArrayList<BookPO>  findByKey(String name,String author,String press,
		     String publishDate) throws RemoteException{ 
		ArrayList<BookPO> arrayList = new ArrayList<BookPO>();
		return arrayList;
	}
		
	//通过图书类型查找返回相应的图书列表
	public ArrayList<BookPO> findByType(String type)  {
		ArrayList<BookPO> arrayList = new ArrayList<BookPO>();
		return arrayList;
	}
	
}

