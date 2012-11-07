package test.bussinessLogicService;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import po.ResultMessage;

import bussinessLogic.controller.SalesBLService_Stub;

public class SalesBLService_StubTest extends TestCase {
	SalesBLService_Stub stub;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		stub=new SalesBLService_Stub(100);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testRemoveFromCart() {
		assertEquals(ResultMessage.SUCCEED, stub.removeFromCart("000010"));
	}

}
