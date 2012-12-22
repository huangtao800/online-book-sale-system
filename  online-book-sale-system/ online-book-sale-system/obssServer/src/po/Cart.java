package po;

import java.util.ArrayList;

public class Cart implements PO {

	private static final long serialVersionUID = -3167217606026793124L;
	private ArrayList<LineItemPO> cartList = new ArrayList<LineItemPO>();

	public Cart() {
		// 初始化读入数据
	}

	public ArrayList<LineItemPO> getCartList() {
		return cartList;
	}

	public ResultMessage putInCart(LineItemPO lineItemPO) {
		for (int i = 0; i < cartList.size(); i++) {
			if (cartList.get(i).getBook().getISBN().equals(lineItemPO.getBook().getISBN())){
				cartList.get(i).addNumber(lineItemPO.getNumber());
				return ResultMessage.SUCCEED;
			}
		}
		cartList.add(lineItemPO);
		return ResultMessage.SUCCEED;
	}

	public ResultMessage removeFromCart(int index) {
		cartList.remove(index);
		return ResultMessage.SUCCEED;
	}

	public ResultMessage changeNumber(int index, int number) {
		cartList.get(index).setNumber(number);
		return ResultMessage.SUCCEED;
	}

	public double getTotalPrice() {
		double commonPrice = 0;
		for (int i = 0; i < cartList.size(); i++)
			commonPrice += cartList.get(i).getSumPrice();
		return commonPrice;
	}

	public void clear() {
		cartList = new ArrayList<LineItemPO>();
	}

}
