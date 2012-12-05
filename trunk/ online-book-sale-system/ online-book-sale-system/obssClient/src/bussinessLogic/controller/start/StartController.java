package bussinessLogic.controller.start;

import javax.swing.JOptionPane;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.RegistryView;
import presentation.StartView;
import bussinessLogic.controller.UserController;
import bussinessLogicService.RegistryBLService;
import bussinessLogicService.StartBLService;
import bussinessLogicService.UserBLService;

public class StartController implements StartBLService {
	StartView startView;
	UserBLService userController;
	RegistryBLService registryController;

	// 构造函数应传入Model
	public StartController() {
		userController = UserController.getInstance();
		startView = new StartView(this);
		startView.setVisible(true);
	}

	@Override
	public void logIn(String name, String password, UserRole role) {
		// TODO Auto-generated method stub
		UserPO userPO = userController.login(name, password, role);

		if (userPO != null) {
			startView.setVisible(false);
			startView.dispose();
			
			enterMainView(role);
			System.out.println("success!");
		} else {
			JOptionPane.showMessageDialog(null, "对不起！用户名或密码错误！");
		}
	}


	@Override
	public void startRegistry() {
		// TODO Auto-generated method stub
		registryController = new RegistryController(this);
	}

	@Override
	public void enterMainView(UserRole role) {
		// TODO Auto-generated method stub
		if (role == UserRole.Member) {

		} else if (role == UserRole.SalesManager) {

		}
	}

}
