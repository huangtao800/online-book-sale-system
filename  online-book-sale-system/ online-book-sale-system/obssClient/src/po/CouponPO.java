package po;

import java.util.Calendar;
//���ʹ�
public class CouponPO implements PO {//����ȯ
	
	private String id;//����ȯ�ı��
    private double rate;//������
    private Calendar endDate;//��ֹ����
    
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
