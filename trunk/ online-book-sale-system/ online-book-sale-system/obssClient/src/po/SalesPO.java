package po;

import java.util.ArrayList;

public class SalesPO {
	private ArrayList<LineItemPO> cartList;

	public boolean addInCart(BookPO book, int number) {
		@SuppressWarnings("unused")
		LineItemPO lineItem = new LineItemPO(book, number);
		//addBookInCart(lineItem);
		if(book.equals("00001"))
			return true;
		return false;
	}

	public ArrayList<LineItemPO> getCartList() {
		return cartList;
	}

	public boolean removeFromCart(String id) {
		if(id.equals("00001"))
			return true;
		return false;
	}

}
