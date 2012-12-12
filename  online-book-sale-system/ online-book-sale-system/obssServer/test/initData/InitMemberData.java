package initData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import po.AdministratorPO;
import po.BookPO;
import po.GeneralManagerPO;
import po.MemberPO;
import po.PresentPO;
import po.PromotionPO;
import po.SalesManagerPO;

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
		
		
		SalesManagerPO salesManagerPO=new SalesManagerPO("1","zhang","111111");
		ArrayList<SalesManagerPO> saleList=new ArrayList<SalesManagerPO>();
		saleList.add(salesManagerPO);
		
		GeneralManagerPO generalManagerPO=new GeneralManagerPO("1", "dong", "111111");
		ArrayList<GeneralManagerPO> generalManagerList=new ArrayList<GeneralManagerPO>();
		generalManagerList.add(generalManagerPO);
		
		AdministratorPO administratorPO=new AdministratorPO("1", "you", "111111");
		ArrayList<AdministratorPO> administratorList=new ArrayList<AdministratorPO>();
		administratorList.add(administratorPO);
		
		
		ArrayList<PresentPO> presentList=new ArrayList<PresentPO>();
		
		PromotionPO promotionPO =new PromotionPO();
		
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
			
			outputStream=new FileOutputStream("adminstrator.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(administratorList);
			
			outputStream=new FileOutputStream("promotionPO.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(promotionPO);
			
			outputStream=new FileOutputStream("presentPO.ser");
			objoutput=new ObjectOutputStream(outputStream);
			
			objoutput.writeObject(presentList);
			
			outputStream.close();
			objoutput.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
