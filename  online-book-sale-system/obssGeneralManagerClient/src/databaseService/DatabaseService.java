//»ÆÌÎ
package databaseService;
import java.rmi.Remote;
import java.rmi.RemoteException;

import po.PO;
import po.ResultMessage;

public interface DatabaseService extends Remote{
	public ResultMessage insert(PO po) throws RemoteException;
	public ResultMessage delete(PO po) throws RemoteException;
	public ResultMessage update(PO po) throws RemoteException;
}
