package bussinessLogic.controller;

import po.BookPO;
import po.ResultMessage;
import bussinessLogicService.*;

public class BookBLService_Driver {
     public void drive(BookBLService bookBLService){
    	 BookPO bookPO = new BookPO();
    	 ResultMessage result = bookBLService.addBook(bookPO);
    	 if(result==ResultMessage.SUCCEED){
    		 System.out.println("Book Exist!");
    	 }
     }
}
