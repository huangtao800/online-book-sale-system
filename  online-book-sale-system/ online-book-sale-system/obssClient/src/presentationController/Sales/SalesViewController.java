package presentationController.Sales;

import java.util.ArrayList;

import po.LineItemPO;
import po.ResultMessage;
import presentation.CartView;
import presentation.OrderView;
import presentation.PayView;
import bussinessLogic.controller.SalesController;
import bussinessLogicService.SalesBLService;

public class SalesViewController implements SalesViewService{
	private static SalesViewController uniqueInstance;
	private static SalesBLService salesController;
	private PayView payView;
	private CartView cartView;
	private OrderView orderView;
	private double priceBuffer;
	
	private SalesViewController() {
		salesController = SalesController.getInstance();
	}

	public static SalesViewController getInstance() {
		if(salesController == null)
			uniqueInstance = new SalesViewController();
		return uniqueInstance;
	}
//初始化购物车界面	
	public void initCartView(){
		cartView = new CartView(this);
		cartView.refreshCartList();
		cartView.refreshTotalPrice(salesController.getTotalPrice());	
		cartView.setTitle("Cart");
		cartView.setLocation(400, 100);
		cartView.setSize(680, 500);
		cartView.setVisible(true);
	}
//初始化结账界面	
	public void initPayFrame(){
		payView = new PayView(this);
		double commonPrice = salesController.getTotalPrice();
		payView.setCommonPrice(commonPrice);
		ArrayList<String> specialList = salesController.showSpecial(commonPrice);
		payView.showSpecial(specialList);
		String address = salesController.getAddress();
		payView.setAddress(address);
		payView.setTitle("Pay");
		payView.setLocation(400, 100);
		payView.setSize(500, 450);
		payView.setVisible(true);
	}
//初始化订单
	public void initOrderView(OrderVO orderVO){
		orderView = new OrderView(orderVO.getProductList());	
		orderView.initText(orderVO.getOrderNum(),orderVO.getMemberID(),orderVO.getDate(),
				orderVO.getOrderState(),orderVO.getTotalPrice(),orderVO.getAddres());
		orderView.setTitle("订单详情");
		orderView.setLocation(400, 100);
		orderView.setSize(600, 500);
		orderView.setVisible(true);
	}
	
	public ResultMessage putInCart(String isbn, int number){
		ResultMessage resultMessage;
		if((isbn != null) && (number != 0)){
			resultMessage = salesController.putInCart(isbn, number);
			cartView.refreshCartList();
			cartView.refreshTotalPrice(salesController.getTotalPrice());
			return resultMessage;
		}
		return ResultMessage.FAILED;	
	}

	public ResultMessage removeFromCart(int index) {
		ResultMessage resultMessage = ResultMessage.FAILED;
		if(index == -1)
			return resultMessage;
		LineItemPO lineItemPO = salesController.getCartList().get(index);
		if(lineItemPO == null)
			return resultMessage;
		else{
			resultMessage = salesController.removeFrromCart(index);
			cartView.refreshCartList();
			cartView.refreshTotalPrice(salesController.getTotalPrice());
		}
		return resultMessage;
	}
	
	public ResultMessage addFavorities(int index) {
		ResultMessage resultMessage = ResultMessage.FAILED;
		if(index == -1)
			return resultMessage;
		LineItemPO lineItemPO = salesController.getCartList().get(index);
		if(lineItemPO == null)
			return resultMessage;
		else{
			resultMessage = salesController.addFavorities(lineItemPO);
			cartView.refreshCartList();
			cartView.refreshTotalPrice(salesController.getTotalPrice());
		}
		return resultMessage;
	}
	
	
	public double getSpecialPrice(int i){
		if(i == -1)
			priceBuffer = salesController.getTotalPrice();
		else 
			priceBuffer = salesController.getSpecialPrice(i);
		return priceBuffer;
	}
	
	public void pay(String address){
		OrderVO orderVO = salesController.pay(priceBuffer,address);
		initOrderView(orderVO);
	}
	public void endSale(){
		salesController.endSale();
	}

	public ArrayList<LineItemPO> getCartList() {
		return salesController.getCartList();
	}
	
}
