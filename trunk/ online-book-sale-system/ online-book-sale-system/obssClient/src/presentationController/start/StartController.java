package presentationController.start;

import java.rmi.Naming;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import databaseService.init.InitDatabaseService;

import po.MemberPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.RegistryView;
import presentation.StartView;
import presentationController.Member.MemberViewController;
import presentationController.Member.MemberViewService;
import bussinessLogic.controller.UserController;
import bussinessLogicService.RegistryBLService;
import bussinessLogicService.StartBLService;
import bussinessLogicService.UserBLService;

public class StartController implements StartBLService {
	private StartView startView;
	private InitDatabaseService initDatabase;
	private RegistryBLService registryController;

	// 构造函数应传入Model
	public StartController() {
		try {
			initDatabase=(InitDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/InitDatabase");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		startView = new StartView(this);
		startView.setVisible(true);
	}

	@Override
	public void logIn(String name, String password, UserRole role) {
		// TODO Auto-generated method stub
		UserPO userPO=null;
		try {
			userPO = initDatabase.logIn(name, password, role);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (userPO != null) {
			startView.setVisible(false);
			startView.dispose();
			
			enterMainView(role,userPO);
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
	public void enterMainView(UserRole role,UserPO userPO) {
		// TODO Auto-generated method stub
		if (role == UserRole.Member) {
			MemberPO memberPO=(MemberPO) userPO;
			MemberViewService memberViewController=MemberViewController.getInstance(memberPO);
		} else if (role == UserRole.SalesManager) {

		}
	}

	@Override
	public void setStartViewFalse() {
		// TODO Auto-generated method stub
		startView.setVisible(false);
	}

}
