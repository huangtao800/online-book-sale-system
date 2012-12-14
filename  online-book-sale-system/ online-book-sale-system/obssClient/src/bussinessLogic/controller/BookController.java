package bussinessLogic.controller;

import java.util.ArrayList;
import po.*;
import bussinessLogic.domain.Book;
import bussinessLogicService.*;

public class BookController implements BookBLService{
	private static BookController uniqueInstance;
    private Book book = new Book();
    
    private BookController(){
    	
    }
	
	public static BookController getInstance(){
		if(uniqueInstance==null){
			uniqueInstance = new BookController();
		}
		
		return uniqueInstance;
	}

    //通过关键词或者图书类型来查找图书
	public ArrayList<BookPO>  findByKey(String name,String author,String press,String publishDate){      //根据关键字返回相应的图书列表
		   return book.findByKey(name, author, press, publishDate);
	}
	
	public ArrayList<BookPO> findByType(String type){      //选择图书类别，返回相应的图书列表
		   return book.findByType(type);
	}
	
 	public BookPO findByISBN(String isbn){      //输入图书ISBN，返回相应的图书列表
		   return book.findByISBN(isbn);
	}

	
	//管理图书（增，删，改）
	public void addBook(BookPO b){
		book.addBook(b);
	}
	
	public ResultMessage deleteBook(String isbn){
		return book.deleteBook(isbn);
	}
	
	public ResultMessage modifyBook(BookPO b){
		String isbn = b.getISBN();
		return book.modifyBook(b, isbn);
	}
	
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList){
		return book.updateBook(salesList);
	}
	
	// 对图书类别的处理
	public ArrayList<String> getBookType(){
		return book.getBookType();
	}
	
	public ResultMessage addBookType(String type){
		return book.addBookType(type);
	}
	
	public ResultMessage changeBookType(String beforeType,String afterType){
		return book.changeBookType(beforeType, afterType);
	}

}
