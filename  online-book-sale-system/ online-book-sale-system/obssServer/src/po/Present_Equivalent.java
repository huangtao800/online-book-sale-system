package po;

import java.util.Calendar;
//��ĳ���ȼ���Ա�� һ�ֵȼ�ȯ
public class Present_Equivalent {
     private VIPRank rank;
	 private double deno;//���
     private double min;//ʹ�ø����ĵȼ�ȯ������������
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
     
}
