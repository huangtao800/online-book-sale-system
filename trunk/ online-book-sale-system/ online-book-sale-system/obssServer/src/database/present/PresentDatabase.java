package database.present;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.PO;
import po.PresentPO;
import po.ResultMessage;
import database.init.InitDatabase;
import database.member.MemberDatabase;
import databaseService.init.InitDatabaseService;
import databaseService.present.PresentDatabaseService;

public class PresentDatabase extends UnicastRemoteObject implements  PresentDatabaseService{
	private InitDatabaseService initDatabase;
	private static PresentDatabase presentDatabase;
	
	protected PresentDatabase() throws RemoteException{
		super();
		initDatabase=InitDatabase.getInstance();
	}
	
	public static PresentDatabase getInstance(){
		if(presentDatabase==null){
			try {
				presentDatabase=new PresentDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return presentDatabase;
	}
	
	
	public ArrayList<PresentPO> getPresentPOList() throws RemoteException{
		return InitDatabase.getPresentList();
	}
	
	public ResultMessage sendPresent() throws RemoteException{
		try {
			return initDatabase.sendPresent();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public ResultMessage insert(PO po) throws RemoteException{
		return null;
	}
	public ResultMessage delete(PO po) throws RemoteException{
		return null;
	}
	public ResultMessage update(PO po) throws RemoteException{
		return null;
	}

}
