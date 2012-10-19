package po;

import java.util.Calendar;

public class EquivalentPO implements PO {//µ»º€»Ø
      private int quantity;
      private Calendar startDate;
      private Calendar endDate;
      
      public EquivalentPO(){
    	  
      }
      public EquivalentPO(int qu,Calendar st,Calendar ed){
    	  this.quantity=qu;
    	  this.startDate=st;
    	  this.endDate=ed;
      }
      
      public int getQuantity(){
    	  return quantity;
      }
      public void setQuantity(int q){
    	  this.quantity=q;
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
