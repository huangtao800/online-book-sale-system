package po;
//ÓÈ¼Ñç÷
public class UserPO implements PO{
    private String userID,userName,userPassword;
    private UserRole userRole;
    
    public UserPO(){
    	
    }
    
    public UserPO(String id,String name,String password,UserRole role){
    	userID = id;
    	userName = name;
    	userPassword = password;
    	userRole = role;
    }
    
    public String getUserName(){
    	return userName;
    }
    
    public void steUserName(String name){
    	userName = name;
    }
    
    public String getUserID(){
    	return userID;
    }
    
    public void steUserID(String id){
    	userID = id;
    }
    
    public String getUserPassword(){
    	return userPassword;
    }
    
    public void steUserPassword(String Password){
    	userPassword = Password;
    }
    
    public UserRole getUserRole(){
    	return userRole;
    }
    
    public void steUserRole(UserRole role){
    	userRole = role;
    }
    
}
