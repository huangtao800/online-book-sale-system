package businesslogic;

import databaseservice.Order;
import businessLogicservice.SalesBLService;

public class Test {
	public static void main(String[] args) {
		SalesBLService salesBLService = new SalesBLService_Stub("ͼ���� 0001 ͼ��",
				new Order(), 20);
		SalesBLService_Driver driver = new SalesBLService_Driver(salesBLService);
		driver.drive();
	}

}
