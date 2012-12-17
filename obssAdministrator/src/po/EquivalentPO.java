package po;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//董仁广
public class EquivalentPO implements PO {//等价券
	private long id;
      private double deno;//面额
      private double min;//使用该面额的等价券所需的最低消费
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
    	  return "面额:\t"+deno+"\t"+"有效截止日期:\t"+calendarToString();
      }
      
      private  String calendarToString(){
    	  SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy/MM/dd");
    	  return dateFormat.format(endDate.getTime());
      }
	
}
