package bussinessLogic.domain;

import java.rmi.Naming;
import java.util.ArrayList;

import po.MemberPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;
import sun.org.mozilla.javascript.internal.ast.TryStatement;

import databaseService.member.MemberDatabaseService;
import databaseService.sales.OrderDatabaseService;

public class SalesManager {
	private MemberDatabaseService memberDatabase;
	private OrderDatabaseService orderDatabase;

	public SalesManager(){
		try {
			memberDatabase=(MemberDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/MemberDatabase");
			orderDatabase=(OrderDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/OrderDatabase");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public MemberPO getMemberPO(String MemID){
		try {
			return memberDatabase.searchMemberPO(MemID);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}	
	}
	
	public ArrayList<OrderPO> getOrderPOList(){
		try {
			return orderDatabase.getUnfinishedOrder();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public ResultMessage updateMember_Order(String memberID,OrderState state,long orderNum){
		try {
			return memberDatabase.changeOrder(memberID, orderNum, state);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	public ResultMessage updateOrder(OrderPO orderPO){
	      try{
		      return   orderDatabase.update(orderPO);
	      }catch(Exception e){
	    	  e.printStackTrace();
	    	  return ResultMessage.FAILED;
	      }
}
}