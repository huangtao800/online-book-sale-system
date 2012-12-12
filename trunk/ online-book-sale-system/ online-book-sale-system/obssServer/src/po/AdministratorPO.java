package po;

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
    
}


