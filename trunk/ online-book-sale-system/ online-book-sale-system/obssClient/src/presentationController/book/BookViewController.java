package presentationController.book;

import javax.swing.JPanel;

import bussinessLogic.controller.BookController;
import bussinessLogicService.BookBLService;

import presentation.BookView;
import presentationController.Member.KeywordVO;

public class BookViewController {
	 private static BookViewController uniqueInstance;
	 private static BookBLService bookController;

	 private BookViewController (){
		 bookController = BookController.getInstance();
	 }
	 
	 public static BookViewController getInstance(){
		 if(bookController==null){
			 uniqueInstance = new BookViewController();
		 }
		 
		 return uniqueInstance;
	 }
	 
	 
	 public void initSearchKeyword(KeywordVO keywordVO){
		 
	 }
	 
	 public void initSearchType(String type){
		 
	 }
	 

}
