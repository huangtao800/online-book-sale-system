package database.user;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.PO;
import po.UserPO;
import po.UserRole;

import databaseService.user.UserDatabaseService;

public class UserDatabase extends UnicastRemoteObject implements UserDatabaseService{

	public UserDatabase() throws RemoteException {
		// TODO Auto-generated constructor stub
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
	//����UserRole����Ӧ���л��ļ�
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
				inputStream=new FileInputStream("admin.ser");
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
	
}