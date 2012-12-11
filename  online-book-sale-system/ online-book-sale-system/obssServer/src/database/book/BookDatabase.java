package database.book;
//尤佳琪
import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.BookPO;
import po.PO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;

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
		  try {
			  FileOutputStream fos = new FileOutputStream("book.ser");
              ObjectOutputStream oos = new ObjectOutputStream(fos);                       
              oos.writeObject(po);
              oos.close();                        
              return ResultMessage.SUCCEED;
          } catch (Exception ex) { 
        	  ex.printStackTrace();   
        	  return ResultMessage.FAILED;
          }

	}


	@Override
	public ResultMessage delete(PO po) {
		// TODO Auto-generated method stub
		BookPO bookPO = (BookPO)po;
        ArrayList<BookPO> bookList = BookDatabase.getInstance().readFile();
        ResultMessage resultMessage = ResultMessage.FAILED;
        for(int i=0;i<bookList.size();i++){
        	if(bookPO.getISBN().equals(bookList.get(i).getISBN())){
        		bookList.get(i).setNumOfBook(0);
        		resultMessage = ResultMessage.SUCCEED;
        	}
        }
        
        return resultMessage;
	}


	@Override
	//用于修改
	public ResultMessage update(PO po) {
		// TODO Auto-generated method stub
		BookPO bookPO = (BookPO)po;
        ArrayList<BookPO> bookList = BookDatabase.getInstance().readFile();
        
        ResultMessage resultMessage = ResultMessage.FAILED;
        for(int i=0;i<bookList.size();i++){
        	if(bookPO.getISBN().equals(bookList.get(i).getISBN())){
        		bookList.get(i).setAuthor(bookPO.getAuthor());
        		bookList.get(i).setBookName(bookPO.getBookName());
        		bookList.get(i).setNumOfBook(bookPO.getNumOfBook());
        		bookList.get(i).setPress(bookPO.getPress());
        		bookList.get(i).setPrice(bookPO.getPrice());
        		bookList.get(i).setPublishDate(bookPO.getPublishDate());
        		bookList.get(i).setType(bookPO.getType());
        		
        		resultMessage = ResultMessage.SUCCEED;
        	}
        }
        
        return resultMessage;
	}
	
	public BookPO findThroughISBN(String isbn) {
		ArrayList<BookPO> bookList = BookDatabase.getInstance().readFile();
	    BookPO bookPO = null;
	    for(int i=0;i<bookList.size();i++){
	    	if(bookList.get(i).getISBN().equals(isbn)){
	    		bookPO = bookList.get(i);
	    	}
	    }
	    
		return bookPO;
	}
	
	//根据关键字返回相应的图书列表
	public ArrayList<BookPO>  findByKey(String name,String author,String press,
		     String publishDate) throws RemoteException{ 
		ArrayList<BookPO> arrayList = BookDatabase.getInstance().readFile();
		ArrayList<BookPO> bookList = new ArrayList<BookPO>();
		for(int i=0;i<arrayList.size();i++){
			if((arrayList.get(i).getBookName().equals(name)||name==null)&&
			   (arrayList.get(i).getAuthor().equals(author)||author==null)&&
			   (arrayList.get(i).getPress().equals(press)||press==null)&&
			   (arrayList.get(i).getPublishDate().equals(publishDate)||publishDate==null)){
				   bookList.add(arrayList.get(i));
			   }
		}
		
		return bookList;
	}
		
	//通过图书类型查找返回相应的图书列表
	public ArrayList<BookPO> findByType(String type)  {
		ArrayList<BookPO> arrayList = BookDatabase.getInstance().readFile();
		ArrayList<BookPO> bookList = new ArrayList<BookPO>();
		for(int i=0;i<arrayList.size();i++){
			if(arrayList.get(i).getType().equals(type)){
				   bookList.add(arrayList.get(i));
			   }
		}
		
		return bookList;
	}
	
	//
	private ArrayList<BookPO> readFile(){
		FileInputStream inputStream;
		ArrayList<BookPO> bookList=null;
		
		try {
			
		    inputStream=new FileInputStream("book.ser");
			ObjectInputStream objInput=new ObjectInputStream(inputStream);	
			bookList=(ArrayList<BookPO>)objInput.readObject();
			inputStream.close();
			objInput.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return bookList;
	}
	
}

