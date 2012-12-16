package presentationController.CheckAllBook;

import java.util.ArrayList;

import bussinessLogic.controller.BookController;
import bussinessLogicService.BookBLService;
 
import po.BookPO;
import presentation.CheckAllBook;

public class CheckAllBookController implements CheckAllBookControllerInterface{
	BookBLService bookController=BookController.getInstance();
	ArrayList<BookPO> bookList=new ArrayList<BookPO>();
	CheckAllBook view;
	
	public CheckAllBookController(){
		view=new CheckAllBook(this);	
	}

	public ArrayList<BookPO> getBookList(){
		return bookController
	}
}
