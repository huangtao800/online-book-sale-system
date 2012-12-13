package database.present;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.PO;
import po.PresentPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import database.init.InitDatabase;
import database.member.MemberDatabase;
import databaseService.DatabaseService;
import databaseService.init.InitDatabaseService;
import databaseService.present.PresentDatabaseService;

public class PresentDatabase extends UnicastRemoteObject implements  PresentDatabaseService{
	private static final String PresentPOList_Ser="presentPO.ser";
	private InitDatabaseService initDatabase;
	private static PresentDatabase presentDatabase;
	private ArrayList<PresentPO> presentPOList=new ArrayList<PresentPO>();
	
	protected PresentDatabase() throws RemoteException{
		super();
		initDatabase=InitDatabase.getInstance();
		readPresentPOList();
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
	
	private void readPresentPOList() throws RemoteException{
		try {
			ObjectInputStream poInputStream=new ObjectInputStream(new FileInputStream(PresentPOList_Ser));
			presentPOList=(ArrayList<PresentPO>)poInputStream.readObject();
			poInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception	
			e.printStackTrace();
		}
	}
	
	public ArrayList<PresentPO> getPresentPOList() throws RemoteException{
//		return InitDatabase.getPresentList();
		return this.presentPOList;
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
	
//Ìí¼ÓÒ»¸öpromotionPO
  public ResultMessage writePresentPOList(PresentPO presentPO) throws RemoteException{
			try{
				presentPOList.add(presentPO);
				ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(PresentPOList_Ser));
				
				poOutPutStream.writeObject(presentPOList);
				poOutPutStream.close();
				return ResultMessage.SUCCEED;
			}catch(IOException e){
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
