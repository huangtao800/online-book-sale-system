package presentation;
//�ȼ���
import po.BookPO;
import bussinessLogic.controller.BookBLService_Stub;
import bussinessLogicService.BookBLService;


public class BookView {
	    BookPO bookPO = new BookPO();
        BookBLService book = new BookBLService_Stub("Java���Գ������","�������","00001",bookPO);
        
        private void start(){
    		book.addBook(bookPO);
    	}
    	
    	public static void main(String[] args){
    		BookView bookView = new BookView();
    		bookView.start();
    	}
}
