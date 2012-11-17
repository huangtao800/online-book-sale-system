package bussinessLogicService;
//�ȼ���
import java.util.ArrayList;
import po.*;

public interface BookBLService {
	//���۽����ѯͼ���ͼ��Ĵ�����Ϣ
	public ArrayList<BookPO> findByKey(String name);//���ݹؼ��ַ�����Ӧ��ͼ���б�
	public ArrayList<BookPO> findByType(String type);//ѡ��ͼ����𣬷�����Ӧ��ͼ���б�
	public BookPO findByISBN(String ISBN);//ͨ��ISBN������ͼ��
	
	//����ͼ�飨����ɾ���ģ�
	public ResultMessage addBook(BookPO b);
	public ResultMessage deleteBook(String id);
	public ResultMessage modifyBook(String id);
	
	//ˢ��ͼ����Ϣ
	public ResultMessage updateBook(ArrayList<LineItemPO> salesList);

}
