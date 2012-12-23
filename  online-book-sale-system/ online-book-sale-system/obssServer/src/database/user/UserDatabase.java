package database.user;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.BookPO;
import po.PO;
import po.ResultMessage;
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

	protected UserDatabase() throws RemoteException{

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
		FileInputStream inputStream;
		ArrayList<UserPO> userList=null;
		
		try {
			if(userRole==UserRole.Member){
				inputStream=new FileInputStream("member.ser");
			}else if(userRole==UserRole.GeneralManager){
				inputStream=new FileInputStream("generalManager.ser");
			}else if(userRole==UserRole.SalesManager){
				inputStream=new FileInputStream("salesManager.ser");
			}else{
				inputStream=new FileInputStream("administrator.ser");
			}
			
			ObjectInputStream objInput=new ObjectInputStream(inputStream);	
			userList=(ArrayList<UserPO>)objInput.readObject();
			
			inputStream.close();
			objInput.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return userList;
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
	//修改用户信息
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
	
	//修用户名有变得用户
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
		FileOutputStream fileOutputStream;
	
		try {
			if(userRole==UserRole.Member){
				fileOutputStream=new FileOutputStream("member.ser");
			}else if(userRole==UserRole.GeneralManager){
				fileOutputStream=new FileOutputStream("generalManager.ser");
			}else if(userRole==UserRole.SalesManager){
				fileOutputStream=new FileOutputStream("salesManager.ser");
			}else{
				fileOutputStream=new FileOutputStream("administrator.ser");
			}
			
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
