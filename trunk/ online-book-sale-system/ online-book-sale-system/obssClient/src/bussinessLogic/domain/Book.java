package bussinessLogic.domain;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.text.ChangedCharSetException;

import databaseService.book.BookDatabaseService;
import databaseService.sales.OrderDatabaseService;

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
	private BookPO bookPO;
	private BookDatabaseService bookDatabaseService;
	Book book;
	private ArrayList<BookPO> array = new ArrayList<BookPO>();
	
	public Book(){
		try {
			bookDatabaseService = (BookDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/BookDatabase");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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
			
			try {
				return bookDatabaseService.insert(this.bookPO);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ResultMessage.FAILED;
			}
		
	}
	
	public ResultMessage deleteBook(String isbn){
		BookPO bookPO = book.findBook(isbn);
		
		if(bookPO==null){
			return ResultMessage.FAILED;
		}
		
		try {
			return bookDatabaseService.delete(bookPO);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
		}
	}
	
	public ResultMessage modifyBook(BookPO b,String isbn){
        BookPO bookPO = book.findBook(isbn);
		
        if(bookPO==null){
			return ResultMessage.FAILED;
		}
		
		try {
			ResultMessage result = bookDatabaseService.delete(bookPO);
			if(result==ResultMessage.SUCCEED){
				return bookDatabaseService.insert(b);
			}else{
				return ResultMessage.FAILED;
			}
				
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;	//RMI�����쳣
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
		  ArrayList<ResultMessage> resultList = new ArrayList<ResultMessage>();
		  ResultMessage result = ResultMessage.SUCCEED;
		  for(int i=0;i<salesList.size();i++){
			  bookPO = salesList.get(i).getBook();
			  bookPO.setNumOfBook(bookPO.getNumOfBook()-salesList.get(i).getNumber());
			  
			  try {
				  resultList.add( bookDatabaseService.update(bookPO));
			   } catch (RemoteException e) {
				 
				  e.printStackTrace();
				  resultList.add( ResultMessage.FAILED);	//RMI�����쳣
			   }
		  }
		   
		  for(int j=0;j<resultList.size();j++){
			  if(resultList.get(j)==ResultMessage.FAILED)
				  result = ResultMessage.FAILED;
		  }
		  
		  return result;
		   
		
	}

}
