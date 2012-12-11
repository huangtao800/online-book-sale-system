package initData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import po.BookPO;
import po.MemberPO;

public class InitMemberData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberPO memberPO=new MemberPO("1", "huang", "111111","江苏南通");
		
		BookPO bookPO=new BookPO("11111", "Java", "hjuang", "中国", "2011", "计算机", 10, 5);

		memberPO.getFavority().getFavorities().add(bookPO);
		
		MemberPO m2=new MemberPO("2", "hu", "000000","江苏南通");
		ArrayList<MemberPO> list=new ArrayList<MemberPO>();
		list.add(memberPO);
		list.add(m2);
		
		try {
			FileOutputStream outputStream=new FileOutputStream("member.ser");
			ObjectOutputStream objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(list);
			
			outputStream.close();
			objoutput.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
