package presentationController.book;

import java.util.ArrayList;


import bussinessLogic.controller.BookController;
import bussinessLogic.controller.CustomerController;
import bussinessLogicService.BookBLService;
import bussinessLogicService.CustomerBLService;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;
import presentation.BookView;

import presentationController.Sales.SalesViewController;

import vo.KeywordVO;

public class BookViewController implements BookViewService{
	 private BookView bookView;
	 private BookBLService bookController;
	 private KeywordVO keywordVO;
	 private String type;
	 private CustomerBLService memberController;
	
	 public BookViewController (KeywordVO keywordVO,String type){
		 bookController = BookController.getInstance();
		 memberController = CustomerController.getInstance();
		
		 if(keywordVO==null){
			 bookView = new BookView(null,type,this);
			 bookView.setVisible(true);
		 }else{
			 bookView = new BookView(keywordVO,null,this);
			 bookView.setVisible(true);
		 }
		 
		
		
	 }

	//��ӵ����ﳵ
	 public ResultMessage putIntoCart(BookPO bookPO,int number){
		 return memberController.putInCart(bookPO,number);
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
	 
	 //��ȡͼ�����
	 public ArrayList<String> getBookType(){
		 return bookController.getBookType();
	 }
	 

}