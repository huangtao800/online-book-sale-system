package Model;
//董仁广
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.IdPO;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.PresentPO;
import po.ResultMessage;
import po.VIPRank;


import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;


public class SalesManagerModel implements SalesManagerModelInterface{

	private static final String PresentPOList_ser="presentPO.ser";
	private static final String MemberPOList_ser="memberPOList.ser";
	private static final String IdPO_ser="idPO.ser";
	private static final String BookPOList_ser="bookPOList.ser";
	private static final String UncompletedOrderPOList_ser="uncompletedOrderPOList.ser";
    private ArrayList<PresentPO> presentPOList;
	private ArrayList<MemberPO> memberPOList;
	private ArrayList<BookPO> bookPOList;
	private ArrayList<OrderPO> uncompletedOrderPOList;
	
	private IdPO idPO;
	private  long presentID;
	
	public SalesManagerModel(){
		//在构造函数中读取bookPOList，presentPOList，memberPOList等
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<PresentPO> readPresentPOList(){
		//解序列化
		try {
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(PresentPOList_ser));
			presentPOList=(ArrayList<PresentPO>)inputStream.readObject();
			inputStream.close();
			
		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "未发现要被读取的presentPOList文件！");
			e.printStackTrace();
		}
		

		return presentPOList;
	}
	
	//礼券赠送
	public void sendPresent(){
		readPresentPOList();

		boolean hasOverdue=false;//有过期礼券	    		
		
		   if(presentPOList ==null || presentPOList.size() == 0){
	    	        JOptionPane.showMessageDialog(null, "总经理未制定礼券 或 礼券已经赠送完毕！");
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
	    		writePresentPOList();
	    		writeMemberPO();
	    		writeIdPO();     	 
	    		
	    	     if(hasOverdue)
        		   JOptionPane.showMessageDialog(null, "已将过期的礼券删除！");	   
	           }//else
	  
	}
	
//添加图书
	public ResultMessage  addBook(BookPO bookPO){
		if( indexOfBook(bookPO.getISBN()) <0){	
		     bookPOList.add(bookPO);
	       	 writeBookPO();
	       	 return ResultMessage.SUCCEED;
		}else {
			return ResultMessage.FAILED;
		}
	}
	
	//删除图书
	public ResultMessage deleteBook(String isbm){
		int index=indexOfBook(isbm);
		if( index<0){
			return ResultMessage.FAILED;
		}else {
			bookPOList.remove(index);
			writeBookPO();
			return ResultMessage.SUCCEED;
		}
	}
	
	//传入Book的编号，查看此书在ArrayList中的位置
	 public  int indexOfBook(String s){
		 for(int i=0;i<bookPOList.size();i++){
			 if(bookPOList.get(i).getISBN().equals(s)){
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	 //
	 public BookPO getBookPO(String s){
		 int index=indexOfBook(s);
		 return bookPOList.get(index);
	 }

	 //传入顾客ID，获取此顾客对象
	 public MemberPO getMemberPO(String s){
		 MemberPO memberPO;
		memberPO=null;//暂时
		 
		 return memberPO;
	 }
	
	//取得未完成的订单列表
	 public ArrayList<OrderPO> getUncompletedOrderPOList(){
		 //
		 
		 return uncompletedOrderPOList;
	 }
	 
	 //存储更新后的未完成的订单列表
	 public void writeUncompletedOrderPOList(){
		 //序列化
		 try {
				ObjectOutputStream outPutStream=new ObjectOutputStream(new FileOutputStream(UncompletedOrderPOList_ser));
				outPutStream.writeObject(uncompletedOrderPOList);
				outPutStream.close();
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}	 
	 }
	 
	 //修改订单状态后，相应更新存储其顾客的信息
	 public void updateMember_Order(String memberID,OrderState state,long orderNum){
		 for(int i=0;i<memberPOList.size(); i++){
			 if(memberPOList.get(i).getUserID().equals(memberID)){
				    
				    for(int j=0;j<memberPOList.get(i).getOrderList().size(); j++){
				    	  if(memberPOList.get(i).getOrderList().get(j).getOrderNum() == orderNum){
				    		  writeMemberPO();
				    	  }
				    	  break;
				    }//for(j)
				    
			        break;
			 } 
		 }//for(i)
	 }
	 
	 //存储presentPOList	
	private void writePresentPOList(){
		//序列化
		//服务器
		try {
			ObjectOutputStream outPutStream=new ObjectOutputStream(new FileOutputStream(PresentPOList_ser));
			outPutStream.writeObject(presentPOList);
			outPutStream.close();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	private void writeMemberPO(){
		//序列化
		//服务器
		try{
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(MemberPOList_ser));
			outputStream.writeObject(memberPOList);
			outputStream.close();
		}catch(IOException e){
	    	e.printStackTrace();
	    }
//		memberPOList=null;
	}
	
//从数据库读取上一个礼券的ID
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
//		idPO=null;
	}
	
//,可去
	private void readBookPO(){
		
	}
			
	//
	private void writeBookPO(){
		try {
			ObjectOutputStream outputStream=new ObjectOutputStream
					                                                                   (new FileOutputStream(BookPOList_ser));
			outputStream.writeObject(bookPOList);
			outputStream.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
//			bookPOList=null;
		}
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
	
//查找顾客
		
			 
			 
			 
			 
//boss
}
