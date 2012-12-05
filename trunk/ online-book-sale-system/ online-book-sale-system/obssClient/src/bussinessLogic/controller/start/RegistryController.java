package bussinessLogic.controller.start;

import po.ResultMessage;
import presentation.RegistryView;
import bussinessLogic.controller.UserController;
import bussinessLogicService.RegistryBLService;
import bussinessLogicService.UserBLService;

public class RegistryController implements RegistryBLService{
	private UserBLService userController;
	private RegistryView registryView;

	
	public RegistryController(){
		userController=UserController.getInstance();
		registryView=new RegistryView(this);
		registryView.setVisible(true);
	}

	@Override
	public ResultMessage registry(String name, String password) {
		// TODO Auto-generated method stub
//		String id=userController.generateID(UserRole.Member);	//UserÄ£¿éÌá¹©
//		userController.addUser(name, id, password, UserRole.Member);
		return null;
	}


}
