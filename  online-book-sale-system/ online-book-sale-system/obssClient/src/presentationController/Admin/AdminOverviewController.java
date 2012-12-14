package presentationController.Admin;

import java.util.ArrayList;

import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import presentation.AdminOverview;

public class AdminOverviewController implements AdminOverviewService {
	private static AdminOverviewService uniqueInstance;
	private AdminOverview adminOverview;
	private AdminViewService adminViewController;
	
	private AdminOverviewController(){
		adminOverview = new AdminOverview();
		adminOverview.setVisible(true);
	}
	
	public static AdminOverviewService getInstance(){
		 if(uniqueInstance==null){
			 uniqueInstance = new AdminOverviewController() ;
		 }
		 
		 return uniqueInstance;
	}
	
	 public ArrayList<UserPO> overviewUser(){
		 
	 }
	    
	 public UserPO findUser(String name,UserRole userRole){
		 
		 
	 }
	 
	 public ResultMessage add(String userName,String userID,String userPassword,UserRole userRole){
		 
	 }
		
	 public ResultMessage change(String userName,String userID,String userPassword,UserRole userRole){
		 
	 }
		
	 public ResultMessage delete(String id,UserRole userRole){
		 
	 }

}
