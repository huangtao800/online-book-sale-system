package bussinessLogic.controller;
//尤佳琪
import po.ResultMessage;
import bussinessLogicService.UserBLService;

public class UserBLService_Driver {
	
	public void drive(UserBLService userBLService){
		
		 ResultMessage result1 = userBLService.login("11111", "123456");
  	     if(result1==ResultMessage.SUCCEED){
  		          System.out.println("Login Succeed!");
  	     }
		
      	 ResultMessage result2 = userBLService.addUser("11111", "张三", "顾客", "123456");
   	     if(result2==ResultMessage.SUCCEED){
   		          System.out.println("Add Succeed!");
   	     }
   	     
   	     ResultMessage result3 = userBLService.deleteUser("11111");
	     if(result3==ResultMessage.SUCCEED){
		          System.out.println("Delete Succeed!");
	     }
	     
	     ResultMessage result4 = userBLService.changeUser("11111", "张三", "顾客", "123456");
	     if(result4==ResultMessage.SUCCEED){
		          System.out.println("ChangeUser Succeed!");
	     }
	     
	     ResultMessage result5 = userBLService.findChangingUser("11111");
	     if(result5==ResultMessage.SUCCEED){
		          System.out.println("FindChangeUser Succeed!");
	     }
    }
}
