package database.user;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.PO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;

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

	@Override
	public ResultMessage insert(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage delete(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	//修改用户信息
	public ResultMessage update(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public UserPO findUserThroughID(String id) {
		UserPO userPO = new UserPO();
		return userPO;
	}
	
	public UserPO findUserThroughName(String name){
		UserPO userPO = new UserPO();
		return userPO;
	}
	
}
