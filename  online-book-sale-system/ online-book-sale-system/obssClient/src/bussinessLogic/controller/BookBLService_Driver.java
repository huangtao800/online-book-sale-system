package bussinessLogic.controller;
//�ȼ���
import java.util.ArrayList;
import po.BookPO;
import po.PromotionPO;
import po.ResultMessage;
import bussinessLogicService.*;

public class BookBLService_Driver {
	
     public void drive(BookBLService bookBLService){
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
    	 
    	 bookBLService.findByKey("Java���Գ������");
    	 System.out.println("FindByKey Succeed!");
    	
    	 
    	 bookBLService.findByType("�������");
    	 System.out.println("FindByType Succeed!");
    	
    	 
    	 bookBLService.getBookPromotionListByID("11111");
    	 System.out.println("GetBookPromotionListByID Succeed!");
    	
     }
}
