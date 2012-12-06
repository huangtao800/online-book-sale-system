//»ÆÌÎ
package databaseService.member;

import po.BookPO;
import po.MemberPO;
import po.ResultMessage;
import databaseService.DatabaseService;

public interface MemberDatabaseService extends DatabaseService{
	public ResultMessage addFavorities(BookPO bookPO, MemberPO memberPO);
	public ResultMessage removeFavorities(BookPO bookPO, MemberPO memberPO);
	public ResultMessage updateMember(MemberPO memberPO);
}
