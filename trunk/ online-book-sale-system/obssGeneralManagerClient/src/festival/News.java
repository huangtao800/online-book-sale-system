package festival;
//�ڼ���ʱ��ϵͳ�����ܾ�����д�Χ����
import java.util.Calendar;

public  class News {
	//Ԫ����1.15������1.1�������8.15�������5.5��������
	public static String remind(){
		Calendar cal=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		Calendar cal3=Calendar.getInstance();
		cal.add(Calendar.DATE, 3);//��ǰ3������
		cal2.add(Calendar.DATE, 2);//��ǰ2������
		cal3.add(Calendar.DATE, 1);//��ǰ1������
		
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		int month2=cal2.get(Calendar.MONTH)+1;
		int day2=cal2.get(Calendar.DATE);
		int month3=cal3.get(Calendar.MONTH)+1;
		int day3=cal3.get(Calendar.DATE);
		
		
		String news="";
		//��������
		if( (month==1 && day==1) || (month2==1 && day2==1) || (month3==1 && day3==1)   )
			news+= "Ԫ���������٣�\n";
		else if( (month==4&&day==5) || (month2==4&&day2==5) ||(month3==4&&day3==5) )
			news+= "�����ڼ������٣�\n";
		else if( (month==5 && day==1) || (month2==5 && day2==1) || (month3==5 && day3==1))
			news+= "��һ�Ͷ��ڼ������٣�\n";
		else if( (month==10&&day==1) || (month2==10&&day2==1) ||(month3==10&&day3==1))
			news+= "����ڼ������٣�\n";
		else if( (month==12&&day==25) || (month2==12&&day2==25) || (month3==12&&day3==25))
			news+= "ʥ���ڼ������٣�\n";
		
		//ũ������
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
			news+= "���ڼ������٣�\n";
		else if( (month==1 && day==15) ||  (month2==1 && day2==15) ||  (month3==1 && day3==15)  )
			news+= "Ԫ���������٣�\n";
		else if( (month==5 && day==5) || (month2==5 && day2==5) || (month3==5 && day3==5))
			news+= "����ڼ������٣�\n";
		else if( (month==8 && day==15) || (month2==8 && day2==15) || (month3==8 && day3==15) )
			news+= "����ڼ������٣�\n";

		if(!news.equals(""))
		     news+="������ѡ��Ϊ���Ŀͻ����ͽ�����ȯ��";
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
