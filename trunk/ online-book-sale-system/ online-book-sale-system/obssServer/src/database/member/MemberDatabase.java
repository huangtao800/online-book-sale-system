package database.member;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.PO;
import po.PromotionPO;
import po.ResultMessage;
import po.UserRole;
import database.init.InitDatabase;
import database.promotion.PromotionDatabase;
import databaseService.init.InitDatabaseService;
import databaseService.member.MemberDatabaseService;
import databaseService.promotion.PromotionDatabaseService;

@SuppressWarnings("serial")
public class MemberDatabase extends UnicastRemoteObject implements
		MemberDatabaseService {
	private InitDatabaseService initDatabase;
	private ArrayList<MemberPO> memberPOList;
	private static MemberDatabase instance = null;
	private static PromotionDatabaseService promotionDatabase;

	protected MemberDatabase() throws RemoteException {
		super();
		initDatabase = InitDatabase.getInstance();
		promotionDatabase =PromotionDatabase.getInstance();
		memberPOList = InitDatabase.getMemberPOList();
	}

	public static MemberDatabase getInstance() {
		if (instance == null) {
			try {
				instance = new MemberDatabase();
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
		MemberPO memberPO=(MemberPO) po;
		int index=serachIndexOfMember(memberPO);
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
	
	private int serachIndexOfMember(MemberPO memberPO){
		String id=memberPO.getUserID();
		
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
		MemberPO memberPO = (MemberPO) po;

		return initDatabase.updateUserPO(memberPO, UserRole.Member);
	}


	@Override
	public ResultMessage changeName(String newName, MemberPO memberPO)
			throws RemoteException {
		// TODO Auto-generated method stub

		for (int i = 0; i < memberPOList.size(); i++) {
			if (newName.equals(memberPOList.get(i).getUserName())) {
				return ResultMessage.EXIST;
			}
		}

		memberPO.setUserName(newName);
		return update(memberPO);

	}

	@Override
	public ResultMessage changePassword(String password, MemberPO memberPO)
			throws RemoteException {
		// TODO Auto-generated method stub

		memberPO.setUserPassword(password);

		return update(memberPO);

	}

	@Override
	public ResultMessage changeOrder(String memberID, long orderID,
			OrderState orderState) throws RemoteException {
		// TODO Auto-generated method stub
		int index=searchMemberIndex(memberID);
		
		if(index==-1){
			return ResultMessage.NOTEXIST;
		}
		
		MemberPO memberPO=memberPOList.get(index);
		int orderIndex=searchOrderIndex(memberPO.getOrderList(), orderID);
		
		OrderPO orderPO=memberPO.getOrderList().get(orderIndex);
		orderPO.setOrderState(orderState);
		
		return update(memberPO);
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
	public MemberPO searchMemberPO(String memberID) throws RemoteException {
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
		MemberPO memberPO=searchMemberPO(memberID);
		if(memberPO==null){
			return ResultMessage.NOTEXIST;
		}
		
		PromotionPO po=promotionDatabase.promotionPORead();
		int point=(int)(sum*(po.getExchangeOfScore())/100);
		
		memberPO.setPoints(memberPO.getPoints()+point);
		
		return update(memberPO);
	}

	@Override
	public MemberPO freshMemberPO(String memberID) throws RemoteException {
		// TODO Auto-generated method stub
		memberPOList=InitDatabase.getMemberPOList();
		int index=searchMemberIndex(memberID);
		if(index==-1){
			return null;
		}else {
			return memberPOList.get(index);
		}
	}
}
