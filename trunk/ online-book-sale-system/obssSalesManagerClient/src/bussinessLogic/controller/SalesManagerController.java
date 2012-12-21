package bussinessLogic.controller;

import java.util.ArrayList;

import po.CustomerPO;
import po.OrderPO;
import po.OrderState;
import po.ResultMessage;
import bussinessLogic.domain.SalesManager;
import bussinessLogicService.MemberBLService;
import bussinessLogicService.SalesManagerService;

public class SalesManagerController implements SalesManagerService {
	private static SalesManagerService salesManagerController;
	private static SalesManager salesManager=new SalesManager();
	
	private SalesManagerController(){
		
	}
	
	public static SalesManagerService getInstance(){
		if(salesManagerController==null){
			salesManagerController=new SalesManagerController();
		}
		return salesManagerController;
	}
	
	public CustomerPO getMemberPO(String MemID){
		return salesManager.getMemberPO(MemID);
	}
	
	public ArrayList<OrderPO> getOrderPOList(){
		return salesManager.getOrderPOList();
	}

	public ResultMessage updateMember_Order(String memberID,OrderState state,long orderNum){
		return salesManager.updateMember_Order(memberID,state,orderNum);
	}
	public ResultMessage updateOrder(OrderPO orderPO){
		return salesManager.updateOrder(orderPO);
	}
}
