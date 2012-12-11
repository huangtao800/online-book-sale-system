package po;

import java.text.SimpleDateFormat;
import java.util.Calendar;
//���ʹ�
public class CouponPO implements PO {//����ȯ
	
	private long id;//����ȯ�ı��
    private double rate;//������
    private Calendar endDate;//��ֹ����
    
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
  	  return "������:\t"+rate+"\t��Ч��ֹ����:\t"+calendarToString();
    }
    
    private  String calendarToString(){
    	  SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy/MM/dd");
    	  return dateFormat.format(endDate.getTime());
      }
	
}
