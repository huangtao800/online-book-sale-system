package databaseService.present;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.PresentPO;
import po.ResultMessage;

import databaseService.DatabaseService;

public interface PresentDatabaseService extends DatabaseService{
	public ArrayList<PresentPO> getPresentPOList() throws RemoteException;
	public ResultMessage sendPresent() throws RemoteException;
	public ResultMessage writePresentPOList(PresentPO presentPO) throws RemoteException;

}
