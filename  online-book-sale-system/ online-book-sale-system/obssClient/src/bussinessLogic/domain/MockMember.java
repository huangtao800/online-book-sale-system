package bussinessLogic.domain;

import po.MemberPO;
import po.ResultMessage;

public class MockMember extends Member {

	public MockMember(MemberPO memberPO) {
		super(memberPO);
		// TODO Auto-generated constructor stub
	}
	
	public ResultMessage addFavorities(String id){
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage removeFavorities(String id){
		return ResultMessage.SUCCEED;
	}

}
