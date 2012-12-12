package bussinessLogic.domain;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

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
    	try {
			return presentDatabase.getPresentPOList();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
    
	public ResultMessage sendPresent(){
		try {
			return presentDatabase.sendPresent();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
}
