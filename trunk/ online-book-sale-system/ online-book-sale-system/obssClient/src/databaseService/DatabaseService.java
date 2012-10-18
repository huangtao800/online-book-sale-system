//»ÆÌÎ
package databaseService;
import po.PO;

public interface DatabaseService {
	public void insert(PO po);
	public void delete(PO po);
	public void update(PO po);
	public PO find(String id);
}
