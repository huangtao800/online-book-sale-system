package Promotion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PromotionModel implements PromotionModelInterface{
	private static final String PromotionPO_Ser="promotionPO.ser";
	private static final String PresentPOList_Ser="presentPO.ser";
	
	private PromotionPO promotionPO;
	private ArrayList<PresentPO> presentPOList=new ArrayList<PresentPO>();

	public void registerObserver(){
		
	}
	public void removeObserver(){
		
	}
	public void notifyObserver(){
		
	}
	
	//�����ݲ��ȡ�����ֶ���Ϣ
	 public PromotionPO promotionPORead(){
		 //�����л�
		 try {
			 ObjectInputStream poInputStream=new ObjectInputStream(new FileInputStream(PromotionPO_Ser));
			 promotionPO=(PromotionPO)poInputStream.readObject();
			poInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return promotionPO;
	 }
	
	 //�������õĴ����ֶδ浽���ݲ�
	public void promotionPOWrite(PromotionPO proPO){
		//���л�
		promotionPO=proPO;
		try {
			ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(PromotionPO_Ser));
			poOutPutStream.writeObject(promotionPO);
			poOutPutStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		promotionPO=null;
	}
	
	//����ȯ������Ϣ�浵
	@SuppressWarnings("unchecked")
	public void presentPOWrite(PresentPO presentPO){
		//�����л����Ȱ����ݲ�洢��������ȯ��Ϣ��ȡ����(�������presentPO.ser�Ļ�)
		try {
			ObjectInputStream poInputStream=new ObjectInputStream(new FileInputStream(PresentPOList_Ser));
			presentPOList=(ArrayList<PresentPO>)poInputStream.readObject();
			poInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception	
			System.out.println("presentPO.ser"+"��һ�α�������");//bug//Ϊʲôÿ�ζ����Ҳ���presentPO.ser
		}
		
		//���л�
		try{
			presentPOList.add(presentPO);
			ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(PresentPOList_Ser));
			
			poOutPutStream.writeObject(presentPOList);
			poOutPutStream.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		presentPOList.clear();//���ArrayList
		presentPO=null;
	}
	

}
