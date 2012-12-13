package po;

import java.io.*;

//ÓÈ¼Ñç÷
public class UserPO implements PO{
    private String userID,userName,userPassword;
    private UserRole userRole;
    private boolean userState;
    
    public UserPO(){
    	
    }
    
    public UserPO(String id,String name,String password,UserRole role,boolean state){
    	userID = id;
    	userName = name;
    	userPassword = password;
    	userRole = role;
    	userState = state;
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
    
    public void setUserState(boolean state) {
		userState = state;
	}
    
    public boolean getUserState(){
    	return userState;
    }
   
    
    
}
