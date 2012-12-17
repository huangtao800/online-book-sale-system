package presentationController.searchBookView;
import java.util.ArrayList;
import po.BookPO;

public interface SearchBookService {
	public BookPO searchBook(String ISBN);
	public ArrayList<BookPO> getAllBook();
	public void init();
}
