package presentationController.book;

import javax.swing.JPanel;

import bussinessLogic.controller.BookController;
import bussinessLogic.controller.MemberController;
import bussinessLogicService.BookBLService;

import presentation.BookView;
import presentationController.Member.KeywordVO;
import presentationController.Member.MemberViewController;
import presentationController.Member.MemberViewService;

public class BookViewController {
	 private BookView bookView;
	 private static BookViewController uniqueInstance;
	 private static BookBLService bookController;
	 private KeywordVO keywordVO;
	 private String type;
	 
	 
	 private BookViewController (){
		 bookController = BookController.getInstance();
		
	 }
	 
	 public static BookViewController getInstance(){
		 if(bookController==null){
			 uniqueInstance = new BookViewController();
		 }
		 
		 return uniqueInstance;
	 }
	 
	 public void initBookView(KeywordVO keywordVO,String bookType){
		 this.keywordVO = keywordVO;
		 type = bookType;
		 
		 bookView = new BookView();
		 bookView.setVisible(true);
		
	}
	
	 public KeywordVO getKeywordVO(){
		 return keywordVO;
	 }
	 
	 public String getBookType(){
		 return type;
	 }
	 

}
