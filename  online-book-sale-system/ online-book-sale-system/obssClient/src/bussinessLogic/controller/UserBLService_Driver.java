package bussinessLogic.controller;

import po.BookPO;
import po.ResultMessage;
import bussinessLogicService.BookBLService;
import bussinessLogicService.UserBLService;

public class UserBLService_Driver {
	public void drive(UserBLService userBLService){
      	 ResultMessage result = userBLService.addUser("00001", "����", "�˿�", "123456");
   	     if(result==ResultMessage.SUCCEED){
   		          System.out.println("User Exist!");
   	     }
    }
}
