package database.user;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import javax.print.attribute.standard.Sides;

import po.AdministratorPO;
import po.BookPO;
import po.CustomerPO;
import po.GeneralManagerPO;
import po.PO;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;

import database.book.BookDatabase;
import database.customer.CustomerDatabase;
import database.init.InitDatabase;
import databaseService.init.InitDatabaseService;
import databaseService.user.UserDatabaseService;

public class UserDatabase extends UnicastRemoteObject implements UserDatabaseService{
	private UserDatabaseService userDatabase;
	private InitDatabaseService initDatabase;
	private static UserDatabase instance=null;
	private ArrayList<CustomerPO> customerList;
	private ArrayList<SalesManagerPO> salesManagerList;
	private ArrayList<GeneralManagerPO> generalManagerList;
	private ArrayList<AdministratorPO> administratorList;

	protected UserDatabase() throws RemoteException{
		initDatabase = InitDatabase.getInstance();
		customerList = InitDatabase.getMemberPOList();
		salesManagerList = InitDatabase.getSalesManagerList();
		generalManagerList = InitDatabase.getGeneralManagerList();
		administratorList = InitDatabase.getAdministratorList();
	}

	
	public static UserDatabase getInstance(){
		if(instance==null){
			try {
				instance=new UserDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return instance;
	}
	

	private int getIsExistIndex(UserPO userPO){
        int index = -1;
        if(userPO.getUserRole()==UserRole.Administrator){
        	 for(int i=0;i<administratorList.size();i++){
             	if(userPO.getUserID().equals(administratorList.get(i).getUserID())){
             		return i;
             	}
             }
        }else if(userPO.getUserRole()==UserRole.SalesManager){
        	 for(int i=0;i<salesManagerList.size();i++){
             	if(userPO.getUserID().equals(salesManagerList.get(i).getUserID())){
             		return i;
             	}
             }
        }else if(userPO.getUserRole()==UserRole.GeneralManager){
        	 for(int i=0;i<generalManagerList.size();i++){
             	if(userPO.getUserID().equals(generalManagerList.get(i).getUserID())){
             		return i;
             	}
             }
        }else{
        	 for(int i=0;i<customerList.size();i++){
             	if(userPO.getUserID().equals(customerList.get(i).getUserID())){
             		return i;
             	}
             }
        }
       
        
        return -1;
	}
	
	
	//用来查找某个存在的用户
	private UserPO searchUser(String name, String password,ArrayList<UserPO> userList){
		for(int i=0;i<userList.size();i++){
			UserPO current=userList.get(i);
			if(current.getUserName().equals(name)
					&&current.getUserPassword().equals(password)){
				return current;
			}
		}
		
		return null;
	}

	@Override
	public ResultMessage insert(PO po) throws RemoteException {
		UserPO userPO = (UserPO)po;
		UserRole userRole = userPO.getUserRole();
		String name = userPO.getUserName();
		ResultMessage resultMessage= isNameExist(name, userRole);
		
		if(resultMessage==ResultMessage.EXIST){      //该用户已经存在了
			return ResultMessage.EXIST;
		}else{           //用户不存在则添加\
			if(userRole==UserRole.Administrator){
				String id = userPO.getUserID();
				String nameString = userPO.getUserName();
				String password = userPO.getUserPassword();
				AdministratorPO administratorPO = new AdministratorPO(id, nameString, password);
				administratorList.add(administratorPO);
				return writeAdmin();
			}else if(userRole==UserRole.SalesManager){
				String id = userPO.getUserID();
				String nameString = userPO.getUserName();
				String password = userPO.getUserPassword();
				SalesManagerPO salesManagerPO = new SalesManagerPO(id, nameString, password);
				salesManagerList.add(salesManagerPO);
				return writeSalesManager();
			}else if(userRole==UserRole.GeneralManager){
				String id = userPO.getUserID();
				String nameString = userPO.getUserName();
				String password = userPO.getUserPassword();
				GeneralManagerPO generalManagerPO = new GeneralManagerPO(id, nameString, password);
				generalManagerList.add(generalManagerPO);
				return writeGeneralManager();
			}else{
				String id = userPO.getUserID();
				String nameString = userPO.getUserName();
				String password = userPO.getUserPassword();
				CustomerPO customerPO = new CustomerPO(id, nameString, password, "暂无常用地址");
				customerList.add(customerPO);
				return writeMember();
			}
		
		}
	 }
	
	//判断用户名是否存在
	 private ResultMessage isNameExist(String name,UserRole userRole){
		 int i = -1;
		 if(userRole==UserRole.Member){
			 for(int j=0;j<customerList.size();j++){
				 if(customerList.get(j).getUserName().equals(name)){
					 i=j;
				 }
			 }
		 }else if(userRole==UserRole.Administrator){
			 for(int j=0;j<administratorList.size();j++){
				 if(administratorList.get(j).getUserName().equals(name)){
					 i=j;
				 }
			 }
		 }else if(userRole==UserRole.SalesManager){
			 for(int j=0;j<salesManagerList.size();j++){
				 if(salesManagerList.get(j).getUserName().equals(name)){
					 i=j;
				 }
			 }
		 }else{
			 for(int j=0;j<generalManagerList.size();j++){
				 if(generalManagerList.get(j).getUserName().equals(name)){
					 i=j;
				 }
			 }
		 }
		 
		 if(i==-1){
			 return ResultMessage.NOTEXIST;
		 }else{
			 return ResultMessage.EXIST;
		 }
	 }
	
	public ResultMessage delete(PO po) throws RemoteException {
		UserPO userPO = (UserPO)po;
		UserRole userRole = userPO.getUserRole();
		int index = getIsExistIndex(userPO);
		if(userRole==UserRole.Administrator){
			administratorList.remove(index);
			return writeAdmin();
		}else if(userRole==UserRole.SalesManager){
			salesManagerList.remove(index);
			return writeSalesManager();
		}else if(userRole==UserRole.GeneralManager){
			generalManagerList.remove(index);
			return writeGeneralManager();
		}else{
			customerList.remove(index);
			return writeMember();
		}
	}

	@Override
	//修改用户的密码
	public ResultMessage update(PO po) throws RemoteException {
		UserPO newUserPO = (UserPO)po;
		UserRole userRole = newUserPO.getUserRole();
	    UserPO oldUserPO = findUserThroughID(newUserPO.getUserID(), userRole);
		int index = getIsExistIndex(oldUserPO);
		if(userRole==UserRole.Administrator){
			administratorList.get(index).setUserPassword(newUserPO.getUserPassword());
			return writeAdmin();
		}else if(userRole==UserRole.SalesManager){
			salesManagerList.get(index).setUserPassword(newUserPO.getUserPassword());
			return writeSalesManager();
		}else if(userRole==UserRole.GeneralManager){
			generalManagerList.get(index).setUserPassword(newUserPO.getUserPassword());
			return writeGeneralManager();
		}else{
			customerList.get(index).setUserPassword(newUserPO.getUserPassword());
			return writeMember();
		}
		
		
	}
	
	//修用户名有变的用户(只改变了用户名，或者改变了用户名或者密码)
	public ResultMessage modify(UserPO beforeUserPO,UserPO afterUserPO)throws RemoteException{
		UserRole userRole = beforeUserPO.getUserRole();
		String afterName = afterUserPO.getUserName();
		ResultMessage resultMessage = isNameExist(afterName, userRole);
		if(resultMessage==ResultMessage.EXIST){
			return ResultMessage.EXIST;
		}else{
			if(beforeUserPO!=null){
				//用户ID和用户类型不可修改，只有用户密码和用户名可以修改
				int index = getIsExistIndex(beforeUserPO);
				if(userRole==UserRole.Administrator){
//					administratorList.remove(index);
					
					String id = afterUserPO.getUserID();
					String nameString = afterUserPO.getUserName();
					String password = afterUserPO.getUserPassword();
//					AdministratorPO administratorPO = new AdministratorPO(id, nameString, password);
					administratorList.get(index).setUserName(nameString);
					administratorList.get(index).setUserPassword(password);
					return writeAdmin();
				}else if(userRole==UserRole.SalesManager){
//					salesManagerList.remove(index);
					
					String id = afterUserPO.getUserID();
					String nameString = afterUserPO.getUserName();
					String password = afterUserPO.getUserPassword();
//					SalesManagerPO salesManagerPO = new SalesManagerPO(id, nameString, password);
//					salesManagerList.add(salesManagerPO);
					salesManagerList.get(index).setUserName(nameString);
					salesManagerList.get(index).setUserPassword(password);
					return writeSalesManager();
				}else if(userRole==UserRole.GeneralManager){
//					generalManagerList.remove(index);
					
					String id = afterUserPO.getUserID();
					String nameString = afterUserPO.getUserName();
					String password = afterUserPO.getUserPassword();
//					GeneralManagerPO generalManagerPO = new GeneralManagerPO(id, nameString, password);
//					generalManagerList.add(generalManagerPO);
					generalManagerList.get(index).setUserName(nameString);
					generalManagerList.get(index).setUserPassword(password);
					return writeGeneralManager();
				}else{
//					customerList.remove(index);
					
					String id = afterUserPO.getUserID();
					String nameString = afterUserPO.getUserName();
					String password = afterUserPO.getUserPassword();
//					CustomerPO customerPO = new CustomerPO(id, nameString, password, "暂无常用地址");
					customerList.get(index).setUserName(nameString);
					customerList.get(index).setUserPassword(password);
//					customerList.add(customerPO);
					return writeMember();
				}
				
			}else{
				return ResultMessage.FAILED;
			}
		}
		
	
	}
	
	public UserPO findUserThroughName(String name,UserRole userRole) throws RemoteException{
		UserPO userPO = null;
		if(userRole==UserRole.Administrator){
			for(int i=0;i<administratorList.size();i++){
				if(administratorList.get(i).getUserName().equals(name)){
					userPO = administratorList.get(i);
				}
			}
		}else if(userRole==UserRole.SalesManager){
			for(int i=0;i<salesManagerList.size();i++){
				if(salesManagerList.get(i).getUserName().equals(name)){
					userPO = salesManagerList.get(i);
				}
			}
		}else if(userRole==UserRole.GeneralManager){
			for(int i=0;i<generalManagerList.size();i++){
				if(generalManagerList.get(i).getUserName().equals(name)){
					userPO = generalManagerList.get(i);
				}
			}
		}else{
			for(int i=0;i<customerList.size();i++){
				if(customerList.get(i).getUserName().equals(name)){
					userPO = customerList.get(i);
				}
			}
		}
		
		return userPO;
	}
	
	private UserPO findUserThroughID(String id,UserRole userRole)throws RemoteException{
		UserPO userPO = null;
		if(userRole==UserRole.Administrator){
			for(int i=0;i<administratorList.size();i++){
				if(administratorList.get(i).getUserID().equals(id)){
					userPO = administratorList.get(i);
				}
			}
		}else if(userRole==UserRole.SalesManager){
			for(int i=0;i<salesManagerList.size();i++){
				if(salesManagerList.get(i).getUserID().equals(id)){
					userPO = salesManagerList.get(i);
				}
			}
		}else if(userRole==UserRole.GeneralManager){
			for(int i=0;i<generalManagerList.size();i++){
				if(generalManagerList.get(i).getUserID().equals(id)){
					userPO = generalManagerList.get(i);
				}
			}
		}else{
			for(int i=0;i<customerList.size();i++){
				if(customerList.get(i).getUserID().equals(id)){
					userPO = customerList.get(i);
				}
			}
		}
		
		return userPO;
	}
	
	@SuppressWarnings("null")
	public ArrayList<UserPO> getAllUser() throws RemoteException{
		ArrayList<UserPO> userList = new ArrayList<UserPO>();
		userList.addAll(administratorList);
		userList.addAll(customerList);
		userList.addAll(generalManagerList);
		userList.addAll(salesManagerList);
		return userList;
	
	}
	

	private ResultMessage writeAdmin(){
		FileOutputStream fileOutputStream;
	
		try{
			fileOutputStream=new FileOutputStream("administrator.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(administratorList);
		    fileOutputStream.close();
			objectOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	private ResultMessage writeMember(){
		FileOutputStream fileOutputStream;
	
		try{
			fileOutputStream=new FileOutputStream("member.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(customerList);
		    fileOutputStream.close();
			objectOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	private ResultMessage writeSalesManager(){
		FileOutputStream fileOutputStream;
	
		try{
			fileOutputStream=new FileOutputStream("salesManager.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(salesManagerList);
		    fileOutputStream.close();
			objectOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	private ResultMessage writeGeneralManager(){
		FileOutputStream fileOutputStream;
	
		try{
			fileOutputStream=new FileOutputStream("generalManager.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(generalManagerList);
		    fileOutputStream.close();
			objectOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	@Override
	public String autoGetUserId(UserRole userRole) throws RemoteException{
			
			if(userRole==UserRole.Administrator){
				AdministratorPO administratorPO = administratorList.get(administratorList.size()-1);
				String maxId = administratorPO.getUserID();
				maxId = maxId.substring(1);
				String max = ""+(Integer.parseInt(maxId)+1);
				return "a"+max;
			}else if(userRole==UserRole.SalesManager){
				SalesManagerPO salesManagerPO = salesManagerList.get(salesManagerList.size()-1);
				String maxId = salesManagerPO.getUserID();
				maxId = maxId.substring(1);
				String max = ""+(Integer.parseInt(maxId)+1);
				return "s"+max;
			}else if(userRole==UserRole.GeneralManager){
				GeneralManagerPO generalManagerPO = generalManagerList.get(generalManagerList.size()-1);
				String maxId = generalManagerPO.getUserID();
				maxId = maxId.substring(1);
				String max = ""+(Integer.parseInt(maxId)+1);
				return "g"+max;
			}else{
				CustomerPO customerPO = customerList.get(customerList.size()-1);
				String maxId = customerPO.getUserID();
				maxId = maxId.substring(1);
				String max = ""+(Integer.parseInt(maxId)+1);
				return "m"+max;
			}
		
	}


	

}
