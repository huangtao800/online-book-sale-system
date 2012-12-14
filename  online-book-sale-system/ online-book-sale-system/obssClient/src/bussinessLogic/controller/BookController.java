package bussinessLogic.controller;

import java.util.ArrayList;
import po.*;
import bussinessLogic.domain.Book;
import bussinessLogicService.*;

public class BookController implements BookBLService{
	private static BookController uniqueInstance;
    private Book book = new Book();
    
    private BookController(){
    	
    }
	
	public static BookController getInstance(){
		if(uniqueInstance==null){
			uniqueInstance = new BookController();
		}
		
		return uniqueInstance;
	}

    //ͨ���ؼ��ʻ���ͼ������������ͼ��
	public ArrayList<BookPO>  findByKey(String name,String author,String press,String publishDate){      //���ݹؼ��ַ�����Ӧ��ͼ���б�
		   return book.findByKey(name, author, press, publishDate);
	}
	
	public ArrayList<BookPO> findByType(String type){      //ѡ��ͼ����𣬷�����Ӧ��ͼ���б�
		   return book.findByType(type);
	}
	
 	public BookPO findByISBN(String isbn){      //����ͼ��ISBN��������Ӧ��ͼ���б�
		   return book.findByISBN(isbn);
	}

	
	//����ͼ�飨����ɾ���ģ�
	public void addBook(BookPO b){
		book.addBook(b);
	}
	
	public ResultMessage deleteBook(String isbn){
		return book.deleteBook(isbn);
	}
	
	public ResultMessage modifyBook(BookPO b){
		String isbn = b.getISBN();
		return book.modifyBook(b, isbn);
	}
	
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList){
		return book.updateBook(salesList);
	}
	
	// ��ͼ�����Ĵ���
	public ArrayList<String> getBookType(){
		return book.getBookType();
	}
	
	public ResultMessage addBookType(String type){
		return book.addBookType(type);
	}
	
	public ResultMessage changeBookType(String beforeType,String afterType){
		return book.changeBookType(beforeType, afterType);
	}

}
