package bussinessLogic.controller;

import java.io.Serializable;
import java.util.ArrayList;
import po.*;
import bussinessLogic.domain.Book;
import bussinessLogicService.*;

public class BookController implements BookBLService,Serializable{
	private static BookController bookController;
	BookPO bookPO = new BookPO();
    Book book;
	
	public static BookController getInstance(){
		if(bookController==null){
			bookController = new BookController();
			return bookController;
		}else{
			return bookController;
		}
	}

    //ͨ���ؼ��ʻ���ͼ������������ͼ��
	public ArrayList<BookPO>  findByKey(String name){      //���ݹؼ��ַ�����Ӧ��ͼ���б�
		   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
		   return bookArray;
	}
	
	public ArrayList<BookPO> findByType(String type){      //ѡ��ͼ����𣬷�����Ӧ��ͼ���б�
		   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
		   return bookArray;
	}
	
 	public BookPO findByISBN(String ISBN){      //����ͼ��ISBN��������Ӧ��ͼ���б�
		   BookPO bookPO = book.findByISBN(ISBN);
		   return bookPO;
	}

	
	//����ͼ�飨����ɾ���ģ�
	public ResultMessage addBook(BookPO b){
		if(b==bookPO){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED;
		}
	}
	
	public ResultMessage deleteBook(String id){
		if(id=="11111"){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}
	
	public ResultMessage modifyBook(String id){
		if(id=="11111"){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}
	
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList){
		LineItemPO list = salesList.get(0);
		bookPO = list.getBook();
		String isbn = bookPO.getISBN();
		if(isbn=="11111"){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}

}
