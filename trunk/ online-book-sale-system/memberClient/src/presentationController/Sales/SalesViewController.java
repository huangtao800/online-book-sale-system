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
//��ʼ�����ﳵ����	
	public void initCartView(){
		cartView = new CartView(this);
		cartView.refreshCartList();
		cartView.refreshTotalPrice(salesController.getTotalPrice());	
		cartView.setTitle("Cart");
		cartView.setLocation(400, 100);
		cartView.setSize(680, 500);
		cartView.setVisible(true);
	}
//��ʼ�����˽���	
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
//��ʼ������
	public void initOrderView(OrderVO orderVO){
		orderView = new OrderView(orderVO.getProductList());	
		orderView.initText(orderVO.getOrderNum(),orderVO.getMemberID(),orderVO.getDate(),
				orderVO.getOrderState(),orderVO.getTotalPrice(),orderVO.getAddres());
		orderView.setTitle("��������");
		orderView.setLocation(400, 100);
		orderView.setSize(600, 500);
		orderView.setVisible(true);
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
	
	@Override
	public ResultMessage changeLineItemNumber(int index, int number) {
		ResultMessage resultMessage = ResultMessage.FAILED;
		if(number == 0){
			removeFromCart(index);
			return ResultMessage.SUCCEED;
		}
		else{
			resultMessage = salesController.changeLineItemNumber(index, number);
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
	
	public void refreshCartList() {
		cartView.refreshCartList();
		cartView.refreshTotalPrice(salesController.getTotalPrice());	
	}
	
	
	public double getSpecialPrice(int i){
		if(i == -1)
			priceBuffer = salesController.getTotalPrice();
		else 
			priceBuffer = salesController.getSpecialPrice(i);
		return priceBuffer;
	}
	
	public void pay(String address, int index){
		OrderVO orderVO = salesController.pay(priceBuffer,address,index);
		initOrderView(orderVO);
	}
	public void endSale(){
		salesController.endSale();
	}

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
				JOptionPane.showMessageDialog(null, "��" + (i+1)  + "��ͼ���Ѿ��¼�");
				return ResultMessage.FAILED;
			}
			if(save < cartList.get(i).getNumber()){
				JOptionPane.showMessageDialog(null, "��" + (i + 1) + "��ͼ���治�㣬���޸�����");
				return ResultMessage.FAILED;
			}
		}
		return ResultMessage.SUCCEED;
	}



	
}
