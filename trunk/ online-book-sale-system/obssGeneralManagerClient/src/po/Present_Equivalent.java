package po;

import java.util.Calendar;
//给某个等级会员的 一种等价券
public class Present_Equivalent implements PO {
     private VIPRank rank;
	 private double deno;//面额
     private double min;//使用该面额的等价券所需的最低消费
     private int amount;
     private Calendar endDate;
    

     
     public Present_Equivalent(VIPRank rank, double deno, double min, int amount, Calendar endDate ){
    	 this.rank=rank;
    	 this.deno=deno;
    	 this.min=min;
    	 this.amount=amount;
    	 this.endDate=endDate;
    	
     }
     
     public VIPRank getRank(){
    	 return rank;
     }
     public void setRank(VIPRank rank){
    	 this.rank=rank;
     }
     
     public double getDeno(){
    	 return deno;
     }
     public void setDeno(double deno){
    	 this.deno=deno;
     }
     
     public double getMin(){
    	 return min;
     }
     public void setMin(double min)
     {
    	 this.min=min;
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
     
     public  String getVIPRank_String(){
     	if(rank==VIPRank.VIP1){
     		return "VIP1";
     	}
     	else if(rank==VIPRank.VIP2){
     		return "VIP2";
     	}
     	else if(rank==VIPRank.VIP3){
     		return "VIP3";
     	}
     	else if(rank==VIPRank.VIP4){
     		return "VIP4";
     	}
     	else 
     		return "VIP5";	
     }
     
}
