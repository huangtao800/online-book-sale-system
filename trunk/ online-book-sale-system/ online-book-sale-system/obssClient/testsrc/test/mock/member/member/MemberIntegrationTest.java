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

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		MockMember member=new MockMember(new MemberPO("111111", "huangtao"));
		MemberBLService memberBLService=new MemberBLService_Stub(member);
		
		ResultMessage addFavoMessage=memberBLService.addFavorities("111111");
		ResultMessage removeFavo=memberBLService.removeFavorities("111111");
		ResultMessage cancelMessage=memberBLService.cancel("111111", "111111");
		
		assertEquals(addFavoMessage, ResultMessage.SUCCEED);
		assertEquals(removeFavo,ResultMessage.SUCCEED);
		assertEquals(cancelMessage, ResultMessage.SUCCEED);
	}

}
