package presentationController.Sales;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	public ResultMessage initPayFrame(){
		if(checkSave() == ResultMessage.FAILED)
			return ResultMessage.FAILED;
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
		return ResultMessage.SUCCEED;
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

//In CartView
	@Override
	public ResultMessage removeFromCart(int index) {
		ResultMessage resultMessage = ResultMessage.FAILED;
		LineItemPO lineItemPO = salesController.getCartList().get(index);
		if(lineItemPO == null)
			return resultMessage;	
		resultMessage = salesController.removeFrromCart(index);
		refreshCartList();
		return resultMessage;
	}
	
	@Override
	public ResultMessage changeLineItemNumber(int index, int number) {
		ResultMessage resultMessage = ResultMessage.FAILED;
		if(number == 0)
			return removeFromCart(index);
		else{
			resultMessage = salesController.changeLineItemNumber(index, number);
			refreshCartList();		
		}
		return resultMessage;
	}
	
	@Override
	public ResultMessage addFavorities(int index) {
		ResultMessage resultMessage = ResultMessage.FAILED;
		LineItemPO lineItemPO = salesController.getCartList().get(index);
		if(lineItemPO == null)
			return resultMessage;
		resultMessage = salesController.addFavorities(lineItemPO);
		refreshCartList();
		return resultMessage;
	}
	
	@Override
	public void refreshCartList() {
		cartView.refreshCartList();
		cartView.refreshTotalPrice(salesController.getTotalPrice());	
	}
	
//In payView
	@Override
	public double getSpecialPrice(int i){
		if(i == -1)
			priceBuffer = salesController.getTotalPrice();
		else 
			priceBuffer = salesController.getSpecialPrice(i);
		return priceBuffer;
	}
	
	public void pay(String address, int index){
		OrderVO orderVO = salesController.pay(priceBuffer,address,index);
		salesController.endSale();
		initOrderView(orderVO);
	}

//share
	public ArrayList<LineItemPO> getCartList() {
		return salesController.getCartList();
	}
	
	private ResultMessage checkSave() {
		ArrayList<LineItemPO> cartList = getCartList();
		for(int i = 0; i < cartList.size(); i ++){
			LineItemPO lineItemPO = cartList.get(i);
			String isbn = lineItemPO.getBook().getISBN();
			int save = salesController.getSaveByISBN(isbn);
			if(save == 0){
				JOptionPane.showMessageDialog(null, "第" + (i+1)  + "行图书已经下架");
				return ResultMessage.FAILED;
			}
			if(save < cartList.get(i).getNumber()){
				JOptionPane.showMessageDialog(null, "第" + (i + 1) + "行图书库存不足，请修改数量");
				return ResultMessage.FAILED;
			}
		}
		return ResultMessage.SUCCEED;
	}

}
