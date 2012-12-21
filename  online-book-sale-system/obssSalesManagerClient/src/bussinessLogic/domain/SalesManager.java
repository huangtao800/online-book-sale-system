package bussinessLogic.domain;

import java.rmi.Naming;
import java.util.ArrayList;

import po.CustomerPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;
import po.UserPO;
import po.UserRole;
import sun.org.mozilla.javascript.internal.ast.TryStatement;

import databaseService.customer.CustomerDatabaseService;
import databaseService.init.InitDatabaseService;
import databaseService.sales.OrderDatabaseService;

public class SalesManager {
	private CustomerDatabaseService memberDatabase;
	private OrderDatabaseService orderDatabase;
	private InitDatabaseService initDatabase;

	public SalesManager(){
		try {
			memberDatabase=(CustomerDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/MemberDatabase");
			orderDatabase=(OrderDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/OrderDatabase");
			initDatabase=(InitDatabaseService) Naming.lookup("rmi://127.0.0.1:5000/InitDatabase");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public CustomerPO getMemberPO(String MemID){
		try {
			return memberDatabase.searchMemberPO(MemID);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}	
	}
	
	public ArrayList<OrderPO> getOrderPOList(){
		try {
			return orderDatabase.getUnfinishedOrder();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
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
	
 	public ResultMessage updateUserPO(UserPO userPO, UserRole role){
   		try{
   		       return initDatabase.updateUserPO(userPO, role);
   		}catch(Exception e){
   			return ResultMessage.FAILED;
   		}
   	}
 	
 	
}