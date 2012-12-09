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
		MemberPO memberPO=new MemberPO("1", "huang", "111111");
		
		BookPO bookPO=new BookPO();
		bookPO.setBookName("Java");
		bookPO.setISBN("11111");
		bookPO.setAuthor("hjuang");
		bookPO.setPress("ÖÐ¹ú");
		bookPO.setPublishDate("2011");
		memberPO.getFavority().getFavorities().add(bookPO);
		
		MemberPO m2=new MemberPO("2", "hu", "000000");
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
