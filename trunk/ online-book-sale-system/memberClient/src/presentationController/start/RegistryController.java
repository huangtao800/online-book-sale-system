package presentationController.start;

import java.rmi.Naming;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import databaseService.init.InitDatabaseService;
import po.CustomerPO;
import po.ResultMessage;
import po.UserRole;
import presentation.RegistryView;
import presentationController.customer.CustomerViewController;
import presentationController.customer.CustomerViewService;
import bussinessLogic.controller.UserController;
import bussinessLogicService.RegistryBLService;
import bussinessLogicService.StartBLService;
import bussinessLogicService.UserBLService;

public class RegistryController implements RegistryBLService {

	private RegistryView registryView;
	private StartBLService startController;
	private InitDatabaseService initDatabase;
	private CustomerViewService memberViewController;		//跳转至Member主界面的Controller

	public RegistryController(StartBLService startController) {
		this.startController = startController;

		registryView = new RegistryView(this);
		registryView.setVisible(true);

		try {
			initDatabase = (InitDatabaseService) Naming
					.lookup("rmi://127.0.0.1:5000/InitDatabase");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void registry(String name, String password,String address) {
		// TODO Auto-generated method stub
		CustomerPO newMemberPO = null;
		try {
			newMemberPO = initDatabase.registry(name, password,address);

			if (newMemberPO == null) {
				JOptionPane.showMessageDialog(null, "抱歉！该用户名已被使用！");
			} else {
				JOptionPane.showMessageDialog(null, "恭喜！注册成功！");
				
				registryView.setVisible(false);
				startController.setStartViewFalse();
				enterMemberView(newMemberPO);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	private void enterMemberView(CustomerPO customerPO) {
		memberViewController=CustomerViewController.getInstance(customerPO);
		
	}
}
