//»ÆÌÎ
package databaseService.member;

import java.rmi.RemoteException;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.ResultMessage;
import po.VIPRank;
import databaseService.DatabaseService;

public interface MemberDataseService extends DatabaseService {
	public ResultMessage addCoupon(CouponPO couponPO, VIPRank rank)
			throws RemoteException;

	public ResultMessage addFavorities(BookPO bookPO, String memberID)
			throws RemoteException;

	public ResultMessage removeFromFavorities(String bookID, String memberID)
			throws RemoteException;

	public ResultMessage addEquivalent(EquivalentPO equivalentPO, VIPRank rank)
			throws RemoteException;
}
