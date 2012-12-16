package presentationController.start;

import java.rmi.Naming;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import databaseService.init.InitDatabaseService;
import po.MemberPO;
import po.ResultMessage;
import po.UserRole;
import presentation.RegistryView;
import presentationController.Member.MemberViewController;
import presentationController.Member.MemberViewService;
import bussinessLogic.controller.UserController;
import bussinessLogicService.RegistryBLService;
import bussinessLogicService.StartBLService;
import bussinessLogicService.UserBLService;

public class RegistryController implements RegistryBLService {

	private RegistryView registryView;
	private StartBLService startController;
	private InitDatabaseService initDatabase;
	private MemberViewService memberViewController;		//跳转至Member主界面的Controller

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
		MemberPO newMemberPO = null;
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

	private void enterMemberView(MemberPO memberPO) {
		memberViewController=MemberViewController.getInstance(memberPO);
		
	}
}
