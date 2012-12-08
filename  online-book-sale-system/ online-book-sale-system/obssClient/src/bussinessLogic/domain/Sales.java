package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

import bussinessObject.Cart;

import databaseService.sales.OrderDatabaseService;

import po.BookPO;
import po.LineItemPO;
import po.MemberPO;
import po.OrderPO;
import po.ResultMessage;

public class Sales {
	private OrderDatabaseService orderDatabase;
	private MemberPO memberPO;
	private Cart cart = memberPO.getCart();

	public Sales(MemberPO memberPO) {
		this.memberPO = memberPO;
		try {
			orderDatabase=(OrderDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/OrderDatabase");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<LineItemPO> getCartList() {
		return cart.getCartList();
	}

	public ResultMessage putInCart(BookPO book, int number) {
		if(book == null)
			return ResultMessage.FAILED;
		LineItemPO lineItem = new LineItemPO(book, number);
		cart.putInCart(lineItem);
		return ResultMessage.SUCCEED;
	}

	public ResultMessage removeFromCart(String ISBN) {
		ResultMessage resultMessage = cart.removeFromCart(ISBN);
		return resultMessage;
	}

	public double commonCalculate() {
		return cart.getTotalPrice();
	}

	public ResultMessage updateSale(OrderPO orderPO) {
		try {
			orderDatabase.insert(orderPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return ResultMessage.SUCCEED;
	}

}
