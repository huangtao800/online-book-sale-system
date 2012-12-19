package presentationController.Member;

import java.util.ArrayList;

import po.BookPO;
import po.MemberPO;
import po.ResultMessage;
import vo.KeywordVO;

public interface MemberViewService {
	public void searchKeyword(KeywordVO keywordVO);
	public void searchType(String type);
	public ResultMessage removeFavority(int selectedRow);
	public ResultMessage changeName(String newName);
	public boolean checkPassword(String password);
	public ResultMessage changePassword(String password);
	
	public ResultMessage putInCart(int selectedRow, int number);
	public void enterCart();	//进入购物车
	public ResultMessage changeAddress(String newAddress);
	public ResultMessage cancel(String password);
	public MemberPO freshMemberPO(String memberID);
	
	public void freshMemberVO();
	public ArrayList<String> getBookType();
}
