package bussinessObject;

import java.util.ArrayList;

import po.LineItemPO;
import po.ResultMessage;

public class Cart {
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
	public ResultMessage removeFromCart(String ISBN) {
		for(int i = 0; i < cartList.size(); i ++){
			LineItemPO lineItem = cartList.get(i);
			if(ISBN.equals(lineItem.getBook().getISBN())){
				cartList.remove(lineItem);
				return ResultMessage.SUCCEED;
			}
		}
		return ResultMessage.FAILED;		
	}
	public double getTotalPrice() {
		double commonPrice = 0;
		for(int i = 0; i < cartList.size(); i ++)
			commonPrice += cartList.get(i).getSumPrice();
		return commonPrice;
	}

}
