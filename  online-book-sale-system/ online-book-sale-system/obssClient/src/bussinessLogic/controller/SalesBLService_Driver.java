package bussinessLogic.controller;
//’≈—≈Ê√
import java.util.ArrayList;

import po.LineItemPO;
import po.OrderPO;
import po.ResultMessage;

import bussinessLogicService.SalesBLService;



public class SalesBLService_Driver {
	SalesBLService salesBLService;

	public SalesBLService_Driver(SalesBLService salesBLService) {
		this.salesBLService = salesBLService;
	}

	public static void main(String[] args) {
		SalesBLService salesBLService = new SalesBLService_Stub( 20);
		SalesBLService_Driver driver = new SalesBLService_Driver(salesBLService);
		driver.drive();
	}
	
	public void drive() {
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
		System.out.println("putInCart_Drive:");
		ResultMessage result = salesBLService.putInCart(lineItem);
		if (result == ResultMessage.EXIST)
			System.out.println("book add success!");
		else
			System.out.println("book is null,please choose the book!");
	}

	public void enterCart_Drive() {
		System.out.println("enterCart_Drive:");
		ArrayList<LineItemPO> cartRecord = salesBLService.enterCart();
		for (int i = 0; i < cartRecord.size(); i++)
			System.out.println(cartRecord.get(i));
	}

	public void removeFromCart_Drive(String id) {
		System.out.println("removeFromCart_Drive:");
		ResultMessage result = salesBLService.removeFromCart(id);
		if (result == ResultMessage.SUCCEED)
			System.out.println("book id:" + id + " remove success!");
		else if (result == ResultMessage.FAILED)
			System.out.println("book id:" + id + " remove failed");
	}

	public void calculate_Drive() {
		System.out.println("calculate_Drive:");
		System.out.println(salesBLService.calculate());
	}

	public void chooseCoupon_Drive(double percent) {
		System.out.println("chooseCoupon_Drive:");
		double totalPrice = salesBLService.chooseCoupon(percent);
		System.out.println("total price after using coupon(" + percent * 100
				+ "%):" + totalPrice);
	}

	public void chooseEquivalent_Drive(double equivalent) {
		System.out.println("chooseEquivalent_Drive:");
		double totalPrice = salesBLService.chooseEquivalent(equivalent);
		System.out.println("total price after using Equivalent(" + (-equivalent)
				+ "):" + totalPrice);
	}

	public void purchase_Drive() {
		System.out.println("purchase_Drive:");
		OrderPO order = salesBLService.purchase();
		System.out.println("∂©µ•±‡∫≈:" + order.getOrderNum());
	}

}
