package test;

import po.GeneralManagerPO;
import po.PromotionPO;
import po.ResultMessage;
import presentationController.GeneralManagerView.GeneralManagerViewController;
import presentationController.GeneralManagerView.GeneralManagerViewControllerInterface;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralManagerPO generalManagerPO=new GeneralManagerPO("28", "drg", "881");
		GeneralManagerViewControllerInterface promotionViewControllerInterface 
		=new GeneralManagerViewController(generalManagerPO);
			


	}

}
