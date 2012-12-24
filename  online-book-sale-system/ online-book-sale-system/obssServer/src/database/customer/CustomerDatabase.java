package database.customer;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.CustomerPO;
import po.OrderPO;
import po.OrderState;
import po.PO;
import po.PromotionPO;
import po.ResultMessage;
import po.UserRole;
import database.init.InitDatabase;
import database.promotion.PromotionDatabase;
import databaseService.customer.CustomerDatabaseService;
import databaseService.init.InitDatabaseService;
import databaseService.promotion.PromotionDatabaseService;

@SuppressWarnings("serial")
public class CustomerDatabase extends UnicastRemoteObject implements
		CustomerDatabaseService {
	private InitDatabaseService initDatabase;
	private ArrayList<CustomerPO> memberPOList;
	private static CustomerDatabase instance = null;
	private static PromotionDatabaseService promotionDatabase;

	protected CustomerDatabase() throws RemoteException {
		super();
		initDatabase = InitDatabase.getInstance();
		promotionDatabase =PromotionDatabase.getInstance();
		memberPOList = InitDatabase.getMemberPOList();
	}

	public static CustomerDatabase getInstance() {
		if (instance == null) {
			try {
				instance = new CustomerDatabase();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return instance;
	}

	@Override
	public ResultMessage insert(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage delete(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		CustomerPO customerPO=(CustomerPO) po;
		int index=serachIndexOfMember(customerPO);
		if(index==-1){
			return ResultMessage.NOTEXIST;
		}
		else {
			memberPOList.remove(index);
			saveMember();
			return ResultMessage.SUCCEED;
		}
	}
	
	private void saveMember(){
		try {
			FileOutputStream outputStream=new FileOutputStream("member.ser");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
			
			objectOutputStream.writeObject(memberPOList);
			
			outputStream.close();
			objectOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private int serachIndexOfMember(CustomerPO customerPO){
		String id=customerPO.getUserID();
		
		for(int i=0;i<memberPOList.size();i++){
			if(id.equals(memberPOList.get(i).getUserID())){
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public ResultMessage update(PO po) throws RemoteException {
		// TODO Auto-generated method stub
		CustomerPO customerPO = (CustomerPO) po;

		return initDatabase.updateUserPO(customerPO, UserRole.Member);
	}


	@Override
	public ResultMessage changeOrder(String memberID, long orderID,
			OrderState orderState) throws RemoteException {
		// TODO Auto-generated method stub
		int index=searchMemberIndex(memberID);
		
		if(index==-1){
			return ResultMessage.NOTEXIST;
		}
		
		CustomerPO customerPO=memberPOList.get(index);
		int orderIndex=searchOrderIndex(customerPO.getOrderList(), orderID);
		
		OrderPO orderPO=customerPO.getOrderList().get(orderIndex);
		orderPO.setOrderState(orderState);
		
		if(orderState==OrderState.SIGNED){
			return addPoint(memberID, orderPO.getTotalPrice());
		}
		
		return update(customerPO);
	}
	
	private int searchMemberIndex(String memberID){
		for(int i=0;i<memberPOList.size();i++){
			if(memberID.equals(memberPOList.get(i).getUserID())){
				return i;
			}
		}
		
		return -1;
	}
	
	private int searchOrderIndex(ArrayList<OrderPO> orderList,long orderID){
		for(int i=0;i<orderList.size();i++){
			if(orderID==orderList.get(i).getOrderNum()){
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public CustomerPO searchMemberPO(String memberID) throws RemoteException {
		// TODO Auto-generated method stub
		int index=searchMemberIndex(memberID);
		if(index==-1)
			return null;
		return memberPOList.get(index);
	}

	@Override
	public ResultMessage addPoint(String memberID, double sum)
			throws RemoteException {
		// TODO Auto-generated method stub
		CustomerPO customerPO=searchMemberPO(memberID);
		if(customerPO==null){
			return ResultMessage.NOTEXIST;
		}
		
		PromotionPO po=promotionDatabase.promotionPORead();
		int point=(int)(sum*(po.getExchangeOfScore())/100);
		
		customerPO.setPoints(customerPO.getPoints()+point);
		
		return update(customerPO);
	}

	@Override
	public CustomerPO freshMemberPO(String memberID) throws RemoteException {
		// TODO Auto-generated method stub
		memberPOList=InitDatabase.getMemberPOList();
		int index=searchMemberIndex(memberID);
		if(index==-1){
			return null;
		}else {
			return memberPOList.get(index);
		}
	}

	@Override
	public boolean isNameExit(String name) throws RemoteException {
		// TODO Auto-generated method stub
		for(int i=0;i<memberPOList.size();i++){
			if(name.equals(memberPOList.get(i).getUserName())){
				return true;
			}
		}
		return false;
	}
}
