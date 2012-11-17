package test.mock.sales;

import bussinessLogic.controller.MockSalesContrller;

import po.ResultMessage;
import junit.framework.TestCase;

public class MockSalesTester extends TestCase{
	MockSalesContrller salesContrller = new MockSalesContrller();
	
	public void testPutInCart(){
		assertEquals(ResultMessage.SUCCEED, salesContrller.putInCart("00001", 2));
	}
	public void testEnterCart(){
		assertEquals(ResultMessage.SUCCEED, salesContrller.enterCart());
	}
	public void testRemoveFromCart(){
		assertEquals(ResultMessage.SUCCEED, salesContrller.removeFrromCart("00001"));
	}
	
	public void testPurchase(){
		assertEquals(ResultMessage.SUCCEED,salesContrller.purchase());

	}
	public void testCalucalte(){
		assertEquals(100.0, salesContrller.calucalte());
	}
	public void testShowSpecial(){
		assertEquals(ResultMessage.SUCCEED,salesContrller.showSpecial());
		
	}
	public void testCalculateByEquivalent(){
		assertEquals(80.0,salesContrller.calculateByEquivalent());
	}
    public void testCalculateByCupon(){
    	assertEquals(80.0,salesContrller.calculateByCupon());
	}
	public void testEndSale(){
		assertEquals(ResultMessage.FAILED,salesContrller.endSale());
	}

}
