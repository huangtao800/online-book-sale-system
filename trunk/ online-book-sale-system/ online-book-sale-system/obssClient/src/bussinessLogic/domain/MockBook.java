package bussinessLogic.domain;

import java.util.ArrayList;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;

public class MockBook extends Book{

	public MockBook(String name, String type, String id, BookPO b) {
		super(name, type, id, b);
	}
	
	public BookPO findByISBN(String ISBN){      //����ͼ��ISBN��������Ӧ��ͼ���б�
		   BookPO bookPO = book.findByISBN(ISBN);
		   return bookPO;
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
