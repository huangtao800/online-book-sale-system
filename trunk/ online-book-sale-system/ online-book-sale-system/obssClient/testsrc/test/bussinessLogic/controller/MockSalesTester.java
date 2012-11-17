package test.bussinessLogic.controller;

import java.util.ArrayList;

import bussinessLogic.controller.MockSalesContrller;

import po.LineItemPO;
import po.OrderPO;
import po.ResultMessage;
import junit.framework.TestCase;

public class MockSalesTester extends TestCase{
	MockSalesContrller salesContrller = new MockSalesContrller();
	
	public void testPutInCart(){
		assertEquals(ResultMessage.SUCCEED, salesContrller.putInCart("00001", 2));
		assertEquals(ResultMessage.FAILED, salesContrller.putInCart("00000", 2));
	}
	public void testEnterCart(){
		assertEquals(ResultMessage.FAILED, salesContrller.enterCart());
	}
	public void testRemoveFromCart(){
		assertEquals(ResultMessage.SUCCEED, salesContrller.removeFrromCart("00001"));
	}
	
	public void testPurchase(){
		assertEquals(ResultMessage.SUCCEED,salesContrller.purchase());

	}
	public void testCalucalte(){
		assertEquals(100, salesContrller.calucalte());
	}
	public void testShowSpecial(){
		assertEquals(ResultMessage.SUCCEED,salesContrller.showSpecial());
		
	}
	public void testCalculateByEquivalent(){
		assertEquals(80,salesContrller.calculateByEquivalent());
	}
    public void testCalculateByCupon(){
    	assertEquals(80,salesContrller.calculateByCupon());
	}
	public void testEndSale(){
		assertEquals(ResultMessage.SUCCEED,salesContrller.endSale());
	}

}
