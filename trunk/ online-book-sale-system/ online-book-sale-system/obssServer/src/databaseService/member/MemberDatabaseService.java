//»ÆÌÎ
package databaseService.member;

import java.rmi.RemoteException;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.ResultMessage;
import po.VIPRank;
import databaseService.DatabaseService;

public interface MemberDatabaseService extends DatabaseService {
	public ResultMessage updataMember(MemberPO memberPO) throws RemoteException;
}
