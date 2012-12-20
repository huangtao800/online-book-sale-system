package initData;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import po.AdministratorPO;
import po.BookPO;
import po.GeneralManagerPO;
import po.IdPO;
import po.MemberPO;
import po.Present_Coupon;
import po.Present_Equivalent;
import po.OrderPO;
import po.PromotionPO;
import po.SalesManagerPO;

public class InitMemberData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberPO memberPO=new MemberPO("m1", "huang", "111111","江苏南通");
		
		BookPO bookPO=new BookPO("Java","11111",  "计算机","中国", "hjuang",  "2011", 10, 5);
		BookPO bookPO2=new BookPO("JavaCode","11112",  "计算机","中国", "gr",  "2012", 10, 5);
		ArrayList<BookPO> bookList = new ArrayList<BookPO>();
		bookList.add(bookPO);
		bookList.add(bookPO2);
		
		ArrayList<String> bookTypeList = new ArrayList<String>();
		bookTypeList.add("文学");
		bookTypeList.add("计算机");
		bookTypeList.add("历史");
		bookTypeList.add("经济");
		bookTypeList.add("其他");
		
		memberPO.getFavority().getFavorities().add(bookPO);
		
		MemberPO m2=new MemberPO("m2", "hu", "000000","江苏南通");
		ArrayList<MemberPO> list=new ArrayList<MemberPO>();
		list.add(memberPO);
		list.add(m2);
		
		
		SalesManagerPO salesManagerPO=new SalesManagerPO("s1","zhang","111111");
		ArrayList<SalesManagerPO> saleList=new ArrayList<SalesManagerPO>();
		saleList.add(salesManagerPO);
		
		GeneralManagerPO generalManagerPO=new GeneralManagerPO("g1", "dong", "111111");
		ArrayList<GeneralManagerPO> generalManagerList=new ArrayList<GeneralManagerPO>();
		generalManagerList.add(generalManagerPO);
		
		AdministratorPO administratorPO=new AdministratorPO("a1", "you", "111111");
		ArrayList<AdministratorPO> administratorList=new ArrayList<AdministratorPO>();
		administratorList.add(administratorPO);
		
		
		ArrayList<Present_Equivalent> present_equivalentList=new ArrayList<Present_Equivalent>();
		ArrayList<Present_Coupon> present_couponList=new ArrayList<Present_Coupon>();
		
		PromotionPO promotionPO =new PromotionPO();
		
		IdPO idPO=new IdPO(0);
		
		try {
			FileOutputStream outputStream=new FileOutputStream("member.ser");
			ObjectOutputStream objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(list);
			
			outputStream.close();
			objoutput.close();
			
			
			outputStream=new FileOutputStream("salesManager.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(saleList);
			
			outputStream=new FileOutputStream("generalManager.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(generalManagerList);
			
			outputStream=new FileOutputStream("administrator.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(administratorList);
			
			outputStream=new FileOutputStream("promotionPO.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(promotionPO);
			
			outputStream=new FileOutputStream("present_equivalent.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(present_equivalentList);
			
			outputStream=new FileOutputStream("present_coupon.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(present_couponList);
			
			
			outputStream=new FileOutputStream("book.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(bookList);
			
			outputStream=new FileOutputStream("bookType.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(bookTypeList);
			
			outputStream=new FileOutputStream("OrderList.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(new ArrayList<OrderPO>());
			
			outputStream =new FileOutputStream("idPO.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(idPO);
			
			outputStream=new FileOutputStream("OrderNumber.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject((long)0);
		
			outputStream.close();
			objoutput.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
