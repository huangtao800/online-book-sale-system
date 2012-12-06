package po;

import java.util.Calendar;
//董仁广
public class CouponPO implements PO {//打折券
	
	private String id;//打折券的编号
    private double rate;//打折率
    private Calendar endDate;//截止日期
    
    public CouponPO(){
  	  
    }
    public CouponPO (String id,double rate,Calendar end){
    	this.id=id;
  	    this.rate=rate;
  	    this.endDate=end;
    }
    
    public String getID(){
    	return id;
    }
    public void setID(String id){
    	this.id=id;
    }
    
    public double getRate(){
  	  return rate;
    }
    public void setRate(double rate){
  	  this.rate=rate;
    }
    
    public Calendar getEndDate(){
  	  return endDate;
    }
    public void setEndDate(Calendar en){
  	  this.endDate =en;
    }
	
}
