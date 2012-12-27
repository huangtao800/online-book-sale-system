package presentationController.Admin;

import java.util.ArrayList;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;

import po.AdministratorPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.AdminOverview;

public class AdminOverviewController implements AdminOverviewService {
	private static AdminOverviewService uniqueInstance;
	private AdminOverview adminOverview;
	private AdminViewService adminViewController;
	private AdministratorPO administratorPO;
	
	
	public AdminOverviewController(AdministratorPO administratorPO){
		
	    this.administratorPO  = administratorPO; 
	    adminViewController = AdminViewController.getInstance();
		adminOverview = new AdminOverview(this,administratorPO);
		adminOverview.setVisible(true);
	}
	
	
	
	 public ArrayList<UserPO> overviewUser(){
		 return adminViewController.getAllUser();
	 }
	    
	 public UserPO findUser(String name,UserRole userRole){
		 return adminViewController.findUser(name, userRole);
	 }
	 
	 public void initAdminView(int index){
		 adminViewController.init(index);
	 }
	 
	 public ResultMessage changePassword(UserPO userPO){
		 return adminViewController.changePassword(userPO);
	 }

	 public ResultMessage changeName(UserPO beforeUserPO,UserPO afterUserPO){
		 return adminViewController.change(beforeUserPO, afterUserPO);
	 }
	 
	 public void changeToAnotherUser(){
		 adminOverview.setVisible(false);
	}
	 
}
