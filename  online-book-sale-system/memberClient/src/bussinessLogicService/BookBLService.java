package bussinessLogicService;
//�ȼ���
import java.rmi.RemoteException;
import java.util.ArrayList;
import po.*;

public interface BookBLService {
	//���۽����ѯͼ���ͼ��Ĵ�����Ϣ
	public ArrayList<BookPO> findByKey(String name,String author,String press,String publishDate);//���ݹؼ��ַ�����Ӧ��ͼ���б�
	public ArrayList<BookPO> findByType(String type);//ѡ��ͼ����𣬷�����Ӧ��ͼ���б�
	public BookPO findByISBN(String ISBN);//ͨ��ISBN������ͼ��
	
	//����ͼ�飨����ɾ���ģ�
	public ResultMessage addBook(BookPO b);
	public ResultMessage deleteBook(String isbn);
	public ResultMessage modifyBook(BookPO b);
	
	//ˢ��ͼ����Ϣ
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList);
	
	//ͼ������ȡ����ɾ��
	public ArrayList<String> getBookType();
	public ResultMessage addBookType(String type);
	public ResultMessage changeBookType(String beforeType,String afterType);
	public ArrayList<BookPO> getAllBook() ;
}
