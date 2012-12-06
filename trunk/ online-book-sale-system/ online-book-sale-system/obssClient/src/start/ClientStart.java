package start;

import java.awt.EventQueue;
import javax.swing.UIManager;
import org.pushingpixels.substance.api.skin.SubstanceDustCoffeeLookAndFeel;

import bussinessLogicService.StartBLService;
import presentation.StartView;
import presentationController.start.StartController;

public class ClientStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new SubstanceDustCoffeeLookAndFeel());
					StartBLService startController=new StartController();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
