package festival;
//节假日时，系统提醒总经理进行大范围促销
import java.util.Calendar;

public  class News {
	//元宵节1.15，春节1.1，中秋节8.15，端午节5.5，清明节
	public static String remind(){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, 3);//提前三天提醒
		
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		String news="";
		//公历节日
		if(month==1 && day==1)
			news+= "元旦即将来临！\n";
		else if(month==4&&day==5)
			news+= "清明节即将来临！\n";
		else if(month==5 && day==1)
			news+= "五一劳动节即将来临！\n";
		else if(month==10&&day==1)
			news+= "国庆节即将来临！\n";
		else if(month==12&&day==25)
			news+= "圣诞节即将来临！\n";
		
		//农历节日
		Lunar lunar=new Lunar(cal);
		month=lunar.getMonth();
		day=lunar.getDay();
		if(month==1&&day==1)
			news+= "春节即将来临！\n";
		else if(month==1 && day==15)
			news+= "元宵即将来临！\n";
		else if(month==5 && day==5)
			news+= "端午节即将来临！\n";
		else if(month==8 && day==15)
			news+= "中秋节即将来临！\n";
		
		
		if(!news.equals(""))
		     news+="您可以选择为您的客户赠送节日礼券！";
		else news="No News!";
		
		return news;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(remind());
	}

}
