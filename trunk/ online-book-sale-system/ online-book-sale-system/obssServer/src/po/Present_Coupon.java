package po;

import java.util.Calendar;

public class Present_Coupon {
	private VIPRank rank;
    private double rate;//打折率
    private int amount;
    private Calendar endDate;//截止日期
   
    
    public Present_Coupon(VIPRank rank, double rate, int amount, Calendar endDate){
    	this.rank=rank;
    	this.rate=rate;
    	this.amount=amount;
    	this.endDate=endDate;
    }
    
    public VIPRank getRank(){
    	return rank;
    }
    public void setRank(VIPRank rank){
    	this.rank=rank;
    }
    
    public double getRate(){
    	return rate;
    }
    public void setRate(double rate){
    	this.rate=rate;
    }
    
    public int getAmount(){
    	return amount;
    }
    public void setAmount(int amount){
    	this.amount=amount;
    }
    
    public Calendar getEndDate(){
    	return endDate;
    }
    public void setEndDate(Calendar endDate){
    	this.endDate=endDate;
    }
    
}
