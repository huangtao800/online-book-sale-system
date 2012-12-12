package presentationController.book;

import java.util.ArrayList;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;

public interface BookViewService {
    public ResultMessage putIntoCart(LineItemPO lineItemPO);//添加到购物车
    public ResultMessage putIntoFavorities(BookPO bookPO);//添加到收藏夹
    public void enterCart();
    //查找图书
    public ArrayList<BookPO> findByKeyword(String name,String author,String press,String publishDate);
    public ArrayList<BookPO> fineByType(String type);
}
