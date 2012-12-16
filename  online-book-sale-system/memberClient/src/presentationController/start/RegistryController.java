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
	private MemberViewService memberViewController;		//��ת��Member�������Controller

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
				JOptionPane.showMessageDialog(null, "��Ǹ�����û����ѱ�ʹ�ã�");
			} else {
				JOptionPane.showMessageDialog(null, "��ϲ��ע��ɹ���");
				
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
