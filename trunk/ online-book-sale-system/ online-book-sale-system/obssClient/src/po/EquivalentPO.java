package po;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//���ʹ�
public class EquivalentPO implements PO {//�ȼ�ȯ
	private long id;
      private double deno;//���
      private double min;//ʹ�ø����ĵȼ�ȯ������������
      private Calendar endDate;
      
      public EquivalentPO(){
    	  
      }
      public EquivalentPO(long id,double deno,double min,Calendar ed){
    	  this.id=id;
    	  this.deno=deno;
    	  this.min=min;
    	  this.endDate=ed;
      }
      
      public long getID(){
    	  return id;
      }
      public void setID(long id){
    	  this.id=id;
      }
      
      public double getDeno(){
    	  return deno;
      }
      public void setDeno(double q){
    	  this.deno=q;
      }
      
      public double getMin(){
    	  return min;
      }
      public void setMin(double m){
    	  this.min=m;
      }
      
      public Calendar getEndDate(){
    	  return endDate;
      }
      public void setEndDate(Calendar en){
    	  this.endDate =en;
      }
      
      public String toString(){
    	  return "���:\t"+deno+"\t"+"��Ч��ֹ����:\t"+calendarToString();
      }
      
      private  String calendarToString(){
    	  SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy/MM/dd");
    	  return dateFormat.format(endDate.getTime());
      }
	
}
