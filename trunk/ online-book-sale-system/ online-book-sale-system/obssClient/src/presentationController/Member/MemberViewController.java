package presentationController.Member;

import bussinessLogic.controller.MemberController;
import bussinessLogicService.MemberBLService;
import po.MemberPO;
import presentation.MemberView;

public class MemberViewController implements MemberViewService{
	
	private MemberView memberView;
	private static MemberViewService instance;
	private MemberPO memberPO;
	private MemberBLService memberController;
	
	private MemberViewController(MemberPO memberPO){
		memberView=new MemberView(this);
		memberView.setVisible(true);
		this.memberPO=memberPO;
		this.memberController=MemberController.getInstance(memberPO);
	}

	@Override
	public void searchKeyword(KeywordVO keywordVO) {
		// TODO Auto-generated method stub
		
	}

	public static MemberViewService getInstance(MemberPO memberPO){
		if(instance==null){
			instance=new MemberViewController(memberPO);
		}
		
		return instance;
	}

	@Override
	public void searchType(String type) {
		// TODO Auto-generated method stub
		
	}
	
	public void setViewVisible(){
		memberView.setVisible(true);
	}
}
