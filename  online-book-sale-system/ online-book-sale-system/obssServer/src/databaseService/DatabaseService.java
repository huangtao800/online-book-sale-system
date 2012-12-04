//»ÆÌÎ
package databaseService;
import java.rmi.Remote;

import po.PO;

public interface DatabaseService extends Remote{
	public void insert(PO po);
	public void delete(PO po);
	public void update(PO po);
	public PO find(String id);
}
