package Model;
//���ʹ�
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
		//�ڹ��캯���ж�ȡbookPOList��presentPOList��memberPOList��
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<PresentPO> readPresentPOList(){
		//�����л�
		try {
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(PresentPOList_ser));
			presentPOList=(ArrayList<PresentPO>)inputStream.readObject();
			inputStream.close();
			
		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "δ����Ҫ����ȡ��presentPOList�ļ���");
			e.printStackTrace();
		}
		

		return presentPOList;
	}
	
	//��ȯ����
	public void sendPresent(){
		readPresentPOList();

		boolean hasOverdue=false;//�й�����ȯ	    		
		
		   if(presentPOList ==null || presentPOList.size() == 0){
	    	        JOptionPane.showMessageDialog(null, "�ܾ���δ�ƶ���ȯ �� ��ȯ�Ѿ�������ϣ�");
	            }
	           else{
	        	   readIdPO();
	        	   presentID=idPO.getID();
	        	
	        	   PresentPO presentPO;
	        	   String equivalent[][];       //10*4��ÿ��ֱ��ʾ:�ȼ�ȯ��ȣ���������Ч��ֹ���ڣ��������  
	        	   
	        	   for(int i=0;i<presentPOList.size();i++){
	        		   presentPO=presentPOList.get(i);
	        		   equivalent=presentPO.getEquivalent();
	        		  //�ȼ�ȯ
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
	        		  //����ȯ
	        		   if( (presentPO.getDiscount() - 0.0) <= 0.000001  ){//������
	        			  
	        		   }else{
	        		           if( ! isOverdue(presentPO.getEndDateOfCoupon()) ){//
	        		        	   for(int k=0;k<presentPO.getAmountOfCoupon(); k++){
	        		        	         CouponPO couponPO=new CouponPO(getNextId(), presentPO.getDiscount(),
	        		        			                                                   stringToCalendar(presentPO.getEndDateOfCoupon()) );
	        			                  addCoupon(presentPO.getVipLevel(),couponPO);
	        		        	   }//for(k)
	        		            }//if
	        		           else{  
	        		        	 hasOverdue=true;//����
	        		           }
	        		   }
	        	   }//for(i)
	        	  
	        	idPO.setID(presentID);
	    		presentPOList.clear();
	    		writePresentPOList();
	    		writeMemberPO();
	    		writeIdPO();     	 
	    		
	    	     if(hasOverdue)
        		   JOptionPane.showMessageDialog(null, "�ѽ����ڵ���ȯɾ����");	   
	           }//else
	  
	}
	
//���ͼ��
	public ResultMessage  addBook(BookPO bookPO){
		if( indexOfBook(bookPO.getISBN()) <0){	
		     bookPOList.add(bookPO);
	       	 writeBookPO();
	       	 return ResultMessage.SUCCEED;
		}else {
			return ResultMessage.FAILED;
		}
	}
	
	//ɾ��ͼ��
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
	
	//����Book�ı�ţ��鿴������ArrayList�е�λ��
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

	 //����˿�ID����ȡ�˹˿Ͷ���
	 public MemberPO getMemberPO(String s){
		 MemberPO memberPO;
		memberPO=null;//��ʱ
		 
		 return memberPO;
	 }
	
	//ȡ��δ��ɵĶ����б�
	 public ArrayList<OrderPO> getUncompletedOrderPOList(){
		 //
		 
		 return uncompletedOrderPOList;
	 }
	 
	 //�洢���º��δ��ɵĶ����б�
	 public void writeUncompletedOrderPOList(){
		 //���л�
		 try {
				ObjectOutputStream outPutStream=new ObjectOutputStream(new FileOutputStream(UncompletedOrderPOList_ser));
				outPutStream.writeObject(uncompletedOrderPOList);
				outPutStream.close();
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}	 
	 }
	 
	 //�޸Ķ���״̬����Ӧ���´洢��˿͵���Ϣ
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
	 
	 //�洢presentPOList	
	private void writePresentPOList(){
		//���л�
		//������
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
		//���л�
		//������
		try{
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(MemberPOList_ser));
			outputStream.writeObject(memberPOList);
			outputStream.close();
		}catch(IOException e){
	    	e.printStackTrace();
	    }
//		memberPOList=null;
	}
	
//�����ݿ��ȡ��һ����ȯ��ID
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
	
//,��ȥ
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
	//��������,�ж���ȯ�Ƿ����		
			 private boolean isOverdue(String s){
			    	Calendar calNow=Calendar.getInstance();
			    	Calendar   calSet=Calendar.getInstance();
			    	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
			    	try{
			    		Date date=dateFormat.parse(s);
			    		calSet.setTime(date);
		   		        int compare;
		   		        compare=calNow.compareTo(calSet);
		   		        if(compare>0){//����
		   		        	return true;
		   		        }
		   		        else{//δ����
		   		        	return false;
		   		        }
		   		       
			    	}catch(Exception e){
			    		e.printStackTrace();
			    		return true;
			    	}   	
			    }

//��Calendar������ת����String
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
            
//������һ�޶����Ż�ȯid
            private long getNextId(){
            	return (presentID+1);
            }
			 
//Ϊ�˿���Ӵ���ȯ
			 private void addCoupon(VIPRank vip,CouponPO couponPO){
				 for(int i=0;i<memberPOList.size();i++){
					 if(memberPOList.get(i).getRank() ==vip){
						 memberPOList.get(i).getCouponList().add(couponPO);
					 }
				 }	//for	 
			 }
			 
//Ϊ�˿���ӵȼ�ȯ
			 private void addEquivalent(VIPRank vip,EquivalentPO equivalentPO){
				 for(int i=0;i<memberPOList.size(); i++){
					 if(memberPOList.get(i).getRank() == vip){
						 memberPOList.get(i).getEquivalentList().add(equivalentPO);
					 }
				 }
			 }
	
//���ҹ˿�
		
			 
			 
			 
			 
//boss
}
