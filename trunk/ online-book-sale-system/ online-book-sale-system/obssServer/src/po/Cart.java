package po;

import java.util.ArrayList;

public class Cart implements  PO{
	private ArrayList<LineItemPO> cartList = new ArrayList<LineItemPO>();
	
	public Cart() {
		//初始化读入数据
	}
	public ArrayList<LineItemPO> getCartList(){
		return cartList;
	}
	public ResultMessage putInCart(LineItemPO lineItemPO){
		cartList.add(lineItemPO);
		return ResultMessage.SUCCEED;
	}
	public ResultMessage removeFromCart(int index) {
//		for(int i = 0; i < cartList.size(); i ++){
//			LineItemPO lineItem = cartList.get(i);
//			if(ISBN.equals(lineItem.getBook().getISBN())){
//				cartList.remove(lineItem);
//				return ResultMessage.SUCCEED;
//			}
//		}
//		return ResultMessage.FAILED;	
		cartList.remove(index);
		return ResultMessage.SUCCEED;
	}
	public double getTotalPrice() {
		double commonPrice = 0;
		for(int i = 0; i < cartList.size(); i ++)
			commonPrice += cartList.get(i).getSumPrice();
		return commonPrice;
	}

}
