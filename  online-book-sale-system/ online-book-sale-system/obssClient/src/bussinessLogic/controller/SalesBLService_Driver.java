package bussinessLogic.controller;
//’≈—≈Ê√
import java.util.ArrayList;

import po.LineItemPO;
import po.OrderPO;
import po.ResultMessage;

import bussinessLogicService.SalesBLService;

public class SalesBLService_Driver {
	SalesBLService salesBLService;
	
	public void drive(SalesBLService salesBLService) {
		this.salesBLService = salesBLService;
		putInCart_Drive(null);
		putInCart_Drive(new LineItemPO());
		enterCart_Drive();
		removeFromCart_Drive("00003");
		removeFromCart_Drive("00001");
		calculate_Drive();
		chooseCoupon_Drive(0.8);
		chooseEquivalent_Drive(5);
		chooseEquivalent_Drive(50);
		purchase_Drive();
	}

	public void putInCart_Drive(LineItemPO lineItem) {
		ResultMessage result = salesBLService.putInCart(lineItem);
		if (result == ResultMessage.EXIST)
			System.out.println("putInCart success!");
		else
			System.out.println("book is null,putInCart failed!");
	}

	public void enterCart_Drive() {
		ArrayList<LineItemPO> cartRecord = salesBLService.enterCart();
		for (int i = 0; i < cartRecord.size(); i++)
			System.out.println(cartRecord.get(i));
	}

	public void removeFromCart_Drive(String id) {
		ResultMessage result = salesBLService.removeFromCart(id);
		if (result == ResultMessage.SUCCEED)
			System.out.println("remove success!");
		else if (result == ResultMessage.FAILED)
			System.out.println("remove failed!");
	}

	public void calculate_Drive() {
		System.out.println("totalPrice:"+salesBLService.calculate());
	}

	public void chooseCoupon_Drive(double percent) {
		double totalPrice = salesBLService.chooseCoupon(percent);
		System.out.println("total price after using coupon(" + percent * 100
				+ "%):" + totalPrice);
	}

	public void chooseEquivalent_Drive(double equivalent) {
		double totalPrice = salesBLService.chooseEquivalent(equivalent);
		System.out.println("total price after using Equivalent(" + (-equivalent)
				+ "):" + totalPrice);
	}

	public void purchase_Drive() {
		OrderPO order = salesBLService.purchase();
		if(order != null)
			System.out.println("purchase success!");
	}

}
