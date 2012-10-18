package bussinessLogic.controller;
//张雅婷
import java.util.ArrayList;

import po.OrderPO;
import po.ResultMessage;

import bussinessLogicService.SalesBLService;



public class SalesBLService_Stub implements SalesBLService{
	ArrayList<String> cartRecords = new ArrayList<String>();
	OrderPO order ;
	double totalPrice ;
	
	public SalesBLService_Stub(String info,OrderPO order,double totalPrice){
		cartRecords.add(info);
		this.order = order;
		this.totalPrice = totalPrice;
	}
	
	public ResultMessage putInCart(String id) {
		if(id != null)
			return ResultMessage.EXIST;
		else
			return ResultMessage.NOTEXIST;
	}

	public ArrayList<String> enterCart() {
		return cartRecords;
	}

	public ResultMessage removeFromCart(String id) {
		if(id.equals("00001"))
			return ResultMessage.SUCCEED;
		else
			return ResultMessage.FAILED;
	}

	public double calculate() {
		return totalPrice;
	}
//打折券——传入的是打折券面值
	public double chooseCoupon(double percent) {
		return totalPrice*percent;
	}
//选择等价券__传入的是等价券面值
	public double chooseEquivalent(double equivalent) {
		totalPrice -= equivalent;
		if(totalPrice < 0)
			totalPrice = 0;
		return totalPrice;
	}

	public OrderPO purchase() {
		return new OrderPO();
	}

	@Override
	public void endSale() {
		// TODO Auto-generated method stub
		
	}

	

}
