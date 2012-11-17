package bussinessLogic.controller;
//�ȼ���
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
    	 
    	 bookBLService.findByKey("Java���Գ������");
    	 System.out.println("FindByKey Succeed!");
    	
    	 
    	 bookBLService.findByType("�������");
    	 System.out.println("FindByType Succeed!");
    	
    	
     }
}
