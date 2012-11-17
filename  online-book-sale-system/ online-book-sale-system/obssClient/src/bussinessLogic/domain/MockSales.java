package bussinessLogic.domain;

import java.util.ArrayList;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;
import po.SalesPO;

public class MockSales extends Sales{
	SalesPO salesPo = new SalesPO();

	public ResultMessage putInCart(BookPO book, int number) {
		boolean b = salesPo.addInCart(book, number);
		if(b)
			return ResultMessage.SUCCEED;
		else
			return ResultMessage.FAILED;
	}

	public ResultMessage enterCart() {
		ArrayList<LineItemPO> cartList = salesPo.getCartList();
		if(cartList.size() != 0)
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
		// loop cartlist
		return 100;
	}

	public ArrayList<LineItemPO> getSalesList() {
		return salesPo.getCartList();
	}

	public ResultMessage updateSale() {
		//updatePo
		return ResultMessage.SUCCEED;
	}
}
