package database.init;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import po.PresentPO;

import po.AdministratorPO;
import po.CouponPO;
import po.EquivalentPO;
import po.GeneralManagerPO;
import po.IdPO;
import po.MemberPO;
import po.PromotionPO;
import po.ResultMessage;
import po.SalesManagerPO;
import po.UserPO;
import po.UserRole;
import po.VIPRank;

import databaseService.init.InitDatabaseService;

public class InitDatabase extends UnicastRemoteObject implements
		InitDatabaseService {
	private static final String PromotionPO_Ser="promotionPO.ser";
	private static final String IdPO_ser="idPO.ser";
	private static final String PresentPOList_ser="presentPO.ser";
	
	
	private static ArrayList<MemberPO> memberPOList;
	private static ArrayList<SalesManagerPO> salesManagerPOList;
	private static ArrayList<GeneralManagerPO> generalManagerList;
	private static ArrayList<AdministratorPO> adminstratorList;
	private static PromotionPO promotionPO;
	private static ArrayList<PresentPO> presentPOList=new ArrayList<PresentPO>();
	private IdPO idPO;
	private  long presentID;

	
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
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(PresentPOList_ser));
			presentPOList=(ArrayList<PresentPO>)inputStream.readObject();
			inputStream.close();
			
		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "未发现要被读取的presentPOList文件！");
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
	
	private void savePresent(){
		try {
			ObjectOutputStream outPutStream=new ObjectOutputStream(new FileOutputStream(PresentPOList_ser));
			outPutStream.writeObject(presentPOList);
			outPutStream.close();
			
		} catch (IOException e) {
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
	
	//从数据层读取促销手段信息
	 private PromotionPO promotionPORead(){
		 //解序列化
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
	
	 //赠送礼券
    public ResultMessage sendPresent() throws RemoteException{
    	getPresentList();

		boolean hasOverdue=false;//有过期礼券	    		
		
		   if(presentPOList ==null || presentPOList.size() == 0){
	    	        return ResultMessage.NOTEXIST;
	       }
	       else{
	        	   readIdPO();
	        	   presentID=idPO.getID();
	        	
	        	   PresentPO presentPO;
	        	   String equivalent[][];       //10*4，每组分别表示:等价券额度，张数，有效截止日期，最低消费  
	        	   
	        	   for(int i=0;i<presentPOList.size();i++){
	        		   presentPO=presentPOList.get(i);
	        		   equivalent=presentPO.getEquivalent();
	        		  //等价券
	        		   for(int j=0;j<equivalent.length;j++){
	        			   if( (Double.parseDouble(equivalent[j][0]) -0.0) <=0.000001){
	        				  
	        			   }
	        			   else{
	        				   if(! isOverdue(equivalent[j][2])){
	        					   for(int t=0;t<Double.parseDouble(equivalent[j][1]); t++){
	        						   EquivalentPO equivalentPO=new EquivalentPO(getNextId(), Double.parseDouble(equivalent[j][0]), 
	        								                                          Double.parseDouble( equivalent[j][3]), stringToCalendar(equivalent[j][2]));
	        						   addEquivalent(presentPO.getVipLevel(), equivalentPO);
	        					   }
	        					   
	        				   }else{
	        					     hasOverdue=true;
	        				   } 
	        			   }
	        		   }//for(j)
	        		  //打折券
	        		   if( (presentPO.getDiscount() - 0.0) <= 0.000001  ){//不存在
	        			  
	        		   }else{
	        		           if( ! isOverdue(presentPO.getEndDateOfCoupon()) ){//
	        		        	   for(int k=0;k<presentPO.getAmountOfCoupon(); k++){
	        		        	         CouponPO couponPO=new CouponPO(getNextId(), presentPO.getDiscount(),
	        		        			                                                   stringToCalendar(presentPO.getEndDateOfCoupon()) );
	        			                  addCoupon(presentPO.getVipLevel(),couponPO);
	        		        	   }//for(k)
	        		            }//if
	        		           else{  
	        		        	 hasOverdue=true;//过期
	        		           }
	        		   }
	        	   }//for(i)
	        	  
	        	idPO.setID(presentID);
	    		presentPOList.clear();
	    		savePresent();
	    		saveMember();
	    		writeIdPO();     	 
	    		
	    	     if(hasOverdue){
        		   return ResultMessage.OVORTIME;
	    	     }else {
					return ResultMessage.SUCCEED;
				}
	           }//else
    }
  
    //
  private void readIdPO(){
	try{
	ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(IdPO_ser));
	idPO=(IdPO)inputStream.readObject();
	inputStream.close();
	}catch(Exception e){
		idPO=new IdPO(0);
		e.printStackTrace();
	}
}

//
private void writeIdPO(){
	try{
		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(IdPO_ser));
		outputStream.writeObject(idPO);
		outputStream.close();
	}catch(IOException e){ 
		e.printStackTrace();
	}
//	idPO=null;
}

//辅助方法,判断礼券是否过期		
private boolean isOverdue(String s){
   	Calendar calNow=Calendar.getInstance();
   	Calendar   calSet=Calendar.getInstance();
   	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
   	try{
   		Date date=dateFormat.parse(s);
   		calSet.setTime(date);
		        int compare;
		        compare=calNow.compareTo(calSet);
		        if(compare>0){//过期
		        	return true;
		        }
		        else{//未过期
		        	return false;
		        }
		       
   	}catch(Exception e){
   		e.printStackTrace();
   		return true;
   	}   	
   }

//把Calendar日期型转换成String
private Calendar stringToCalendar(String s){
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
	Calendar calendar=Calendar.getInstance();
	try {
		Date date=dateFormat.parse(s);
		calendar.setTime(date);
		return calendar;
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}

//产生独一无二的优惠券id
private long getNextId(){
	return (presentID+1);
}

//为顾客添加打折券
private void addCoupon(VIPRank vip,CouponPO couponPO){
	 for(int i=0;i<memberPOList.size();i++){
		 if(memberPOList.get(i).getRank() ==vip){
			 memberPOList.get(i).getCouponList().add(couponPO);
		 }
	 }	//for	 
}

//为顾客添加等价券
private void addEquivalent(VIPRank vip,EquivalentPO equivalentPO){
	 for(int i=0;i<memberPOList.size(); i++){
		 if(memberPOList.get(i).getRank() == vip){
			 memberPOList.get(i).getEquivalentList().add(equivalentPO);
		 }
	 }
}

}
