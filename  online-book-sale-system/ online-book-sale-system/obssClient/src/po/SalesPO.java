package po;

import java.util.ArrayList;

public class SalesPO {
	private ArrayList<LineItemPO> cartList;
	
	public SalesPO(){
		//从数据库中读取数据，然后初始化哦~ 或者写初始化的方法
	}
	
	public ArrayList<LineItemPO> getCartList() {
		//
		return cartList;
	}

	public boolean addInCart(BookPO book, int number) {
		if(book == null)
			return false;
		LineItemPO lineItem = new LineItemPO(book, number);
		cartList.add(lineItem);
		return true;
	}

	public boolean removeFromCart(String ISBN) {
		for(int i = 0; i < cartList.size(); i ++)
			if(ISBN.equals(cartList.get(i).getBook().getISBN()))
				return true;
		return false;
	}

}
