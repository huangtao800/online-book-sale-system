package presentationController.Admin;

import po.ResultMessage;
import po.UserRole;
import presentationController.start.StartController;
import bussinessLogicService.StartBLService;

public class AdminStartController implements AdminStartService{
   private static StartBLService startController;
   private static AdminStartService uniqueInstance;
   
   private AdminStartController(){
	   startController = new StartController();
   }
   
   public static AdminStartService getInstance(){
		 if(startController==null){
			 uniqueInstance = new AdminStartController() ;
		 }
		 
		 return uniqueInstance;
   }
   
   
   
}
