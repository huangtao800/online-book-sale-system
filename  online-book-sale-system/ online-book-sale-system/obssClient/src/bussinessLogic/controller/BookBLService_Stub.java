package bussinessLogic.controller;
//�ȼ���
import java.util.ArrayList;

import po.*;
import po.ResultMessage;
import bussinessLogicService.*;


public class BookBLService_Stub implements BookBLService{
	    String bookName,bookType,bookID;
	    BookPO book = new BookPO();
	    
	    
	    public BookBLService_Stub(String name,String type,String id,BookPO b){
	    	  bookName = name;
	    	  bookType = type;
	    	  bookID = id;
	    	  book = b;
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
		
		public ArrayList<PromotionPO> getBookPromotionListByID(String bookID){         //������Ӧͼ��Ĵ�����Ϣ
			   ArrayList<PromotionPO> promotionArray = new ArrayList<PromotionPO>();
			   return promotionArray;
		}
		
		
		//����ͼ�飨����ɾ���ģ�
		public ResultMessage addBook(BookPO b){
			if(b==book){
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

}
