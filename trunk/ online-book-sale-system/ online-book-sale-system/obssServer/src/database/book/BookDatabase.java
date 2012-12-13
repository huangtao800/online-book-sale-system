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
		int index = BookDatabase.getInstance().isExist(po);
		BookPO bookPO = (BookPO)po;
		ArrayList<BookPO> bookList = BookDatabase.getInstance().readFile();
		if(index!=-1){
			bookList.get(index).setNumOfBook(bookList.get(index).getNumOfBook()+bookPO.getNumOfBook());
	        return ResultMessage.SUCCEED;
		}else{
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

	}

	private int isExist(PO po){
		BookPO bookPO = (BookPO)po;
        ArrayList<BookPO> bookList = BookDatabase.getInstance().readFile();
        int index = -1;
        for(int i=0;i<bookList.size();i++){
        	if(bookPO.getISBN().equals(bookList.get(i).getISBN())){
        		index = i;
        	}
        }
        
        return index;
	}

	@Override
	public ResultMessage delete(PO po) {
		// TODO Auto-generated method stub
		int index = BookDatabase.getInstance().isExist(po);
		BookPO bookPO = (BookPO)po;
        ArrayList<BookPO> bookList = BookDatabase.getInstance().readFile();
        
        if(index!=-1){
			bookList.get(index).setNumOfBook(0);
	        return ResultMessage.SUCCEED;
		}else{
	   	    return ResultMessage.NOTEXIST;
	    }
 
	}


	@Override
	//用于修改
	public ResultMessage update(PO po) {
		int index = BookDatabase.getInstance().isExist(po);
		BookPO bookPO = (BookPO)po;
		ArrayList<BookPO> bookList = BookDatabase.getInstance().readFile();
		
		if(index!=-1){
			bookList.get(index).setAuthor(bookPO.getAuthor());
    		bookList.get(index).setBookName(bookPO.getBookName());
    		bookList.get(index).setNumOfBook(bookPO.getNumOfBook());
    		bookList.get(index).setPress(bookPO.getPress());
    		bookList.get(index).setPrice(bookPO.getPrice());
    		bookList.get(index).setPublishDate(bookPO.getPublishDate());
    		bookList.get(index).setType(bookPO.getType());
	        return ResultMessage.SUCCEED;
		}else{
			return ResultMessage.NOTEXIST;
		}
       
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

