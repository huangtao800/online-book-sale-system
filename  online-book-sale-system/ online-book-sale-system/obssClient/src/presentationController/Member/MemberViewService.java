package presentationController.Member;

import po.BookPO;
import po.MemberPO;
import po.ResultMessage;

public interface MemberViewService {
	public void searchKeyword(KeywordVO keywordVO);
	public void searchType(String type);
	public ResultMessage removeFavority(BookPO bookPO);
	public ResultMessage changeName(String newName);
	public boolean checkPassword(String password);
	public ResultMessage changePassword(String password);
	
	public ResultMessage putInCart(BookPO bookPO);
	public void enterCart();	//进入购物车
	public ResultMessage changeAddress(String newAddress);
	public ResultMessage cancel(String password);
	public MemberPO freshMemberPO(String memberID);
}
