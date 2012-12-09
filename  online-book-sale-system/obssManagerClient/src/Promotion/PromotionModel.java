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
	
	//从数据层读取促销手段信息
	 public PromotionPO promotionPORead(){
		 //解序列化
		 try {
			 ObjectInputStream poInputStream=new ObjectInputStream(new FileInputStream(PromotionPO_Ser));
			 promotionPO=(PromotionPO)poInputStream.readObject();
			poInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return promotionPO;
	 }
	
	 //把新设置的促销手段存到数据层
	public void promotionPOWrite(PromotionPO proPO){
		//序列化
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
	
	//把礼券赠送信息存档
	@SuppressWarnings("unchecked")
	public void presentPOWrite(PresentPO presentPO){
		//解序列化，先把数据层存储的已有礼券信息读取进来(如果已有presentPO.ser的话)
		try {
			ObjectInputStream poInputStream=new ObjectInputStream(new FileInputStream(PresentPOList_Ser));
			presentPOList=(ArrayList<PresentPO>)poInputStream.readObject();
			poInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception	
			System.out.println("presentPO.ser"+"第一次被创建！");//bug//为什么每次都是找不到presentPO.ser
		}
		
		//序列化
		try{
			presentPOList.add(presentPO);
			ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(PresentPOList_Ser));
			
			poOutPutStream.writeObject(presentPOList);
			poOutPutStream.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		presentPOList.clear();//清空ArrayList
		presentPO=null;
	}
	

}
