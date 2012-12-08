package Promotion;

public class PromotionTest {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PromotionModelInterface model=new PromotionModel();
		PromotionControllerInterface controller=new PromotionController(model);
	}

}
