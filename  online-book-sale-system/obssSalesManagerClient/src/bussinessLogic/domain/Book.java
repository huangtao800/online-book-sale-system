package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import databaseService.book.BookDatabaseService;
import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;

//尤佳琪

public class Book{
	private BookPO bookPO;
	private BookDatabaseService bookDatabase;
	
	public Book(){
		try {
			bookDatabase = (BookDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/BookDatabase");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    //销售界面查询图书和图书的促销信息
	public ArrayList<BookPO>  findByKey(String name,String author,String press,String publishDate){    
		   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
		   try {
			    bookArray = bookDatabase.findByKey(name,author,press,publishDate);
		   } catch (RemoteException e) {
			   e.printStackTrace();
		   }
		   return bookArray;
	}
	
	public ArrayList<BookPO> findByType(String type){      //选择图书类别，返回相应的图书列表
		   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
		   try {
			    bookArray = bookDatabase.findByType(type);
		   } catch (RemoteException e) {
			   e.printStackTrace();
		   }
		   return bookArray;
	}
	
	public BookPO findByISBN(String isbn){      //输入图书ISBN，返回相应的图书列表
		   BookPO bookPO = new BookPO();
		   try {
			    bookPO = bookDatabase.findThroughISBN(isbn);
		   } catch (RemoteException e) {
			   e.printStackTrace();
		   }
		   return bookPO;
	}

	
    //管理图书（增，删，改）
	public ResultMessage addBook(BookPO bookPO){
		    try {
				return bookDatabase.insert(bookPO);
			} catch (RemoteException e) {
			
				e.printStackTrace();
				return ResultMessage.FAILED;
			}
		
	}
	
	public ResultMessage deleteBook(String isbn){
		try {
			BookPO bookPO = bookDatabase.findThroughISBN(isbn);
			if(bookPO==null){
				return ResultMessage.FAILED;
			}
			
			return bookDatabase.delete(bookPO);
		} catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	
	public ResultMessage modifyBook(BookPO b,String isbn){
 	    try {
			BookPO bookPO = bookDatabase.findThroughISBN(isbn);
			
			if(bookPO==null){
				return ResultMessage.FAILED;
			}else{
				return bookDatabase.update(bookPO);
			}
				
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI出现异常
		}
	}
	

	public ResultMessage updateBook(ArrayList<LineItemPO> salesList){
		  ArrayList<ResultMessage> resultList = new ArrayList<ResultMessage>();
		  ResultMessage result = ResultMessage.SUCCEED;
		  
		  for(int i=0;i<salesList.size();i++){
			  bookPO = salesList.get(i).getBook();
			  bookPO.setNumOfBook(bookPO.getNumOfBook()-salesList.get(i).getNumber());
			  
			  try {
				  resultList.add( bookDatabase.update(bookPO));
			  } catch (RemoteException e) {
				 
				  e.printStackTrace();
				  resultList.add( ResultMessage.FAILED);	//RMI出现异常
			  }
		  }
		   
		  for(int j=0;j<resultList.size();j++){
			  if(resultList.get(j)==ResultMessage.FAILED)
				  result = ResultMessage.FAILED;
		  }
		  
		  return result;
		   
		
	}
	
	//对图书类别的处理
	public ArrayList<String> getBookType(){
		ArrayList<String> bookTypeList = new ArrayList<String>();
		try{
			bookTypeList = bookDatabase.getBookType();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return bookTypeList;
	}

	public ResultMessage addBookType(String type){
		try{
			return bookDatabase.addBookType(type);
		}catch (Exception e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	public ResultMessage changeBookType(String beforeType,String afterType){
		try{
			return bookDatabase.changeBookType(beforeType, afterType);
		}catch (Exception e) {
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	public ArrayList<BookPO> getAllBook() {
		
		try{
			return bookDatabase.readFile();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
