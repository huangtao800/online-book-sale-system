package bussinessLogic.domain;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.rmi.Naming;

import databaseService.user.UserDatabaseService;
import po.*;

//ÓÈ¼Ñç÷
public class User {
	public User(){
		
	}
	
    /*public UserPO isExist(String userName,String password,UserRole userRole){
    	UserPO user = new UserPO();
    	user = null;
    	
		try {
			UserDatabaseService userDatabase=
					(UserDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/UserDatabase");
			user=userDatabase.isExisit(userName, password, userRole);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
        return user;
    }*/
}
