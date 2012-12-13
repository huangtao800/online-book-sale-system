package test;

import po.GeneralManagerPO;
import po.PresentPO;
import po.PromotionPO;
import po.ResultMessage;
import presentationController.PromotionView.PromotionViewController;
import presentationController.PromotionView.PromotionViewControllerInterface;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralManagerPO generalManagerPO=new GeneralManagerPO("28", "drg", "881");
		PromotionViewControllerInterface promotionViewControllerInterface 
		=new PromotionViewController(generalManagerPO);
			


	}

}
