package po;

import java.util.Calendar;
//董仁广
public class EquivalentPO implements PO {//等价券
      private double deno;//面额
      private Calendar startDate;
      private Calendar endDate;
      
      public EquivalentPO(){
    	  
      }
      public EquivalentPO(int qu,Calendar st,Calendar ed){
    	  this.deno=qu;
    	  this.startDate=st;
    	  this.endDate=ed;
      }
      
      public double getQuantity(){
    	  return deno;
      }
      public void setQuantity(double q){
    	  this.deno=q;
      }
      
      public Calendar getStartDate(){
    	  return startDate;
      }
      public void setStartDate(Calendar st){
    	  this.startDate=st;
      }
      
      public Calendar getEndDate(){
    	  return endDate;
      }
      public void setEndDate(Calendar en){
    	  this.endDate =en;
      }
	
}
