package bussinessLogic.controller.start;

import po.ResultMessage;
import po.UserRole;
import presentation.RegistryView;
import bussinessLogic.controller.UserController;
import bussinessLogicService.RegistryBLService;
import bussinessLogicService.StartBLService;
import bussinessLogicService.UserBLService;

public class RegistryController implements RegistryBLService{
	private UserBLService userController;
	private RegistryView registryView;
	private StartBLService startController;

	
	public RegistryController(StartBLService startController){
		this.userController=UserController.getInstance();
		this.startController=startController;
		
		registryView=new RegistryView(this);
		registryView.setVisible(true);
	}

	@Override
	public ResultMessage registry(String name, String password) {
		// TODO Auto-generated method stub
//		String id=userController.generateID(UserRole.Member);	//User模块提供，生成一个新的ID
//		userController.addUser(name, id, password, UserRole.Member);
		
//		startController.enterMainView(UserRole.Member);	//需要UserPO作为参数
		return null;
	}


}
