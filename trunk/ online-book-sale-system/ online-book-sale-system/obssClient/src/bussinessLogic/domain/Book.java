package bussinessLogic.domain;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.text.ChangedCharSetException;

import bussinessLogicService.BookBLService;

import po.AdministratorPO;
import po.BookPO;
import po.GeneralManagerPO;
import po.LineItemPO;
import po.MemberPO;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;

//�ȼ���

public class Book{
	ArrayList<BookPO> array = new ArrayList<BookPO>();
	Book book;
	
    //���۽����ѯͼ���ͼ��Ĵ�����Ϣ
	public ArrayList<BookPO>  findByKey(String name){      //���ݹؼ��ַ�����Ӧ��ͼ���б�
		   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
		   return bookArray;
	}
	
	public ArrayList<BookPO> findByType(String type){      //ѡ��ͼ����𣬷�����Ӧ��ͼ���б�
		   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
		   return bookArray;
	}
	
	public BookPO findByISBN(String ISBN){      //����ͼ��ISBN��������Ӧ��ͼ���б�
		   BookPO bookPO = new BookPO();
		   return bookPO;
	}

	
    //����ͼ�飨����ɾ���ģ�
	public ResultMessage addBook(BookPO bookPO){
			array.add(bookPO);	
			return ResultMessage.SUCCEED;
	}
	
	public ResultMessage deleteBook(String isbn){
		BookPO bookPO = book.findBook(isbn);
		
		if(bookPO!=null){
			array.remove(bookPO);
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}
	
	public ResultMessage modifyBook(BookPO b,String isbn){
        BookPO bookPO = book.findBook(isbn);
		
		if(bookPO!=null){
			array.remove(bookPO);
			array.add(b);
			
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}
	
	private BookPO findBook(String isbn){
		BookPO bookPO = null;
		
		for(int i=0;i<array.size();i++){
			if(isbn.equals(array.get(i).getISBN())){
				bookPO = array.get(i);
			}
		}
		
		return bookPO;
	}
	
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList){
		LineItemPO list = salesList.get(0);
		BookPO bookPO = new BookPO();
		bookPO = list.getBook();
		String isbn = bookPO.getISBN();
		if(isbn=="11111"){
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}

}
