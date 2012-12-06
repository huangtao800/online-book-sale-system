package database.member;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.ResultMessage;
import po.VIPRank;
import database.init.InitDatabase;
import databaseService.init.InitDatabaseService;
import databaseService.member.MemberDataseService;

public class MemberDatabase extends UnicastRemoteObject implements MemberDataseService{
	private InitDatabaseService initDatabase;
	

	public MemberDatabase() throws RemoteException{
		super();
		initDatabase=InitDatabase.getInstance();
	}

	@Override
	public ResultMessage addCoupon(CouponPO couponPO, VIPRank rank)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ResultMessage removeFromFavorities(String bookID, String memberID)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addEquivalent(EquivalentPO equivalentPO, VIPRank rank)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addFavorities(BookPO bookPO, MemberPO memberPO)
			throws RemoteException {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public ResultMessage updataMember(MemberPO memberPO) throws RemoteException {
		// TODO Auto-generated method stub
		
		return null;
	};
}
