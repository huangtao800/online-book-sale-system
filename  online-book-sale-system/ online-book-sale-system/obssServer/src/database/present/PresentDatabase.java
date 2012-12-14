package database.present;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import po.CouponPO;
import po.EquivalentPO;
import po.IdPO;
import po.MemberPO;
import po.PO;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import po.VIPRank;
import database.init.InitDatabase;
import database.member.MemberDatabase;
import databaseService.DatabaseService;
import databaseService.init.InitDatabaseService;
import databaseService.present.PresentDatabaseService;

public class PresentDatabase extends UnicastRemoteObject implements  PresentDatabaseService{
	private static final String Present_equivalent_Ser="present_equivalent.ser";
	private static final String Present_coupon_Ser="present_coupon.ser";
	private static PresentDatabase presentDatabase;
	private static ArrayList<Present_Equivalent> present_equivalentList=new ArrayList<Present_Equivalent>();
	private static ArrayList<Present_Coupon> present_couponList=new ArrayList<Present_Coupon>();
	private static ArrayList<MemberPO> memberPOList=new ArrayList<MemberPO>() ;
	private static final String IdPO_ser="idPO.ser";
	private static  IdPO idPO;
	private static  long presentID;
	private InitDatabaseService initDatabase;
	
	
	protected PresentDatabase() throws RemoteException{
		super();
		readPresent_CouponList();
		readPresnet_EquivalentList();
		readIdPO();
		presentID=idPO.getID();
		memberPOList=InitDatabase.getMemberPOList();
		initDatabase=InitDatabase.getInstance();
	}
	
	public static PresentDatabase getInstance(){
		if(presentDatabase==null){
			try {
				presentDatabase=new PresentDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return presentDatabase;
	}
	
	public ArrayList<Present_Equivalent> getEquivalentList() throws RemoteException{
//		readPresnet_EquivalentList();
		return present_equivalentList;
	}
	
	public ArrayList<Present_Coupon>     getCouponList() throws RemoteException{
//		readPresent_CouponList();
		return present_couponList;
	}
	public ResultMessage writePresnet_Equivalent(Present_Equivalent present_equivalent) throws RemoteException{
//		readPresnet_EquivalentList();
		present_equivalentList.add(present_equivalent);
		//序列化
		try {
			ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(Present_equivalent_Ser));
			poOutPutStream.writeObject(present_equivalentList);
			poOutPutStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	public ResultMessage writePresent_Coupon(Present_Coupon present_coupon) throws RemoteException{
//		readPresent_CouponList();
		present_couponList.add(present_coupon);
		try {
			ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(Present_coupon_Ser));
			poOutPutStream.writeObject(present_couponList);
			poOutPutStream.close();
			return ResultMessage.SUCCEED;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	
	public ResultMessage sendPresent() throws RemoteException{
		boolean hasOverdue=false;
		if( (present_equivalentList.size()== 0) && (present_couponList.size()== 0)  ){
			return ResultMessage.NOTEXIST;
		}else{
//			readIdPO();
//			presentID=idPO.getID();
//			memberPOList=InitDatabase.getMemberPOList();
//			readPresent_CouponList();
//			readPresnet_EquivalentList();	
			//等价券
			for(int i=0;i<present_equivalentList.size(); i++){
				Present_Equivalent pre_Equ=present_equivalentList.get(i);
				if( isOverdue(pre_Equ.getEndDate())){
					hasOverdue=true;
				}else{
				     for(int k=0;k<pre_Equ.getAmount(); k++){
					   EquivalentPO equivalentPO=new EquivalentPO(getNextId(), pre_Equ.getDeno(), 
							                                                                    pre_Equ.getMin(), pre_Equ.getEndDate());
				       
					   addEquivalent(pre_Equ.getRank(), equivalentPO);
				    }
				}
			}
			//打折券
			for(int j=0; j<present_couponList.size(); j++){
				Present_Coupon pre_cou=present_couponList.get(j);
				if(isOverdue(pre_cou.getEndDate())){
					hasOverdue=true;
				}else{
					for(int a=0;a<pre_cou.getAmount(); a++){
						CouponPO couponPO=new CouponPO(getNextId(), pre_cou.getRate(), pre_cou.getEndDate());
						
						addCoupon(pre_cou.getRank(), couponPO);
					}			
				}		
			}
			
        	idPO.setID(presentID);
        	writeIdPO(); 
        	present_couponList.clear();
        	present_equivalentList.clear();
    		
        	savePresent_EquivalentList();
        	savePresent_CouponList();
        	
        	initDatabase.saveMember();

    	     if(hasOverdue){
    		   return ResultMessage.OVORTIME;
    	     }else {
				return ResultMessage.SUCCEED;
			}	
		}
	}
	
	//
	private void savePresent_EquivalentList(){
		try {
			ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(Present_equivalent_Ser));
			poOutPutStream.writeObject(present_equivalentList);
			poOutPutStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private void savePresent_CouponList(){
		try {
			ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(Present_coupon_Ser));
			poOutPutStream.writeObject(present_couponList);
			poOutPutStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	 
	
	@SuppressWarnings("unchecked")
	private void readPresnet_EquivalentList(){
		try {
		      ObjectInputStream poInputStream=new ObjectInputStream(new FileInputStream(Present_equivalent_Ser));
		      present_equivalentList=(ArrayList<Present_Equivalent>)poInputStream.readObject();
		      poInputStream.close();
	      } catch (Exception e) {
		       // TODO: handle exception	
//	 	       e.printStackTrace();
	       }
	 }
	
	@SuppressWarnings("unchecked")
	private void readPresent_CouponList(){
		try {
		      ObjectInputStream poInputStream=new ObjectInputStream(new FileInputStream(Present_coupon_Ser));
		      present_couponList=(ArrayList<Present_Coupon>)poInputStream.readObject();
		      poInputStream.close();
	      } catch (Exception e) {
		       // TODO: handle exception	
//	 	       e.printStackTrace();
	       }	
	}
	
    @SuppressWarnings("unused")
	private void readIdPO(){
 	try{
 	ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(IdPO_ser));
 	idPO=(IdPO)inputStream.readObject();
 	inputStream.close();
    }catch(Exception e){
 		idPO=new IdPO(0);
// 		e.printStackTrace();
 	}
 }
 
   @SuppressWarnings("unused")
private void writeIdPO(){
 	try{
 		ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(IdPO_ser));
 		outputStream.writeObject(idPO);
 		outputStream.close();
 	}catch(IOException e){ 
 		e.printStackTrace();
 	}
     	idPO=null;
   }
 
  //辅助方法,判断礼券是否过期		
 @SuppressWarnings("unused")
private boolean isOverdue(Calendar calSet){
    	Calendar calNow=Calendar.getInstance();
 		        int compare;
		        compare=calNow.compareTo(calSet);
		        if(compare>0){//过期
		        	return true;
		        }
		        else{//未过期
		        	return false;
		        }
   }

//把Calendar日期型转换成String
@SuppressWarnings("unused")
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
@SuppressWarnings("unused")
private long getNextId(){
	presentID+=1;
	return presentID;
}

//为顾客添加打折券
@SuppressWarnings("unused")
private void addCoupon(VIPRank vip,CouponPO couponPO){
	 for(int i=0;i<memberPOList.size();i++){
		 if(memberPOList.get(i).getRank() ==vip){
			 memberPOList.get(i).getCouponList().add(couponPO);
		 }
	 }	//for	 
}

//为顾客添加等价券
@SuppressWarnings("unused")
private void addEquivalent(VIPRank vip,EquivalentPO equivalentPO){
	 for(int i=0;i<memberPOList.size(); i++){
		 if(memberPOList.get(i).getRank() == vip){
			 memberPOList.get(i).getEquivalentList().add(equivalentPO);
		 }
	 }
}

//
	public ResultMessage insert(PO po) throws RemoteException{
		return null;
	}
	public ResultMessage delete(PO po) throws RemoteException{
		return null;
	}
	public ResultMessage update(PO po) throws RemoteException{
		return null;
	}

}
