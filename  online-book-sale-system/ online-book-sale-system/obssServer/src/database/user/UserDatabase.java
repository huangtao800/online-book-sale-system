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
		
		ArrayList<UserPO> userList=UserDatabase.getInstance().readFileByRole(userRole);
		result=searchUser(userName, password, userList);
				
		return result;
	}
	
	private int getIsExistIndex(UserPO userPO ,ArrayList<UserPO> arrayList){
	    ArrayList<UserPO> bookList = UserDatabase.getInstance().readFileByRole(userPO.getUserRole());
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
		ArrayList<UserPO> userList=UserDatabase.getInstance().readFileByRole(userRole);
		
	    userList.add(userPO);
		return UserDatabase.getInstance().writeFileByRole(userList, userRole);
		
    }
	
	public ResultMessage changePassword(String name,String password,UserRole userRole)throws RemoteException{
		return ResultMessage.SUCCEED;
	}

	
	public ResultMessage delete(PO po) throws RemoteException {
		UserPO userPO = (UserPO)po;
		UserRole userRole = userPO.getUserRole();
		ArrayList<UserPO> userList=UserDatabase.getInstance().readFileByRole(userRole);
		int index = UserDatabase.getInstance().getIsExistIndex(userPO, userList);
		userList.remove(index);
        return UserDatabase.getInstance().writeFileByRole(userList, userRole);
		
	}

	@Override
	//修改用户信息
	public ResultMessage update(PO po) throws RemoteException {
		return ResultMessage.SUCCEED;
	}
	
	public ResultMessage modify(UserPO beforeUserPO,UserPO afterUserPO)throws RemoteException{
		ArrayList<UserPO> userList = UserDatabase.getInstance().readFileByRole(beforeUserPO.getUserRole());
		if(beforeUserPO!=null){
			//用户ID和用户类型不可修改，只有用户密码和用户名可以修改
			int index = UserDatabase.getInstance().getIsExistIndex(beforeUserPO, userList);
			userList.remove(index);
			userList.add(afterUserPO);
			return UserDatabase.getInstance().writeFileByRole(userList, afterUserPO.getUserRole());
		}else{
			return ResultMessage.FAILED;
		}
	
	}
	
	public UserPO findUserThroughName(String name,UserRole userRole) throws RemoteException{
		ArrayList<UserPO> userList = UserDatabase.getInstance().readFileByRole(userRole);
		UserPO userPO = null;
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getUserName().equals(name)){
				userPO = userList.get(i);
			}
		}
		return userPO;
	}
	
	private UserPO findUserThroughID(String id,UserRole userRole)throws RemoteException{
		ArrayList<UserPO> userList = UserDatabase.getInstance().readFileByRole(userRole);
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
		ArrayList<UserPO> userList = UserDatabase.getInstance().readFileByRole(UserRole.Administrator);
		userList.addAll(UserDatabase.getInstance().readFileByRole(UserRole.SalesManager));
		userList.addAll(UserDatabase.getInstance().readFileByRole(UserRole.Member));
		userList.addAll(UserDatabase.getInstance().readFileByRole(UserRole.GeneralManager));
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
			ArrayList<UserPO> userList =UserDatabase.getInstance().readFileByRole(userRole);
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
