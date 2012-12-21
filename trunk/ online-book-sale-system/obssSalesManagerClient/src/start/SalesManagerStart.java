package start;

import java.awt.EventQueue;

import javax.swing.UIManager;

import org.pushingpixels.substance.api.skin.SubstanceBusinessLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceDustCoffeeLookAndFeel;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;

import presentationController.start.StartController;
import bussinessLogicService.StartBLService;

public class SalesManagerStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
					UIManager.setLookAndFeel(new AluminiumLookAndFeel());
					StartBLService startController=new StartController();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
