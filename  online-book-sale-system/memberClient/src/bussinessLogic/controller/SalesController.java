package bussinessLogic.controller;

import java.util.ArrayList;

import bussinessLogic.domain.Sales;
import bussinessLogicService.BookBLService;
import bussinessLogicService.CustomerBLService;
import bussinessLogicService.SalesBLService;

import po.BookPO;
import po.CouponPO;
import po.EquivalentPO;
import po.LineItemPO;
import po.OrderPO;
import po.PO;
import po.ResultMessage;
import presentationController.Sales.OrderVO;

public class SalesController implements SalesBLService {
	private CustomerBLService customerController = CustomerController.getInstance();
	private BookBLService bookController = BookController.getInstance(); 
	private Sales sales;

	private static SalesController uniqueInstance;

	private SalesController() {
		sales = new Sales();
	}

	public static SalesController getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SalesController();
		}
		return uniqueInstance;
	}

	@Override
	public ResultMessage removeFrromCart(int index) {
		ResultMessage result = customerController.removeFromCart(index);
		return result;
	}

	@Override
	public ResultMessage addFavorities(LineItemPO lineItemPO) {
		BookPO bookPO = lineItemPO.getBook();
		return customerController.addFavorities(bookPO);
	}

	@Override
	public double getTotalPrice() {
		ArrayList<LineItemPO> cartList = getCartList();
		double totalPrice = 0;
		for (int i = 0; i < cartList.size(); i++)
			totalPrice += cartList.get(i).getSumPrice();
		return totalPrice;
	}

	@Override
	public ArrayList<String> showSpecial(double commonPrice) {
		ArrayList<CouponPO> couponList = customerController.getCouponList();
		ArrayList<EquivalentPO> equivalentList = customerController
				.getEquivalentList();
		ArrayList<String> voList = new ArrayList<String>();

		for (int i = 0; i < couponList.size(); i++) {
			String s = couponList.get(i).toString();
			voList.add(s);
		}
		for (int i = 0; i < equivalentList.size(); i++) {
			EquivalentPO equivalentPO = equivalentList.get(i);
			if (commonPrice < equivalentPO.getMin())
				break;
			String s = equivalentPO.toString();
			voList.add(s);
		}
		return voList;
	}

	@Override
	public double getSpecialPrice(int i) {// else的情况需要修改
		double specialPrice = 0;
		PO special = getSpecialList().get(i);
		if (special instanceof EquivalentPO) {
			EquivalentPO equivalentPO = (EquivalentPO) special;
			specialPrice = calculateByEquivalent(equivalentPO.getDeno());
		} else if (special instanceof CouponPO) {
			CouponPO couponPO = (CouponPO) special;
			specialPrice = calculateByCupon(couponPO.getRate());
		}
		return specialPrice;
	}

	public OrderVO pay(double price, String address, int index) {
		ArrayList<LineItemPO> cartList = getCartList();
		OrderPO orderPO = sales.creareOrderPO(cartList,
				customerController.getMemberID(), price, address);
		if (index != -1) {
			PO special = getSpecialList().get(index);
			if (special instanceof EquivalentPO) {
				EquivalentPO equivalentPO = (EquivalentPO) special;
				customerController.deleteEquivalent(equivalentPO);
			} else if (special instanceof CouponPO) {
				CouponPO couponPO = (CouponPO) special;
				customerController.deleteCouponPO(couponPO);
			}
		}
		customerController.addOrder(orderPO);
		sales.addOrder(orderPO);
		OrderVO orderVO = new OrderVO(orderPO);
		return orderVO;
	}

	@Override
	public ArrayList<LineItemPO> getCartList() {
		return customerController.getCartList();
	}

	private ArrayList<PO> getSpecialList() {
		ArrayList<PO> specialList = new ArrayList<PO>();
		ArrayList<CouponPO> couponList = customerController.getCouponList();
		ArrayList<EquivalentPO> equivalentList = customerController
				.getEquivalentList();
		for (int i = 0; i < couponList.size(); i++) {
			specialList.add(couponList.get(i));
		}
		for (int i = 0; i < equivalentList.size(); i++) {
			specialList.add(equivalentList.get(i));
		}
		return specialList;
	}

	private double calculateByEquivalent(double deno) {
		double common = getTotalPrice();
		double price = common - deno;
		if (price > 0)
			return price;
		else
			return 0;
	}

	private double calculateByCupon(double rate) {
		double common = getTotalPrice();
		double price = common * rate;
		return price;
	}

	public void endSale() {
		ArrayList<LineItemPO> salesList = getCartList();
		bookController.updateBook(salesList);
		sales.updateSale();
		customerController.clearCart();
		
	}

	@Override
	public String getAddress() {
		return customerController.getAddress();
	}
	
	public int getSaveByISBN(String isbn){
		BookPO bookPO = bookController.findByISBN(isbn);
		return bookPO.getNumOfBook();	
	}

	@Override
	public ResultMessage changeLineItemNumber(int index, int number) {
		return customerController.changeLineItemNumber(index, number);
	}
	

}
