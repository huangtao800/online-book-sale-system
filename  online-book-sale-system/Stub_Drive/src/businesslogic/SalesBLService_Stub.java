package businesslogic;

import java.util.ArrayList;

import databaseservice.Order;
import databaseservice.ResultMessage;
import businessLogicservice.SalesBLService;

public class SalesBLService_Stub implements SalesBLService{
	ArrayList<String> cartRecords = new ArrayList<String>();
	Order order ;
	double totalPrice ;
	
	public SalesBLService_Stub(String info,Order order,double totalPrice){
		cartRecords.add(info);
		this.order = order;
		this.totalPrice = totalPrice;
	}
	
	public ResultMessage putInCart(String id) {
		if(id != null)
			return ResultMessage.Exist;
		else
			return ResultMessage.NotExist;
	}

	public ArrayList<String> enterCart() {
		return cartRecords;
	}

	public ResultMessage removeFromCart(String id) {
		if(id.equals("00001"))
			return ResultMessage.Success;
		else
			return ResultMessage.Fail;
	}

	public double calculate() {
		return totalPrice;
	}
//打折券——传入的是打折券面值
	public double chooseCoupon(double percent) {
		return totalPrice*percent;
	}
//选择等价券__传入的是等价券面值
	public double chooseVoucher(double voucher) {
		totalPrice -= voucher;
		if(totalPrice < 0)
			totalPrice = 0;
		return totalPrice;
	}

	public Order purchase() {
		return new Order();
	}

	@Override
	public void endSale() {
		// TODO Auto-generated method stub
		
	}

	

}
