package po;

import java.util.Calendar;
//���ʹ�
public class EquivalentPO implements PO {//�ȼ�ȯ
	private String id;
      private double deno;//���
      private double min;//ʹ�ø����ĵȼ�ȯ������������
      private Calendar endDate;
      
      public EquivalentPO(){
    	  
      }
      public EquivalentPO(String id,double deno,Calendar ed){
    	  this.id=id;
    	  this.deno=deno;
    	  this.endDate=ed;
      }
      
      public String getID(){
    	  return id;
      }
      public void setID(String id){
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
	
}
