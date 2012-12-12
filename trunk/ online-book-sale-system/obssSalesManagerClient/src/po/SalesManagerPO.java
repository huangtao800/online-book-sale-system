package po;

public class SalesManagerPO extends UserPO{
	public SalesManagerPO(String id,String name,String password){
		super(id, name, password, UserRole.SalesManager);
	}
}
