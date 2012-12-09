package presentationController.Member;

import po.BookPO;
import po.ResultMessage;

public interface MemberViewService {
	public void searchKeyword(KeywordVO keywordVO);
	public void searchType(String type);
	public ResultMessage removeFavority(BookPO bookPO);
}
