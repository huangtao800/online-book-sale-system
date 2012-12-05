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

public class StartController implements StartBLService{
	StartView startView;
	UserBLService userController;
	RegistryBLService registryController;
	

	//���캯��Ӧ����Model
	public StartController(){
		userController=UserController.getInstance();
		startView=new StartView(this);
		startView.setVisible(true);
	}
	
	@Override
	public void logIn(String name, String password,UserRole role) {
		// TODO Auto-generated method stub
		UserPO userPO=userController.login(name, password, role);
		
		if(userPO!=null){
			startView.setVisible(false);
			startView.dispose();
			System.out.println("success!");
			initNewView(role);
		}else {
			JOptionPane.showMessageDialog(null, "�Բ����û������������");
		}
	}
	
	private void initNewView(UserRole role){
		if(role==UserRole.Member){
			
		}else if(role==UserRole.SalesManager){
			
		}
	}


	@Override
	public void startRegistry() {
		// TODO Auto-generated method stub
		registryController=new RegistryController();
	}

}
