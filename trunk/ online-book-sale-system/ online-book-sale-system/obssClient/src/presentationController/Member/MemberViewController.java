package presentationController.Member;

import presentation.MemberView;

public class MemberViewController implements MemberViewService{
	
	private MemberView memberView;
	private static MemberViewService instance;
	
	private MemberViewController(){
		memberView=new MemberView(this);
		memberView.setVisible(true);
	}

	@Override
	public void searchKeyword(KeywordVO keywordVO) {
		// TODO Auto-generated method stub
		
	}

	public static MemberViewService getInstance(){
		if(instance==null){
			instance=new MemberViewController();
		}
		
		return instance;
	}

	@Override
	public void searchType(String type) {
		// TODO Auto-generated method stub
		
	}
}
