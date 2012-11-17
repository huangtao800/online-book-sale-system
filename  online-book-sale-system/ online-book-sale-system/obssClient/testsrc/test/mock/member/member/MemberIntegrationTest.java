package test.mock.member.member;

import static org.junit.Assert.*;

import javax.naming.spi.DirStateFactory.Result;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import po.MemberPO;
import po.ResultMessage;

import bussinessLogic.controller.MemberBLService_Stub;
import bussinessLogic.domain.MockMember;
import bussinessLogicService.MemberBLService;

public class MemberIntegrationTest extends TestCase{
	MemberBLService memberBLService;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		MockMember member=new MockMember(new MemberPO("111111", "huangtao"));
		memberBLService=new MemberBLService_Stub(member);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testAddFavorities(){
		ResultMessage addFavoMessage=memberBLService.addFavorities("111111");
		assertEquals(addFavoMessage, ResultMessage.SUCCEED);
	}
	
	@Test
	public void testRemoveFavorities(){
		ResultMessage removeFavo=memberBLService.removeFavorities("111111");
		assertEquals(removeFavo,ResultMessage.SUCCEED);
	}

	@Test
	public void testCancel() {

		ResultMessage cancelMessage=memberBLService.cancel("111111", "111111");
		assertEquals(cancelMessage, ResultMessage.SUCCEED);
	}

}
