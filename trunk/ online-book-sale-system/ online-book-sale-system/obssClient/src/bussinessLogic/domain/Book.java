package bussinessLogic.domain;

import java.util.ArrayList;

import bussinessLogicService.BookBLService;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;

//�ȼ���

public class Book implements BookBLService{
	String bookName,bookType,bookID;
    BookPO bookPO = new BookPO();
    Book book;
    
    
    public Book(String name,String type,String id,BookPO b){
    	  bookName = name;
    	  bookType = type;
    	  bookID = id;
    	  bookPO = b;
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
