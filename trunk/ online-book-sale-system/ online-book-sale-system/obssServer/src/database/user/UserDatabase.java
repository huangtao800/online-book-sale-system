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
import database.init.InitDatabase;
import database.member.MemberDatabase;
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
		// TODO Auto-generated method stub
		UserPO result=null;
		
		ArrayList<UserPO> userList=readFileByRole(userRole);
		result=searchUser(userName, password, userList);
				
		return result;
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
		ArrayList<UserPO> userList=readFileByRole(userRole);
		
		UserPO tempPO = isExisit(userPO.getUserName(), userPO.getUserPassword(), userRole);
		if(tempPO!=null){
			userList.add(userPO);
			writeFileByRole(userList, userRole);
			return ResultMessage.SUCCEED;
		}else{
			return ResultMessage.EXIST;
		}
		
	}
	
	public ResultMessage changePassword(String name,String password,UserRole userRole)throws RemoteException{
		return ResultMessage.SUCCEED;
	}

	
	public ResultMessage delete(PO po) throws RemoteException {
		UserPO userPO = (UserPO)po;
		UserRole userRole = userPO.getUserRole();
		ArrayList<UserPO> userList=readFileByRole(userRole);
		
		UserPO tempPO = searchUser(userPO.getUserName(), userPO.getUserPassword(), userList);
		if(tempPO!=null){
			userList.remove(userPO);
			writeFileByRole(userList, userRole);
			return ResultMessage.SUCCEED;
		}else{
			return ResultMessage.FAILED;
		}
	}

	@Override
	//修改用户信息
	public ResultMessage update(PO po) throws RemoteException {
		UserPO userPO = (UserPO)po;
		UserRole userRole = userPO.getUserRole();
		ArrayList<UserPO> userList = readFileByRole(userRole);
		
		UserPO tempPO = searchUser(userPO.getUserName(), userPO.getUserPassword(), userList);
		if(tempPO!=null){
			//用户ID和用户类型不可修改，只有用户密码和用户名可以修改
			userList.remove(tempPO);
			userList.add(userPO);
			writeFileByRole(userList, userRole);
			return ResultMessage.SUCCEED;
		}else{
			return ResultMessage.FAILED;
		}
	
	}
	
	public UserPO findUserThroughName(String name,UserRole userRole) {
		ArrayList<UserPO> userList = readFileByRole(userRole);
		UserPO userPO = null;
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getUserName().equals(name)){
				userPO = userList.get(i);
			}
		}
		return userPO;
	}
	
	public ArrayList<UserPO> getAllUser() throws RemoteException{
		ArrayList<UserPO> userList=null;
		FileInputStream	inputStream;
		ObjectInputStream objInput;
		
		try {
		    inputStream=new FileInputStream("member.ser");
		    objInput=new ObjectInputStream(inputStream);	
		    ArrayList<UserPO> member=(ArrayList<UserPO>)objInput.readObject();
		   
		    inputStream=new FileInputStream("administrator.ser");
		    objInput=new ObjectInputStream(inputStream);	
		    ArrayList<UserPO> administrator=(ArrayList<UserPO>)objInput.readObject();
		    
		    inputStream=new FileInputStream("generalManager.ser");
		    objInput=new ObjectInputStream(inputStream);	
		    ArrayList<UserPO> generalManager=(ArrayList<UserPO>)objInput.readObject();
		    
		    inputStream=new FileInputStream("salesManager.ser");
		    objInput=new ObjectInputStream(inputStream);	
		    ArrayList<UserPO> salesManager=(ArrayList<UserPO>)objInput.readObject();
		    
		    userList.addAll(member);
		    userList.addAll(administrator);
		    userList.addAll(generalManager);
		    userList.addAll(salesManager);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return userList;
	}
	
	private void writeFileByRole(ArrayList<UserPO> arrayList,UserRole userRole){
		FileOutputStream fileOutputStream;
		ArrayList<UserPO> userList=null;
		
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
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
