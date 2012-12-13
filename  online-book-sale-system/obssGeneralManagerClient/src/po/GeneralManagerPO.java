package po;

public class GeneralManagerPO extends UserPO{
	public GeneralManagerPO(String id,String name,String password){
		super(id, name, password, UserRole.GeneralManager);
	}
}
