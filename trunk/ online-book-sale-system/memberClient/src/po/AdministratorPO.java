package po;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AdministratorPO extends UserPO{
 
    public AdministratorPO(){
    	
    }
    
    public AdministratorPO(String id,String name,String password){
    	super(id, name, password, UserRole.Administrator);
    }
    
}

