package Test;

import presentController.mainView.MainViewController;
import presentController.mainView.MainViewControllerInterface;
import Model.SalesManagerModel;
import Model.SalesManagerModelInterface;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesManagerModelInterface model= new SalesManagerModel();
		@SuppressWarnings("unused")
		MainViewControllerInterface mainViewController=new MainViewController(model);

	}

}
