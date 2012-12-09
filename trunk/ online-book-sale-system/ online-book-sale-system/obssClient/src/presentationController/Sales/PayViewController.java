package presentationController.Sales;

import java.util.ArrayList;

import javax.swing.JFrame;

import po.MemberPO;
import presentation.PayView;
import bussinessLogic.controller.SalesController;
import bussinessLogicService.SalesBLService;

public class PayViewController {
	private static PayViewController uniqueInstance;
	private static SalesBLService salesController;
	private PayView payView;
	
	private PayViewController(MemberPO memberPO) {
		salesController = SalesController.getInstance(memberPO);
	}

	public static PayViewController getInstance(MemberPO memberPO) {
		if(salesController == null)
			uniqueInstance = new PayViewController(memberPO);
		return uniqueInstance;
	}
	
	public void initPayFrame(){
		payView = new PayView(this);
		double commonPrice = salesController.calucalte();
		ArrayList<String> specialList = salesController.showSpecial();
		
		payView.showSpecial(specialList);
		payView.setTitle("Pay");
		payView.setLocation(400, 100);
		payView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		payView.setSize(500, 450);
		payView.setVisible(true);
		
		//初始化pay的界面
	}
	public double getSpecialPrice(int i){
		double specialPrice = salesController.getSpecialPrice(i);
		return specialPrice;
		
	}
	
	

}
