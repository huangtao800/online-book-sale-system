package festival;
//�ڼ���ʱ��ϵͳ�����ܾ�����д�Χ����
import java.util.Calendar;

public  class News {
	//Ԫ����1.15������1.1�������8.15�������5.5��������
	public static String remind(){
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, 3);//��ǰ��������
		
		int month=cal.get(Calendar.MONTH)+1;
		int day=cal.get(Calendar.DATE);
		String news="";
		//��������
		if(month==1 && day==1)
			news+= "Ԫ���������٣�\n";
		else if(month==4&&day==5)
			news+= "�����ڼ������٣�\n";
		else if(month==5 && day==1)
			news+= "��һ�Ͷ��ڼ������٣�\n";
		else if(month==10&&day==1)
			news+= "����ڼ������٣�\n";
		else if(month==12&&day==25)
			news+= "ʥ���ڼ������٣�\n";
		
		//ũ������
		Lunar lunar=new Lunar(cal);
		month=lunar.getMonth();
		day=lunar.getDay();
		if(month==1&&day==1)
			news+= "���ڼ������٣�\n";
		else if(month==1 && day==15)
			news+= "Ԫ���������٣�\n";
		else if(month==5 && day==5)
			news+= "����ڼ������٣�\n";
		else if(month==8 && day==15)
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
