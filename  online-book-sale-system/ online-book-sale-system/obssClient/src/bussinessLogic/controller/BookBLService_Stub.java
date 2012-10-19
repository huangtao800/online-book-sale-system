package bussinessLogic.controller;
//尤佳琪
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
	
	    //销售界面查询图书和图书的促销信息
		public ArrayList<BookPO>  findByKey(String name){      //根据关键字返回相应的图书列表
			   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
			   return bookArray;
		}
		
		public ArrayList<BookPO> findByType(String type){      //选择图书类别，返回相应的图书列表
			   ArrayList<BookPO> bookArray = new ArrayList<BookPO>();
			   return bookArray;
		}
		
		public ArrayList<PromotionPO> getBookPromotionListByID(String bookID){         //返回相应图书的促销信息
			   ArrayList<PromotionPO> promotionArray = new ArrayList<PromotionPO>();
			   return promotionArray;
		}
		
		
		//管理图书（增，删，改）
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
