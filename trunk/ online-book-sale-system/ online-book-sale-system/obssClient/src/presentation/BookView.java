package presentation;
//�ȼ���
import po.BookPO;
import bussinessLogic.controller.BookBLService_Stub;
import bussinessLogic.domain.Book;
import bussinessLogicService.BookBLService;


public class BookView {
	    BookPO bookPO = new BookPO();
        BookBLService book = new Book("Java���Գ������","�������","00001",bookPO);
        
        private void start(){
    		book.addBook(bookPO);
    	}
    	
    	public static void main(String[] args){
    		BookView bookView = new BookView();
    		bookView.start();
    	}
}
