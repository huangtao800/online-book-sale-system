package test.bussinessLogic.controller;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import po.ResultMessage;

import bussinessLogic.controller.MemberBLService_Stub;

public class MemberBLService_StubTest extends TestCase{

	MemberBLService_Stub stub;
	@Before
	public void setUp() throws Exception {
		super.setUp();
		stub=new MemberBLService_Stub("11111","huang");
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testRemoveFavorities() {
		assertEquals(ResultMessage.SUCCEED, stub.removeFavorities("111111"));
	}

}
