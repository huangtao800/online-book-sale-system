package po;

import java.util.Calendar;
//董仁广
public class EquivalentPO implements PO {//等价券
	private String id;
      private double deno;//面额
      private double min;//使用该面额的等价券所需的最低消费
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
