package bussinessLogic.domain;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import po.*;

//ÓÈ¼Ñç÷
public class User implements Serializable{
	public User(){
		
	}
	
    public PO isExist(String userName,String password,UserRole userRole){
    	UserPO user = new UserPO();
    	user = null;
    	
    	try{
    		FileInputStream is = new FileInputStream("user.ser");
    		ObjectInputStream os = new ObjectInputStream(is);
    		UserPO userPO = (UserPO)os.readObject();
    		while(userPO!=null){
    			boolean b1 = userName.equals(userPO.getUserName());
    			boolean b2 = password.equals(userPO.getUserPassword());
    			boolean b3 = userRole.equals(userPO.getUserRole());
    			if(b1&&b2&&b3){
    				user = userPO;
    			}
    			userPO = (UserPO)os.readObject();
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
        return user;
    }
}
