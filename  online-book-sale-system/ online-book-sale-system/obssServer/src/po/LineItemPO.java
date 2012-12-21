package po;
//张雅婷
public class LineItemPO implements PO {
	//商品信息的类  包括：图书，数量，商品总价
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
