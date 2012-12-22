package presentationController.searchBookView;

import java.util.ArrayList;

import bussinessLogic.controller.BookController;
import bussinessLogicService.BookBLService;

import po.BookPO;
import presentation.SearchBookView;

public class SearchBookViewController implements SearchBookService {
	private SearchBookView searchBookView;
	private static SearchBookService uniqueInstance;
	private static BookBLService bookController;
	
	private SearchBookViewController(){
		bookController = BookController.getInstance();
		
		
	}
	
	public static SearchBookService getInstance(){
		if(bookController==null){
			uniqueInstance = new SearchBookViewController();
		}
		
		return uniqueInstance;
	}
	
	public void init(){
		searchBookView = new SearchBookView();
		searchBookView.setVisible(true);
	}
	
	public BookPO searchBook(String isbn){
		return bookController.findThroughISBNforSalesManager(isbn);
	}
	
	public ArrayList<BookPO> getAllBook(){
		return bookController.getAllBook();
	}
}
