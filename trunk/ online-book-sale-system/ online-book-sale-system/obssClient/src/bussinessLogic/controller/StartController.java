package bussinessLogic.controller;

import po.UserRole;
import presentation.StartView;
import bussinessLogicService.StartBLService;
import bussinessLogicService.UserBLService;

public class StartController implements StartBLService{
	StartView view;
	UserBLService userController;

	//���캯��Ӧ����Model
	public StartController(){
//		userController=
	}
	
	@Override
	public void logIn(String name, String password,UserRole role) {
		// TODO Auto-generated method stub
		userController.login(name, password, role);
	}

}
