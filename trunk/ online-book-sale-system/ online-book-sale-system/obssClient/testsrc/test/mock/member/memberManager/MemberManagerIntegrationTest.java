package test.mock.member.memberManager;

import po.CouponPO;
import po.EquivalentPO;
import po.OrderState;
import po.ResultMessage;
import bussinessLogic.controller.MemberManagerBLService_Stub;
import bussinessLogic.domain.*;
import bussinessLogicService.MemberManagerBLService;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberManagerIntegrationTest extends TestCase{
	
	MemberManagerBLService memberManagerService;
	
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		MockMemberManager mockManager=new MockMemberManager();
		memberManagerService=new MemberManagerBLService_Stub(mockManager);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testAddCoupon(){
		ResultMessage couponMessage=memberManagerService.addCoupon(new CouponPO());
		assertEquals(couponMessage,ResultMessage.SUCCEED);
	}
	
	@Test
	public void testAddEquivalent(){
		ResultMessage equivalentMessage=memberManagerService.addEquivalent(new EquivalentPO());
		assertEquals(equivalentMessage,ResultMessage.SUCCEED);
	}
	
	@Test
	public void testChangerOrder(){
		ResultMessage orderMessage=memberManagerService.changeOrder(1,OrderState.SIGNED);
		assertEquals(orderMessage, ResultMessage.SUCCEED);
	}
}
