package bussinessLogic.domain;

import java.util.ArrayList;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;
import po.SalesPO;

// updateÎ´Íê³É
public class Sales {
	SalesPO salesPo = new SalesPO();
	
	public ArrayList<LineItemPO> getCartList() {
		return salesPo.getCartList();
	}

	public ResultMessage putInCart(BookPO book, int number) {
		boolean b = salesPo.addInCart(book, number);
		if(b)
			return ResultMessage.SUCCEED;
		else
			return ResultMessage.FAILED;
	}

	public ResultMessage removeFromCart(String id) {
		if(salesPo.removeFromCart(id))
			return ResultMessage.SUCCEED;
		else
			return ResultMessage.FAILED;
	}

	public double commonCalculate() {
		double commonPrice = 0;
		ArrayList<LineItemPO> cartList = salesPo.getCartList();
		for(int i = 0; i < cartList.size(); i ++)
			commonPrice += cartList.get(i).getSumPrice();
		return commonPrice;
	}

	public ResultMessage updateSale() {
		// TODO Auto-generated method stub
		//updatePo
		return ResultMessage.SUCCEED;
	}

}
