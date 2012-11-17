package bussinessLogic.domain;

import java.util.ArrayList;

import po.BookPO;
import po.LineItemPO;
import po.ResultMessage;
import po.SalesPO;
import bussinessLogicService.SalesBLService;

public class Sales implements SalesBLService{
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
		salesPo.removeFromCart(id);
		return ResultMessage.SUCCEED;
	}

	public double commonCalculate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultMessage purchase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LineItemPO> getSalesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateSale() {
		// TODO Auto-generated method stub
		return null;
	}

}
