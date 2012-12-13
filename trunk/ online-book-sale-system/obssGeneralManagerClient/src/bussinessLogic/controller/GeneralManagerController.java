package bussinessLogic.controller;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import bussinessLogic.domain.GeneralManager;
import bussinessLogicService.GeneralManagerBLService;

public class GeneralManagerController implements GeneralManagerBLService {
	private static GeneralManagerBLService generalManagerController;
	private static GeneralManager generalManager=new GeneralManager();
	
	private GeneralManagerController(){
		
	}
	
	public static GeneralManagerBLService getInstance(){
		if(generalManagerController==null){
			generalManagerController=new GeneralManagerController();
		}
		return generalManagerController;
	}
	
	
	public ResultMessage updateUserPO(UserPO userPO, UserRole role){
		return generalManager.updateUserPO(userPO, role);
	}
}
