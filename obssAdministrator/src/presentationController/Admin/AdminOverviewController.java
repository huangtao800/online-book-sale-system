package presentationController.Admin;

import java.util.ArrayList;

import bussinessLogic.controller.UserController;
import bussinessLogicService.UserBLService;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.AdminOverview;

public class AdminOverviewController implements AdminOverviewService {
	private static AdminOverviewService uniqueInstance;
	private AdminOverview adminOverview;
	private AdminViewService adminViewController;
	
	public AdminOverviewController(){
		adminViewController = AdminViewController.getInstance();
		
		adminOverview = new AdminOverview(this);
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

}
