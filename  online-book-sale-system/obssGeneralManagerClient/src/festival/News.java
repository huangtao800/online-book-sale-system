package festival;
//节假日时，系统提醒总经理进行大范围促销
import java.util.Calendar;

public  class News {
	//元宵节1.15，春节1.1，中秋节8.15，端午节5.5，清明节
	public static String remind(){
		Calendar cal=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		Calendar cal3=Calendar.getInstance();
		cal.add(Calendar.DATE, 3);//提前3天提醒
		cal2.add(Calendar.DATE, 2);//提前2天提醒
		cal3.add(Calendar.DATE, 1);//提前1天提醒
		
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		int month2=cal2.get(Calendar.MONTH)+1;
		int day2=cal2.get(Calendar.DATE);
		int month3=cal3.get(Calendar.MONTH)+1;
		int day3=cal3.get(Calendar.DATE);
		
		
		String news="";
		//公历节日
		if( (month==1 && day==1) || (month2==1 && day2==1) || (month3==1 && day3==1)   )
			news+= "元旦即将来临！\n";
		else if( (month==4&&day==5) || (month2==4&&day2==5) ||(month3==4&&day3==5) )
			news+= "清明节即将来临！\n";
		else if( (month==5 && day==1) || (month2==5 && day2==1) || (month3==5 && day3==1))
			news+= "五一劳动节即将来临！\n";
		else if( (month==10&&day==1) || (month2==10&&day2==1) ||(month3==10&&day3==1))
			news+= "国庆节即将来临！\n";
		else if( (month==12&&day==25) || (month2==12&&day2==25) || (month3==12&&day3==25))
			news+= "圣诞节即将来临！\n";
		
		//农历节日
		Lunar lunar=new Lunar(cal);
		Lunar lunar2=new Lunar(cal2);
		Lunar lunar3=new Lunar(cal3);
		month=lunar.getMonth();
		day=lunar.getDay();
		month2=lunar2.getMonth();
		day2=lunar2.getDay();
		month3=lunar3.getMonth();
		day3=lunar3.getDay();
		if( (month==1&&day==1) || (month2==1&&day2==1) || (month3==1&&day3==1) )
			news+= "春节即将来临！\n";
		else if( (month==1 && day==15) ||  (month2==1 && day2==15) ||  (month3==1 && day3==15)  )
			news+= "元宵即将来临！\n";
		else if( (month==5 && day==5) || (month2==5 && day2==5) || (month3==5 && day3==5))
			news+= "端午节即将来临！\n";
		else if( (month==8 && day==15) || (month2==8 && day2==15) || (month3==8 && day3==15) )
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
