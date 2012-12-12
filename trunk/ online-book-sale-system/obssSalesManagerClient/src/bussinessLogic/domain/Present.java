package bussinessLogic.domain;

import java.rmi.Naming;
import java.util.ArrayList;

import bussinessLogicService.PresentBLService;

import po.MemberPO;
import po.PresentPO;
import po.ResultMessage;
import databaseService.DatabaseService;

import databaseService.member.MemberDatabaseService;
import databaseService.present.PresentDatabaseService;

public class Present {
	private PresentDatabaseService presentDatabase ;
	
	public Present() {
		
		try {
			presentDatabase=(PresentDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/PresentDatabase");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

    public ArrayList<PresentPO> getPresentPOList(){
    	return presentDatabase.getPresentPOList();
	}
    
	public ResultMessage sendPresent(){
		return presentDatabase.sendPresent();
	}
}
