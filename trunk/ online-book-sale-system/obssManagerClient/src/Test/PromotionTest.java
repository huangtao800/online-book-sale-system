package Test;

import Controller.PromotionController;
import Controller.PromotionControllerInterface;
import Model.PromotionModel;
import ModelService.PromotionModelInterface;

public class PromotionTest {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PromotionModelInterface model=new PromotionModel();
		@SuppressWarnings("unused")
		PromotionControllerInterface controller=new PromotionController(model);
	}

}
