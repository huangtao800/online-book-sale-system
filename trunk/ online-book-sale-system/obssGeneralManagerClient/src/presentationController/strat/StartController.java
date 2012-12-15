package presentationController.strat;

import java.rmi.Naming;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import databaseService.init.InitDatabaseService;

import po.GeneralManagerPO;
import po.MemberPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.StartView;
import presentationController.GeneralManagerView.GeneralManagerViewController;
import presentationController.GeneralManagerView.GeneralManagerViewControllerInterface;

import bussinessLogic.controller.PromotionController;
import bussinessLogicService.StartBLService;
import bussinessLogicService.UserBLService;

public class StartController implements StartBLService {
	private StartView startView;
	private InitDatabaseService initDatabase;

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
//			System.out.println("success!");
		} else {
			JOptionPane.showMessageDialog(null, "对不起！用户名或密码错误！");
		}
	}


	@Override
	public void enterMainView(UserRole role,UserPO userPO) {
		// TODO Auto-generated method stub
		GeneralManagerPO generalManagerPO=(GeneralManagerPO) userPO;
		
		GeneralManagerViewControllerInterface promotionViewController=new GeneralManagerViewController(generalManagerPO);
		
	}

	@Override
	public void setStartViewFalse() {
		// TODO Auto-generated method stub
		startView.setVisible(false);
	}

}
