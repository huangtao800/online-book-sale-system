package bussinessObject;

import po.BookPO;
import po.FavorityPO;
import po.MemberPO;
import po.ResultMessage;

public class Customer {
	private MemberPO memberPO;
	
	public Customer(MemberPO po){
		setMemberPO(po);
	}

	public ResultMessage addFavority(BookPO bookPO){
		if(isFavorityFull()){
			return ResultMessage.FULL;
		}else {
			memberPO.getFavority().addBook(bookPO);
			return ResultMessage.SUCCEED;
		}
	}
	
	public ResultMessage removeFavority(BookPO bookPO){
		if(isFavorityEmpty()){
			return ResultMessage.EMPTY;
		}
		
		return memberPO.getFavority().removeBook(bookPO);
	}
	
	
	public MemberPO getMemberPO() {
		return memberPO;
	}

	public void setMemberPO(MemberPO memberPO) {
		this.memberPO = memberPO;
	}
	
	private boolean isFavorityFull(){
		return memberPO.getFavority().judgeFull();
	}
	
	private boolean isFavorityEmpty(){
		return memberPO.getFavority().isEmpty();
	}
}
