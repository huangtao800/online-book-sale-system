package database.init;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.PresentPO;

import po.AdministratorPO;
import po.GeneralManagerPO;
import po.MemberPO;
import po.PromotionPO;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;

import databaseService.init.InitDatabaseService;

public class InitDatabase extends UnicastRemoteObject implements
		InitDatabaseService {
	private static final String PromotionPO_Ser="promotionPO.ser";
	private static final String PresentPOList_Ser="presentPO.ser";
	
	
	private static ArrayList<MemberPO> memberPOList;
	private static ArrayList<SalesManagerPO> salesManagerPOList;
	private static ArrayList<GeneralManagerPO> generalManagerList;
	private static ArrayList<AdministratorPO> adminstratorList;
	private static PromotionPO promotionPO;
	private static ArrayList<PresentPO> presentPOList=new ArrayList<PresentPO>();
	
	private static InitDatabase instance;

	private InitDatabase() throws RemoteException {
		super();
		initData();
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<MemberPO> getMemberPOList(){
		return memberPOList;
	}
	
	public static ArrayList<SalesManagerPO> getSalesManagerList(){
		return salesManagerPOList;
	}
	
	public static ArrayList<GeneralManagerPO> getGeneralManagerList(){
		return generalManagerList;
	}
	
	public static ArrayList<AdministratorPO> getAdministratorList(){
		return adminstratorList;
	}
	
	public static PromotionPO getPromotionPO(){
		return promotionPO;
	}

	public static ArrayList<PresentPO> getPresentList(){
		return presentPOList;
	}
	
	@Override
	public void initData() throws RemoteException {
		// TODO Auto-generated method stub
		readMember();
		readSalesManager();
		readGeneralManager();
		readAdministrator();
		
		promotionPORead();
		readPresentPO();
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
	
	@SuppressWarnings("unchecked")
	private void readSalesManager() {
		try {
			FileInputStream inputStream = new FileInputStream("salesManager.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					inputStream);

			salesManagerPOList = (ArrayList<SalesManagerPO>) objectInputStream.readObject();
			
			inputStream.close();
			objectInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void readGeneralManager() {
		try {
			FileInputStream inputStream = new FileInputStream("generalManager.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					inputStream);

			generalManagerList = (ArrayList<GeneralManagerPO>) objectInputStream.readObject();
			
			inputStream.close();
			objectInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void readAdministrator() {
		try {
			FileInputStream inputStream = new FileInputStream("adminstrator.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(
					inputStream);

			adminstratorList = (ArrayList<AdministratorPO>) objectInputStream.readObject();
			
			inputStream.close();
			objectInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	private void readPresentPO() {
		try {
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(PresentPOList_Ser));
			presentPOList=(ArrayList<PresentPO>)inputStream.readObject();
			inputStream.close();
			
		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "δ����Ҫ����ȡ��presentPOList�ļ���");
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
	
	private void saveGeneralManager(){
		try {
			FileOutputStream outputStream=new FileOutputStream("generalManager.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
			
			objectOutputStream.writeObject(generalManagerList);
			
			outputStream.close();
			objectOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void saveSalesManager(){
		try {
			FileOutputStream outputStream=new FileOutputStream("salesManager.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
			
			objectOutputStream.writeObject(salesManagerPOList);
			
			outputStream.close();
			objectOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void saveAdminstrator(){
		try {
			FileOutputStream outputStream=new FileOutputStream("adminstrator.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
			
			objectOutputStream.writeObject(adminstratorList);
			
			outputStream.close();
			objectOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//�����ݲ��ȡ�����ֶ���Ϣ
	 private PromotionPO promotionPORead(){
		 //�����л�
		 try {
			 ObjectInputStream poInputStream=new ObjectInputStream(new FileInputStream(PromotionPO_Ser));
			 promotionPO=(PromotionPO)poInputStream.readObject();
			poInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return promotionPO;
	 }

	@Override
	public UserPO logIn(String userName, String password, UserRole userRole) {
		UserPO result=null;
		
		if(userRole==UserRole.Member){
			result=searchMember(userName, password);
		}
		
		if(userRole==UserRole.SalesManager){
			result=searchSalesManager(userName, password);
		}
		
		if(userRole==UserRole.GeneralManager){
			result=searchGeneralManager(userName,password);
		}

		if(userRole==UserRole.Administrator){
			result=searchAdministrator(userName, password);
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
	
	private SalesManagerPO searchSalesManager(String name,String password){
		SalesManagerPO resultPo=null;
		for(int i=0;i<salesManagerPOList.size();i++){
			if(name.equals(salesManagerPOList.get(i).getUserName())
					&&password.equals(salesManagerPOList.get(i).getUserPassword())){
				return salesManagerPOList.get(i);
			}
		}
		
		return resultPo;
	}
	
	private GeneralManagerPO searchGeneralManager(String name,String password){
		GeneralManagerPO resultPo=null;
		for(int i=0;i<generalManagerList.size();i++){
			if(name.equals(generalManagerList.get(i).getUserName())
					&&password.equals(generalManagerList.get(i).getUserPassword())){
				return generalManagerList.get(i);
			}
		}
		
		return resultPo;
	}
	
	private AdministratorPO searchAdministrator(String name,String password){
		AdministratorPO resultPo=null;
		for(int i=0;i<adminstratorList.size();i++){
			if(name.equals(adminstratorList.get(i).getUserName())
					&&password.equals(adminstratorList.get(i).getUserPassword())){
				return adminstratorList.get(i);
			}
		}
		
		return resultPo;
	}
	
	//����һ��������ʵ��
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
			return null;		//�û����ѱ�ʹ��
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

}
