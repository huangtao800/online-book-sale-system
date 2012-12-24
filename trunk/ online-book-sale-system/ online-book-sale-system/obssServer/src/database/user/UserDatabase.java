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
	private static UserDatabase instance=null;
	private ArrayList<UserPO> customerList;
	private ArrayList<UserPO> salesManagerList;
	private ArrayList<UserPO> generalManagerList;
	private ArrayList<UserPO> administratorList;

	protected UserDatabase() throws RemoteException{
		readAdmin();
		readGeneralManager();
		readMember();
		readSalesManager();
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
	
	@Override
	public UserPO isExisit(String userName, String password, UserRole userRole) {
		UserPO result=null;
		ArrayList<UserPO> userList=readFileByRole(userRole);
		result=searchUser(userName, password, userList);
	    return result;
	}
	
	private int getIsExistIndex(UserPO userPO ,ArrayList<UserPO> arrayList){
        int index = -1;
        for(int i=0;i<arrayList.size();i++){
        	if(userPO.getUserID().equals(arrayList.get(i).getUserID())){
        		index = i;
        	}
        }
        
        return index;
	}
	
	
	@SuppressWarnings("unchecked")
	
	//根据UserRole打开相应序列化文件
	private ArrayList<UserPO> readFileByRole(UserRole userRole){
		ArrayList<UserPO> userList=null;
		if(userRole==UserRole.Member){
				userList = readMember();
		}else if(userRole==UserRole.GeneralManager){
				userList = readGeneralManager();
		}else if(userRole==UserRole.SalesManager){
				userList = readSalesManager();
		}else{
			    userList = readAdmin();
		}
				
		return userList;
	}
	
	private ArrayList<UserPO> readAdmin(){
		FileInputStream inputStream;
//		ArrayList<UserPO> userList=null;
		
		try {
			inputStream=new FileInputStream("administrator.ser");
		    ObjectInputStream objInput=new ObjectInputStream(inputStream);	
			administratorList=(ArrayList<UserPO>)objInput.readObject();
		    inputStream.close();
			objInput.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return administratorList;
	}
	
	private ArrayList<UserPO> readGeneralManager(){
		FileInputStream inputStream;
//		ArrayList<UserPO> userList=null;
		
		try {
			inputStream=new FileInputStream("generalManager.ser");
			ObjectInputStream objInput=new ObjectInputStream(inputStream);	
			generalManagerList=(ArrayList<UserPO>)objInput.readObject();
			inputStream.close();
			objInput.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return generalManagerList;
	}
	
	private  ArrayList<UserPO> readMember(){
		FileInputStream inputStream;
//		ArrayList<UserPO> userList=null;
		
		try{
		    inputStream=new FileInputStream("member.ser");
			ObjectInputStream objInput=new ObjectInputStream(inputStream);	
			customerList=(ArrayList<UserPO>)objInput.readObject();
			inputStream.close();
			objInput.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return customerList;
	}
	
	private ArrayList<UserPO> readSalesManager(){
		FileInputStream inputStream;
//		ArrayList<UserPO> userList=null;
		
		try {
			inputStream=new FileInputStream("salesManager.ser");
		    ObjectInputStream objInput=new ObjectInputStream(inputStream);	
			salesManagerList=(ArrayList<UserPO>)objInput.readObject();
			inputStream.close();
			objInput.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return salesManagerList;
	}
	
	public ArrayList<AdministratorPO> getAdmin(){
		ArrayList<AdministratorPO> newAdministratorPOs=new ArrayList<AdministratorPO>();
		for(int i=0;i<administratorList.size();i++){
			newAdministratorPOs.add((AdministratorPO)administratorList.get(i));
		}
		return newAdministratorPOs;
	}
    public ArrayList<GeneralManagerPO> getGeneralManager(){
    	ArrayList<GeneralManagerPO> newGeneralManagerPOs=new ArrayList<GeneralManagerPO>();
    	for(int i=0;i<generalManagerList.size();i++){
    		newGeneralManagerPOs.add((GeneralManagerPO)generalManagerList.get(i));
    	}
    	return newGeneralManagerPOs;
    }
	public ArrayList<CustomerPO> getMember(){
		ArrayList<CustomerPO> newCustomerPOs=new ArrayList<CustomerPO>();
		for(int i=0;i<customerList.size();i++){
			newCustomerPOs.add((CustomerPO)customerList.get(i));
		}
		
		return newCustomerPOs;
	}
	public ArrayList<SalesManagerPO> getSalesManager(){
		ArrayList<SalesManagerPO> newSalesManagerPOs=new ArrayList<SalesManagerPO>();
		for(int i=0;i<salesManagerList.size();i++){
			newSalesManagerPOs.add((SalesManagerPO)salesManagerList.get(i));
		}
		return newSalesManagerPOs;
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
		ArrayList<UserPO> userList=readFileByRole(userRole);
		ResultMessage resultMessage= isNameExist(name, userList);
		
		if(resultMessage==ResultMessage.EXIST){      //该用户已经存在了
			return ResultMessage.EXIST;
		}else{           //用户不存在则添加
			userList.add(userPO);
			return writeFileByRole(userList, userRole);
		}
	 }
	
	//判断用户名是否存在
	 private ResultMessage isNameExist(String name,ArrayList<UserPO> userList){
		 int i = -1;
		 for(int j=0;j<userList.size();j++){
			 if(userList.get(j).getUserName().equals(name)){
				 i=j;
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
		ArrayList<UserPO> userList=readFileByRole(userRole);
		int index = getIsExistIndex(userPO, userList);
		userList.remove(index);
        return writeFileByRole(userList, userRole);
		
	}

	@Override
	//修改用户的密码
	public ResultMessage update(PO po) throws RemoteException {
		UserPO userPO1 = (UserPO)po;
		UserRole userRole = userPO1.getUserRole();
		ArrayList<UserPO> userList=readFileByRole(userRole);
		UserPO userPO2 = findUserThroughID(userPO1.getUserID(), userRole);
		int index = getIsExistIndex(userPO2, userList);
		userList.get(index).setUserID(userPO1.getUserID());
		userList.get(index).setUserName(userPO1.getUserName());
		userList.get(index).setUserPassword(userPO1.getUserPassword());
		userList.get(index).setUserRole(userPO1.getUserRole());
		return writeFileByRole(userList, userRole);
		
	}
	
	//修用户名有变的用户
	public ResultMessage modify(UserPO beforeUserPO,UserPO afterUserPO)throws RemoteException{
		ArrayList<UserPO> userList = readFileByRole(beforeUserPO.getUserRole());
		String afterName = afterUserPO.getUserName();
		ResultMessage resultMessage = isNameExist(afterName, userList);
		if(resultMessage==ResultMessage.EXIST){
			return ResultMessage.EXIST;
		}else{
			if(beforeUserPO!=null){
				//用户ID和用户类型不可修改，只有用户密码和用户名可以修改
				int index = getIsExistIndex(beforeUserPO, userList);
				userList.remove(index);
				userList.add(afterUserPO);
				return writeFileByRole(userList, afterUserPO.getUserRole());
			}else{
				return ResultMessage.FAILED;
			}
		}
		
	
	}
	
	public UserPO findUserThroughName(String name,UserRole userRole) throws RemoteException{
		ArrayList<UserPO> userList = readFileByRole(userRole);
		UserPO userPO = null;
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getUserName().equals(name)){
				userPO = userList.get(i);
			}
		}
		return userPO;
	}
	
	private UserPO findUserThroughID(String id,UserRole userRole)throws RemoteException{
		ArrayList<UserPO> userList = readFileByRole(userRole);
		UserPO userPO = null;
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getUserID().equals(id)){
				userPO = userList.get(i);
			}
		}
		return userPO;
	}
	
	@SuppressWarnings("null")
	public ArrayList<UserPO> getAllUser() throws RemoteException{
		ArrayList<UserPO> userList = readFileByRole(UserRole.Administrator);
		userList.addAll(readFileByRole(UserRole.SalesManager));
		userList.addAll(readFileByRole(UserRole.Member));
		userList.addAll(readFileByRole(UserRole.GeneralManager));
		return userList;
	
	}
	
	private ResultMessage writeFileByRole(ArrayList<UserPO> arrayList,UserRole userRole){
		
			if(userRole==UserRole.Member){
				return writeMember(arrayList);
			}else if(userRole==UserRole.GeneralManager){
				return writeGeneralManager(arrayList);
			}else if(userRole==UserRole.SalesManager){
				return writeSalesManager(arrayList);
			}else{
			    return writeAdmin(arrayList);
			}
			
			
	}
	
	public ResultMessage writeAdmin(ArrayList<UserPO> arrayList){
		FileOutputStream fileOutputStream;
	
		try{
			fileOutputStream=new FileOutputStream("administrator.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(arrayList);
		    fileOutputStream.close();
			objectOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	public ResultMessage writeMember(ArrayList<UserPO> arrayList){
		FileOutputStream fileOutputStream;
	
		try{
			fileOutputStream=new FileOutputStream("member.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(arrayList);
		    fileOutputStream.close();
			objectOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	public ResultMessage writeSalesManager(ArrayList<UserPO> arrayList){
		FileOutputStream fileOutputStream;
	
		try{
			fileOutputStream=new FileOutputStream("salesManager.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(arrayList);
		    fileOutputStream.close();
			objectOutputStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}
	
	public ResultMessage writeGeneralManager(ArrayList<UserPO> arrayList){
		FileOutputStream fileOutputStream;
	
		try{
			fileOutputStream=new FileOutputStream("generalManager.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);	
			objectOutputStream.writeObject(arrayList);
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
			ArrayList<UserPO> userList = readFileByRole(userRole);
			UserPO userPO = userList.get(userList.size()-1);
			String maxId = userPO.getUserID();
			maxId = maxId.substring(1);
			String max = ""+(Integer.parseInt(maxId)+1);
			if(userRole==UserRole.Administrator){
				return "a"+max;
			}else if(userRole==UserRole.SalesManager){
				return "s"+max;
			}else if(userRole==UserRole.GeneralManager){
				return "g"+max;
			}else{
				return "m"+max;
			}
		
	}
	
}
