package po;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
 
    public void setUserName(String name){
    	userName = name;
    }
    
    public String getUserName(){
    	return userName;
    }
    
    public void setUserID(String id){
    	userID = id;
    }
    
    public String getUserID(){
    	return userID;
    }
    
    public void setUserPassword(String Password){
    	userPassword = Password;
    }
    
    public String getUserPassword(){
    	return userPassword;
    }

    public void setUserRole(UserRole role){
    	userRole = role;
    }
    
    public UserRole getUserRole(){
    	return userRole;
    }
    
   
    
}
