package bussinessLogic.controller;

//������
import java.util.ArrayList;

import po.LineItemPO;
import po.OrderPO;
import po.ResultMessage;

import bussinessLogicService.SalesBLService;

public class SalesBLService_Stub implements SalesBLService {
	ArrayList<LineItemPO> cartRecords = new ArrayList<LineItemPO>();
	OrderPO order;
	double totalPrice;

	public SalesBLService_Stub(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ResultMessage putInCart(LineItemPO lineItem) {
		if (lineItem != null)
			return ResultMessage.EXIST;
		else
			return ResultMessage.NOTEXIST;
	}

	public ArrayList<LineItemPO> enterCart() {
		return cartRecords;
	}

	public ResultMessage removeFromCart(String id) {
		if (id.equals("00001"))
			return ResultMessage.SUCCEED;
		else
			return ResultMessage.FAILED;
	}

	public double calculate() {
		return totalPrice;
	}

	// ����ȯ����������Ǵ���ȯ��ֵ
	public double chooseCoupon(double percent) {
		return totalPrice * percent;
	}

	// ѡ��ȼ�ȯ__������ǵȼ�ȯ��ֵ
	public double chooseEquivalent(double equivalent) {
		totalPrice -= equivalent;
		if (totalPrice < 0)
			totalPrice = 0;
		return totalPrice;
	}

	public OrderPO purchase() {
		order = new OrderPO(cartRecords);
		return order;
	}

	@Override
	public void endSale() {
		// TODO Auto-generated method stub

	}

}
