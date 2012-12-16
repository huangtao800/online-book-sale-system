package po;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//董仁广
public class CouponPO implements PO {//打折券
	
	private long id;//打折券的编号
    private double rate;//打折率
    private Calendar endDate;//截止日期
    
    public CouponPO(){
  	  
    }
    public CouponPO (long id,double rate,Calendar end){
    	this.id=id;
  	    this.rate=rate;
  	    this.endDate=end;
    }
    
    public long getID(){
    	return id;
    }
    public void setID(long id){
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
    
    public String toString(){
  	  return "打折率:\t"+rate+"\t有效截止日期:\t"+calendarToString();
    }
    
    private  String calendarToString(){
    	  SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy/MM/dd");
    	  return dateFormat.format(endDate.getTime());
      }
	
}
