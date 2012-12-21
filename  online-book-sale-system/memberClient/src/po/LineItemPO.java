package po;
//������
public class LineItemPO implements PO {
	//��Ʒ��Ϣ����  ������ͼ�飬��������Ʒ�ܼ�
	private BookPO book;
	private int number;
	
	public LineItemPO(){
		
	}
	public LineItemPO(BookPO book,int number){
		this.book = book;
		this.number = number;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public BookPO getBook(){
		return book;
	}
	public int getNumber(){
		return number;
	}
	public double getSumPrice(){
		return book.getPrice() * number;
	}

}
