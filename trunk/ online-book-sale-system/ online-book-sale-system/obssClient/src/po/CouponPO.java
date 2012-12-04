package po;

import java.util.Calendar;
//董仁广
public class CouponPO implements PO {//打折券
    private double rate;//打折率
    private Calendar startDate;
    private Calendar endDate;
    
    public CouponPO(){
  	  
    }
    public CouponPO (int qu,Calendar st,Calendar ed){
  	  this.rate=qu;
  	  this.startDate=st;
  	  this.endDate=ed;
    }
    
    public double getRate(){
  	  return rate;
    }
    public void setRate(double q){
  	  this.rate=q;
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
