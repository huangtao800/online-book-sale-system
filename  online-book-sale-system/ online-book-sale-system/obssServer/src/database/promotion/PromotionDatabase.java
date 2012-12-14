package database.promotion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import po.PO;
import po.PromotionPO;
import po.ResultMessage;
import databaseService.promotion.PromotionDatabaseService;

public class PromotionDatabase extends UnicastRemoteObject implements PromotionDatabaseService{
	private static final String PromotionPO_Ser="promotionPO.ser";
	private static PromotionDatabase promotionDatabase;
	
	private PromotionPO promotionPO;
	
	protected PromotionDatabase() throws RemoteException{
		super();
		promotionPORead();
	}

	public static PromotionDatabase getInstance(){
		if(promotionDatabase==null){
			try {
				promotionDatabase=new PromotionDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return promotionDatabase;
	}

	//从数据层读取促销手段信息
		 public PromotionPO promotionPORead() throws RemoteException{
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
	
		public ResultMessage promotionPOWrite(PromotionPO proPO) throws RemoteException{
				//序列化
				promotionPO=proPO;
				try {
					ObjectOutputStream poOutPutStream=new ObjectOutputStream(new FileOutputStream(PromotionPO_Ser));
					poOutPutStream.writeObject(promotionPO);
					poOutPutStream.close();
					return ResultMessage.SUCCEED;
				} catch (IOException e) {
					e.printStackTrace();
					return ResultMessage.FAILED;
				}
			}
		
	    
		public ResultMessage insert(PO po) throws RemoteException{
			return null;
		}
		public ResultMessage delete(PO po) throws RemoteException{
			return null;
		}
		public ResultMessage update(PO po) throws RemoteException{
			return null;
		}
}
