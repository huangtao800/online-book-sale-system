package bussinessLogic.controller;

import java.util.ArrayList;
import po.*;
import bussinessLogic.domain.Book;
import bussinessLogicService.*;

public class BookController implements BookBLService{
	private static BookController uniqueInstance;
    private Book book=new Book();
    
    private BookController(){
    	
    }
	
	public static BookController getInstance(){
		if(uniqueInstance==null){
			uniqueInstance = new BookController();
		}
		
		return uniqueInstance;
	}

    //通过关键词或者图书类型来查找图书
	public ArrayList<BookPO>  findByKey(String name){      //根据关键字返回相应的图书列表
		   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
		   return bookArray;
	}
	
	public ArrayList<BookPO> findByType(String type){      //选择图书类别，返回相应的图书列表
		   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
		   return bookArray;
	}
	
 	public BookPO findByISBN(String ISBN){      //输入图书ISBN，返回相应的图书列表
		   BookPO bookPO = book.findByISBN(ISBN);
		   return bookPO;
	}

	
	//管理图书（增，删，改）
	public ResultMessage addBook(BookPO b){
		return book.addBook(b);
	}
	
	public ResultMessage deleteBook(String isbn){
		return book.deleteBook(isbn);
	}
	
	public ResultMessage modifyBook(BookPO b){
		String isbn = b.getISBN();
		return book.modifyBook(b, isbn);
	}
	
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList){
		BookPO bookPO = new BookPO();
		LineItemPO list = salesList.get(0);
		bookPO = list.getBook();
		String isbn = bookPO.getISBN();
		if(isbn=="11111"){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}

}
