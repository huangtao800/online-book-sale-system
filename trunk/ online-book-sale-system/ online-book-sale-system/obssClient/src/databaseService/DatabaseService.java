//»ÆÌÎ
package databaseService;
import java.rmi.Remote;
import java.rmi.RemoteException;
import po.PO;

public interface DatabaseService extends Remote{
	public void insert(PO po) throws RemoteException;
	public void delete(PO po) throws RemoteException;
	public void update(PO po) throws RemoteException;
	public PO find(String id) throws RemoteException;
}
