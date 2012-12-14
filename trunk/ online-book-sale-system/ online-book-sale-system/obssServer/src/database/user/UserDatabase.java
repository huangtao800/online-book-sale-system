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
		UserPO userPO = (UserPO)po;
		UserRole userRole = userPO.getUserRole();
		
		try {
			FileOutputStream fos;
			if(userRole==UserRole.Member){
				fos=new FileOutputStream("member.ser");
			}else if(userRole==UserRole.GeneralManager){
				fos=new FileOutputStream("generalManager.ser");
			}else if(userRole==UserRole.SalesManager){
				fos=new FileOutputStream("salesManager.ser");
			}else{
				fos=new FileOutputStream("admin.ser");
			}
			
            ObjectOutputStream oos = new ObjectOutputStream(fos);                       
            oos.writeObject(po);
            oos.close();                        
            return ResultMessage.SUCCEED;
        } catch (Exception ex) { 
      	    ex.printStackTrace();   
      	    return ResultMessage.FAILED;
        }
		
	}
	
	public ResultMessage changePassword(String name,String password,UserRole userRole)throws RemoteException{
		return ResultMessage.SUCCEED;
	}

	
	public ResultMessage delete(PO po) throws RemoteException {
		return null;
	}

	@Override
	//修改用户信息
	public ResultMessage update(PO po) throws RemoteException {
		UserPO userPO = (UserPO)po;
		UserRole userRole = userPO.getUserRole();
		ArrayList<UserPO> userList = UserDatabase.getInstance().readFileByRole(userRole);
		ResultMessage resultMessage = ResultMessage.FAILED;
		
		for(int i=0;i<userList.size();i++){ 
			//用户ID和用户类型不可修改，只有用户密码和用户名可以修改
			if(userList.get(i).getUserID().equals(userPO.getUserID())){
				userList.get(i).setUserName(userPO.getUserName());
				userList.get(i).setUserPassword(userPO.getUserPassword());
				
				resultMessage = ResultMessage.SUCCEED;
			}
		}
		
		return resultMessage;
	}
	
	public UserPO findUserThroughName(String name,UserRole userRole) {
		ArrayList<UserPO> userList = UserDatabase.getInstance().readFileByRole(userRole);
		UserPO userPO = null;
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getUserName().equals(name)){
				userPO = userList.get(i);
			}
		}
		return userPO;
	}
	
	public ArrayList<UserPO> getAllUser()throws RemoteException{
		ArrayList<UserPO> arrayList = new ArrayList<>();
		return arrayList;
	}
	
	
}
