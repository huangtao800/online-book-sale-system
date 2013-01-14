package presentationController.customer;

import java.util.ArrayList;

import po.BookPO;
import po.CustomerPO;
import po.ResultMessage;
import vo.KeywordVO;

public interface CustomerViewService {
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
	public CustomerPO freshMemberPO(String memberID);

	public ArrayList<String> getBookType();
	public void changeToAnotherUser();
	public void setOnFalse();
}
