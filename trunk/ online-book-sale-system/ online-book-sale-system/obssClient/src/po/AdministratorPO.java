package po;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AdministratorPO extends UserPO{
    private String adminID,adminName,adminPassword;
    
    public AdministratorPO(){
    	
    }
    
    public AdministratorPO(String id,String name,String password){
    	adminID = id;
    	adminName = name;
    	adminPassword = password;
    }
    
    public void setAdminID(String id){
    	adminID = id;
    }
    
    public String getAdminID(){
    	return adminID;
    }
    
    public void setAdminName(String name){
    	adminName = name;
    }
    
    public String getAdminName(){
    	return adminName;
    }
    
    public void setAdminPassword(String password){
    	adminPassword = password;
    }
    
    public String getAdminPassword(){
    	return adminPassword;
    }
    
    public void save(String name,String id,String password){
    	AdministratorPO adminPO = new AdministratorPO();
    	adminPO.setAdminName(name);
    	adminPO.setAdminID(id);
    	adminPO.setAdminPassword(password);
    	
    	try{
    		FileOutputStream fs = new FileOutputStream("admin.ser");
    		ObjectOutputStream os  = new ObjectOutputStream(fs);
    		os.writeObject(adminPO);
    		os.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}

