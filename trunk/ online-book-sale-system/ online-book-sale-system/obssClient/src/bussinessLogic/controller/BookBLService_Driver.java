package bussinessLogic.controller;
//尤佳琪
import po.BookPO;
import po.ResultMessage;

public class BookBLService_Driver {
	
     public void drive(BookBLService_Stub bookBLService){
    	 BookPO bookPO = new BookPO();
    	 
    	 ResultMessage result1 = bookBLService.addBook(bookPO);
    	 if(result1==ResultMessage.SUCCEED){
    		 System.out.println("Add Succeed!");
    	 }
    	 
    	 ResultMessage result2 = bookBLService.deleteBook("11111");
    	 if(result2==ResultMessage.SUCCEED){
    		 System.out.println("Delete Succeed!");
    	 }
    	 
    	 ResultMessage result3 = bookBLService.modifyBook("11111");
    	 if(result3==ResultMessage.SUCCEED){
    		 System.out.println("Modify Succeed!");
    	 }
    	 
    	 bookBLService.findByKey("Java语言程序设计");
    	 System.out.println("FindByKey Succeed!");
    	
    	 
    	 bookBLService.findByType("计算机类");
    	 System.out.println("FindByType Succeed!");
    	
    	
     }
}
