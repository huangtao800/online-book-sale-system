package database.book;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.BookPO;
import po.PO;
import po.ResultMessage;

import database.init.InitDatabase;
import databaseService.book.BookDatabaseService;
import databaseService.init.InitDatabaseService;

public class BookDatabase extends UnicastRemoteObject implements BookDatabaseService{
	private InitDatabaseService initDatabase;
	private static BookDatabase instance=null;

	protected BookDatabase() throws RemoteException{
		super();
		initDatabase=InitDatabase.getInstance();
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
	public ResultMessage insert(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage delete(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage update(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		BookPO bookPO=(BookPO) po;
		
		return null;
	}
}

