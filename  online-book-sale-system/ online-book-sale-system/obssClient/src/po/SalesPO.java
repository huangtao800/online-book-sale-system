package po;

import java.util.ArrayList;

public class SalesPO {
	private ArrayList<LineItemPO> cartList;
	
	public SalesPO(){
		//�����ݿ��ж�ȡ���ݣ�Ȼ���ʼ��Ŷ~ ����д��ʼ���ķ���
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
