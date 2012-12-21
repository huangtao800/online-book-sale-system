package presentationController.book;

import java.util.ArrayList;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;

public interface BookViewService {
    public ResultMessage putIntoCart(BookPO bookPO,int number);//��ӵ����ﳵ
    public ResultMessage putIntoFavorities(BookPO bookPO);//��ӵ��ղؼ�
    public void enterCart();
    //����ͼ��
    public ArrayList<BookPO> findByKeyword(String name,String author,String press,String publishDate);
    public ArrayList<BookPO> fineByType(String type);
    //��ȡͼ�����
    public ArrayList<String> getBookType();
}
