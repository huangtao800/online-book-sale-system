package presentationController.book;

import java.util.ArrayList;

import javax.swing.JPanel;

import bussinessLogic.controller.BookController;
import bussinessLogic.controller.MemberController;
import bussinessLogicService.BookBLService;
import bussinessLogicService.MemberBLService;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;
import presentation.BookView;
import presentationController.Member.KeywordVO;
import presentationController.Member.MemberViewController;
import presentationController.Member.MemberViewService;
import presentationController.Sales.SalesViewController;
import presentationController.Sales.SalesViewService;

public class BookViewController implements BookViewService{
	 private BookView bookView;
	 private static BookViewService uniqueInstance;
	 private static BookBLService bookController;
	 private KeywordVO keywordVO;
	 private String type;
	 private MemberBLService memberController;
	 
	 private BookViewController (KeywordVO keywordVO,String type){
		 if(keywordVO==null){
			 bookView = new BookView(null,type);
			 bookView.setVisible(true);
		 }else if(type==null){
			 bookView = new BookView(keywordVO,null);
			 bookView.setVisible(true);
		 }
		 
		 bookController = BookController.getInstance();
		 memberController = MemberController.getInstance();
		 
		
	 }
	 
	 public static BookViewService getInstance(KeywordVO keywordVO,String type){
		 if(uniqueInstance==null){
			 uniqueInstance = new BookViewController(keywordVO, type) ;
		 }
		 
		 return uniqueInstance;
	 }
	
	 
	//��ӵ����ﳵ
	 public ResultMessage putIntoCart(LineItemPO lineItemPO){
		 return memberController.putInCart(lineItemPO);
	 }
	 
	//��ӵ��ղؼ�
	 public ResultMessage putIntoFavorities(BookPO bookPO){
		 return memberController.addFavorities(bookPO);
	 }
	 
	 //���빺�ﳵ
	 public void enterCart(){
		 SalesViewController salesViewController=SalesViewController.getInstance();
	     salesViewController.initCartView();
	 }
	 
	 public ArrayList<BookPO> findByKeyword(String name,String author,String press,String publishDate){
		 return bookController.findByKey(name, author, press, publishDate);
		
	 }
	   
	 public ArrayList<BookPO> fineByType(String type){
		 return bookController.findByType(type);
	 }
}