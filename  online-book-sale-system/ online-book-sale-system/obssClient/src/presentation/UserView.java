package presentation;
//�ȼ���

import bussinessLogic.domain.User;
import bussinessLogicService.UserBLService;

public class UserView {

	UserBLService user = new User("����","123456","11111");
    
	private void start(){
		user.login("11111", "123456");
		user.changeUser("11111", "����", "�˿�", "123456");
	}
	
	public static void main(String[] args){
		UserView userView = new UserView();
		userView.start();
	}
}