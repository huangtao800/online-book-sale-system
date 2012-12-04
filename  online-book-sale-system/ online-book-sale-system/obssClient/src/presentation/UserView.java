package presentation;
//尤佳琪

import po.UserRole;
import bussinessLogic.controller.UserBLService_Stub;
import bussinessLogic.domain.User;
import bussinessLogicService.UserBLService;

public class UserView {

	UserBLService user = new UserBLService_Stub("张三","123456","11111");
    
	private void start(){
		user.login("11111", "123456",UserRole.Member);
		user.changeUser("11111", "张三", "顾客", "123456");
	}
	
	public static void main(String[] args){
		UserView userView = new UserView();
		userView.start();
	}
}