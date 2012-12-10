package database.member;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.management.InstanceAlreadyExistsException;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.MemberPO;
import po.PO;
import po.ResultMessage;
import po.UserRole;
import po.VIPRank;
import database.init.InitDatabase;
import databaseService.init.InitDatabaseService;
import databaseService.member.MemberDatabaseService;

public class MemberDatabase extends UnicastRemoteObject implements MemberDatabaseService{
	private InitDatabaseService initDatabase;
	private static MemberDatabase instance=null;

	protected MemberDatabase() throws RemoteException{
		super();
		initDatabase=InitDatabase.getInstance();
	}

	
	public static MemberDatabase getInstance(){
		if(instance==null){
			try {
				instance=new MemberDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return instance;
	}


	@Override
	public ResultMessage insert(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage delete(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage update(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		MemberPO memberPO=(MemberPO) po;
		
		return initDatabase.updateUserPO(memberPO, UserRole.Member);
	}


	@Override
	public ResultMessage cancel(MemberPO memberPO) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage changeName(String newName,MemberPO memberPO) throws RemoteException {
		// TODO Auto-generated method stub
		return initDatabase.changeName(newName,memberPO,UserRole.Member);
	}


	@Override
	public ResultMessage changePassword(String password, MemberPO memberPO)
			throws RemoteException {
		// TODO Auto-generated method stub
		return initDatabase.changePassword(password, memberPO, UserRole.Member);
	}
}
