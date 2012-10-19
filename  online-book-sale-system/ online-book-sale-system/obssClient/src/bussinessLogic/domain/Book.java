package bussinessLogic.domain;

import po.BookPO;
import po.ResultMessage;

//ÓÈ¼Ñç÷

public class Book {
    private BookPO bookPO;
    
    public Book(BookPO b){
    	bookPO = b;
    }
    
    public ResultMessage addBook(BookPO b){
    	return ResultMessage.SUCCEED;
    }
    
	public ResultMessage deleteBook(String id){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage modifyBook(String id){
		return ResultMessage.SUCCEED;
	}
}
