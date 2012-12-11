package database.init;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.MemberPO;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;

import databaseService.init.InitDatabaseService;

public class InitDatabase extends UnicastRemoteObject implements
		InitDatabaseService {

	private ArrayList<MemberPO> memberPOList;
	private static InitDatabase instance;

	private InitDatabase() throws RemoteException {
		super();
		initAllUser();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllUser() throws RemoteException {
		// TODO Auto-generated method stub
		readMember();
	}

	@SuppressWarnings("unchecked")
	private void readMember() {
		try {
			FileInputStream inputStream = new FileInputStream("member.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					inputStream);

			memberPOList = (ArrayList<MemberPO>) objectInputStream.readObject();
			
			inputStream.close();
			objectInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void saveMember(){
		try {
			FileOutputStream outputStream=new FileOutputStream("member.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
			
			objectOutputStream.writeObject(memberPOList);
			
			outputStream.close();
			objectOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public UserPO logIn(String userName, String password, UserRole userRole) {
		UserPO result=null;
		
		if(userRole==UserRole.Member){
			result=searchMember(userName, password);
		}
		
		return result;
	}

	private MemberPO searchMember(String name,String password){
		MemberPO resultPo=null;
		for(int i=0;i<memberPOList.size();i++){
			if(name.equals(memberPOList.get(i).getUserName())
					&&password.equals(memberPOList.get(i).getUserPassword())){
				return memberPOList.get(i);
			}
		}
		
		return resultPo;
	}
	
	//返回一个本对象实例
	public static InitDatabase getInstance(){
		if(instance==null){
			try {
				instance=new InitDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return instance;
	}

	@Override
	public ResultMessage updateUserPO(UserPO userPO, UserRole role)
			throws RemoteException {
		// TODO Auto-generated method stub
		if(role==UserRole.Member){
			MemberPO memberPO=(MemberPO) userPO;
			return updateMemberPO(memberPO);
		}else if (role==UserRole.GeneralManager) {
			
		}
		
		
		return null;
	} 
	
	private ResultMessage updateMemberPO(MemberPO memberPO){
		int index=serachIndexOfMember(memberPO);
		
		if(index==-1){
			return ResultMessage.NOTEXIST;
		}
		
		memberPOList.set(index, memberPO);
		return ResultMessage.SUCCEED;
	}
	
	private int serachIndexOfMember(MemberPO memberPO){
		String id=memberPO.getUserID();
		
		for(int i=0;i<memberPOList.size();i++){
			if(id.equals(memberPOList.get(i).getUserID())){
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public MemberPO registry(String name, String password,String address)
			throws RemoteException {
		// TODO Auto-generated method stub
		if(!isNameValid(name)){
			return null;		//用户名已被使用
		}
		
		int newId=generateNewID();
		String id=""+newId;
		MemberPO newMemberPO=new MemberPO(id, name, password,address);
		memberPOList.add(newMemberPO);
		
		saveMember();
		return newMemberPO;
	}
	
	private int generateNewID(){
		return memberPOList.size()+1;
	}
	
	private boolean isNameValid(String name){
		for(int i=0;i<memberPOList.size();i++){
			if(name.equals(memberPOList.get(i).getUserName())){
				return false;
			}
		}
		
		return true;
	}

	@Override
	public ResultMessage changeName(String newName,UserPO userPO,UserRole role) throws RemoteException {
		// TODO Auto-generated method stub
		if(role==UserRole.Member){
			MemberPO memberPO=(MemberPO) userPO;
			for(int i=0;i<memberPOList.size();i++){
				if(newName.equals(memberPOList.get(i).getUserName())){
					return ResultMessage.EXIST;
				}
			}
			
			memberPO.setUserName(newName);
			return updateMemberPO(memberPO);
		}
		return null;
	}

	@Override
	public ResultMessage changePassword(String password, UserPO userPO,
			UserRole role) throws RemoteException {
		// TODO Auto-generated method stub
		if(role==UserRole.Member){
			MemberPO memberPO=(MemberPO) userPO;
			memberPO.setUserPassword(password);
			
			return updateMemberPO(memberPO);
		}
		return null;
	}
}
