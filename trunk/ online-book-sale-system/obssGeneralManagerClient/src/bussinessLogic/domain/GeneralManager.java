package bussinessLogic.domain;

import java.rmi.Naming;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;

import databaseService.init.InitDatabaseService;

public class GeneralManager {
       private InitDatabaseService initDatabase;
       
   	public GeneralManager(){
		try {
			initDatabase=(InitDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/InitDatabase");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
   	
   	public ResultMessage updateUserPO(UserPO userPO, UserRole role){
   		try{
   		return initDatabase.updateUserPO(userPO, role);
   		}catch(Exception e){
   			return ResultMessage.FAILED;
   		}
   	}
}
