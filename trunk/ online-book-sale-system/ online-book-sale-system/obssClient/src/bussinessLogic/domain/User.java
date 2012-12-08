package bussinessLogic.domain;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.rmi.Naming;
import java.util.ArrayList;

import databaseService.user.UserDatabaseService;
import po.*;

//尤佳琪
public class User {
	ArrayList<MemberPO> arrayMember = new ArrayList<MemberPO>();
	ArrayList<AdministratorPO>  arrayAdmin = new ArrayList<AdministratorPO>();
	ArrayList<GeneralManagerPO> arrayGeneralManager = new ArrayList<GeneralManagerPO>();
	ArrayList<SalesManagerPO> arraySalesManager = new ArrayList<SalesManagerPO>();
	User user;
	
	public User(){
		
	}

	//系统管理员管理用户（增，删，改）
	public void addUser(UserPO userPO,UserRole userRole){
		if(userRole==UserRole.Member){
			arrayMember.add((MemberPO)userPO);
		}else if(userRole==UserRole.Administrator){
			arrayAdmin.add((AdministratorPO)userPO);
		}else if(userRole==UserRole.GeneralManager){
			arrayGeneralManager.add((GeneralManagerPO)userPO);
		}else if(userRole==UserRole.SalesManager){
			arraySalesManager.add((SalesManagerPO)userPO);
		}
		
		
	}
	
	public ResultMessage deleteUser(String id){
		UserPO userPO = user.findUser(id);
		
		if(userPO!=null){
			if(userPO.getUserRole()==UserRole.Member){
				arrayMember.remove((MemberPO)userPO);
			}else if(userPO.getUserRole()==UserRole.Administrator){
				arrayAdmin.remove((AdministratorPO)userPO);
			}else if(userPO.getUserRole()==UserRole.GeneralManager){
				arrayGeneralManager.remove((GeneralManagerPO)userPO);
			}else if(userPO.getUserRole()==UserRole.SalesManager){
				arraySalesManager.remove((SalesManagerPO)userPO);
			}
			
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}
	
	public ResultMessage changeUser(UserPO u,String id){
        UserPO userPO = user.findUser(id);
		
		if(userPO!=null){
			if(userPO.getUserRole()==UserRole.Member){
				arrayMember.remove((MemberPO)userPO);
				arrayMember.add((MemberPO)u);
			}else if(userPO.getUserRole()==UserRole.Administrator){
				arrayAdmin.remove((AdministratorPO)userPO);
				arrayAdmin.add((AdministratorPO)u);
			}else if(userPO.getUserRole()==UserRole.GeneralManager){
				arrayGeneralManager.remove((GeneralManagerPO)userPO);
				arrayGeneralManager.add((GeneralManagerPO)u);
			}else if(userPO.getUserRole()==UserRole.SalesManager){
				arraySalesManager.remove((SalesManagerPO)userPO);
				arraySalesManager.add((SalesManagerPO)u);
			}
			
			return ResultMessage.SUCCEED ;
		}else{
			return ResultMessage.FAILED ;
		}
	}
	
	private UserPO findUser(String id){
		UserPO userPO = null;
		
		for(int i=0;i<arrayMember.size();i++){
			if(id.equals(arrayMember.get(i).getUserID())){
				userPO = arrayMember.get(i);
			}
		}
		
		for(int i=0;i<arrayGeneralManager.size();i++){
			if(id.equals(arrayGeneralManager.get(i).getUserID())){
				userPO = arrayGeneralManager.get(i);
			}
		}
		
		for(int i=0;i<arrayAdmin.size();i++){
			if(id.equals(arrayAdmin.get(i).getUserID())){
				userPO = arrayAdmin.get(i);
			}
		}
		
		for(int i=0;i<arraySalesManager.size();i++){
			if(id.equals(arraySalesManager.get(i).getUserID())){
				userPO = arraySalesManager.get(i);
			}
		}
		
		return userPO;
	}

}
