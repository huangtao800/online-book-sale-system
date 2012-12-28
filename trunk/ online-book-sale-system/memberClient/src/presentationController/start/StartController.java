package presentationController.start;

import java.rmi.Naming;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import databaseService.init.InitDatabaseService;

import po.CustomerPO;

import po.UserPO;
import po.UserRole;

import presentation.StartView;

import presentationController.customer.CustomerViewController;
import presentationController.customer.CustomerViewService;

import bussinessLogicService.RegistryBLService;
import bussinessLogicService.StartBLService;

public class StartController implements StartBLService {
	private StartView startView;
	private InitDatabaseService initDatabase;
	private RegistryBLService registryController;

	// 构造函数应传入Model
	public StartController() {
		try {
//			String ip = JOptionPane.showInputDialog(null, "请输入服务器IP地址", "XXX.XXX.XXX.XXX");
			initDatabase = (InitDatabaseService) Naming.lookup("rmi://"+"127.0.0.1"+":5000/InitDatabase");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ip地址错误或服务器未开启！系统将自动关闭。");
			System.exit(1);
		}
		startView = new StartView(this);
		startView.setVisible(true);
	}

	@Override
	public void logIn(String name, String password, UserRole role) {
		// TODO Auto-generated method stub

		UserPO userPO = null;
		try {
			userPO = initDatabase.logIn(name, password, role);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (userPO != null) {
			startView.setVisible(false);
			startView.dispose();

			enterMainView(role, userPO);
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
	public void enterMainView(UserRole role, UserPO userPO) {
		// TODO Auto-generated method stub
		CustomerPO customerPO = (CustomerPO) userPO;
		CustomerViewService memberViewController = CustomerViewController
				.getInstance(customerPO);
	}

	@Override
	public void setStartViewFalse() {
		// TODO Auto-generated method stub
		startView.setVisible(false);
	}

}
