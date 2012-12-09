package presentationController.Sales;

import java.util.ArrayList;

import javax.swing.JFrame;

import po.MemberPO;
import presentation.PayView;
import bussinessLogic.controller.SalesController;
import bussinessLogicService.SalesBLService;

public class SalesViewController {
	private static SalesViewController uniqueInstance;
	private static SalesBLService salesController;
	private PayView payView;
	private double priceBuffer;
	
	private SalesViewController(MemberPO memberPO) {
		salesController = SalesController.getInstance(memberPO);
	}

	public static SalesViewController getInstance(MemberPO memberPO) {
		if(salesController == null)
			uniqueInstance = new SalesViewController(memberPO);
		return uniqueInstance;
	}
	
	public void initPayFrame(){
		payView = new PayView(this);
		payView.setCommonPrice(salesController.calucalte());
		ArrayList<String> specialList = salesController.showSpecial();	
		payView.showSpecial(specialList);
		
		payView.setTitle("Pay");
		payView.setLocation(400, 100);
		payView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		payView.setSize(500, 450);
		payView.setVisible(true);
	}
	
	public double getSpecialPrice(int i){
		if(i == -1)
			priceBuffer = salesController.calucalte();
		else 
			priceBuffer = salesController.getSpecialPrice(i);
		return priceBuffer;
	}
	
	public void endSale(){
		salesController.purchase(priceBuffer);
	}
	
	

}
