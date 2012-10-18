package bussinessLogic.controller;
//’≈—≈Ê√
import java.util.ArrayList;

import po.OrderPO;
import po.ResultMessage;

import bussinessLogicService.SalesBLService;



public class SalesBLService_Driver {
	SalesBLService salesBLService;

	public SalesBLService_Driver(SalesBLService salesBLService) {
		this.salesBLService = salesBLService;
	}

	public static void main(String[] args) {
		SalesBLService salesBLService = new SalesBLService_Stub("Õº È±‡∫≈ 0001 Õº È",
				new OrderPO(), 20);
		SalesBLService_Driver driver = new SalesBLService_Driver(salesBLService);
		driver.drive();
	}
	
	public void drive() {
		putInCart_Drive(null);
		putInCart_Drive("00001");
		enterCart_Drive();
		removeFromCart_Drive("00003");
		removeFromCart_Drive("00001");
		calculate_Drive();
		chooseCoupon_Drive(0.8);
		chooseVoucher_Drive(5);
		chooseVoucher_Drive(50);
		purchase_Drive();
	}

	public void putInCart_Drive(String id) {
		System.out.println("putInCart_Drive:");
		ResultMessage result = salesBLService.putInCart(id);
		if (result == ResultMessage.EXIST)
			System.out.println("book id:" + id + ",add success!");
		else
			System.out.println("book id:null" + ",please choose the book!");
	}

	public void enterCart_Drive() {
		System.out.println("enterCart_Drive:");
		ArrayList<String> cartRecord = salesBLService.enterCart();
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

	public void chooseVoucher_Drive(double voucher) {
		System.out.println("chooseVoucher_Drive:");
		double totalPrice = salesBLService.chooseVoucher(voucher);
		System.out.println("total price after using voucher(" + (-voucher)
				+ "):" + totalPrice);
	}

	public void purchase_Drive() {
		System.out.println("purchase_Drive:");
		OrderPO order = salesBLService.purchase();
		System.out.println("∂©µ•±‡∫≈:" + order.getOrderNum());
	}

}
