package bussinessLogic.domain;

import java.util.ArrayList;
import java.util.Date;

import bussinessLogicService.BookBLService;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;

//尤佳琪

public class Book implements BookBLService{
	String bookName,bookType,bookISBN;
    BookPO bookPO = new BookPO();
    Book book;
    
    
    public Book(){
    }
    
    public Book(String name,String type,String isbn,BookPO po){
    	bookISBN = isbn;
    	bookName = name;
    	bookType = type;
    	bookPO = po;
    }

    //销售界面查询图书和图书的促销信息
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
		if(b==bookPO){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED;
		}
	}
	
	public ResultMessage deleteBook(String id){
		if(id=="11111"){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}
	
	public ResultMessage modifyBook(String id){
		if(id=="11111"){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}
	
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList){
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
