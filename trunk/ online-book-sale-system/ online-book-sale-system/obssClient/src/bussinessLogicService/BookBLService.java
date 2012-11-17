package bussinessLogicService;
//尤佳琪
import java.util.ArrayList;
import po.*;

public interface BookBLService {
	//销售界面查询图书和图书的促销信息
	public ArrayList<BookPO> findByKey(String name);//根据关键字返回相应的图书列表
	public ArrayList<BookPO> findByType(String type);//选择图书类别，返回相应的图书列表
	public BookPO findByISBN(String ISBN);//通过ISBN来查找图书
	
	//管理图书（增，删，改）
	public ResultMessage addBook(BookPO b);
	public ResultMessage deleteBook(String id);
	public ResultMessage modifyBook(String id);
	
	//刷新图书信息
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList);

}
