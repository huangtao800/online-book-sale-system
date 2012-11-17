package test.mock.member.memberManager;

import po.CouponPO;
import po.EquivalentPO;
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
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testMember(){
		MockMemberManager mockManager=new MockMemberManager();
		MemberManagerBLService memberManagerService=new MemberManagerBLService_Stub
														(mockManager);
		
		ResultMessage couponMessage=memberManagerService.addCoupon(new CouponPO());
		ResultMessage equivalentMessage=memberManagerService.addEquivalent(new EquivalentPO());
		
		assertEquals(couponMessage,ResultMessage.SUCCEED);
		assertEquals(equivalentMessage,ResultMessage.SUCCEED);
	}
}
