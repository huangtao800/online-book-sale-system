package start;

import java.awt.EventQueue;

import javax.swing.UIManager;

import org.pushingpixels.substance.api.skin.SubstanceBusinessLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceDustCoffeeLookAndFeel;

import presentationController.start.StartController;

import bussinessLogicService.StartBLService;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;


public class SalesManagerStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					UIManager.setLookAndFeel(new AluminiumLookAndFeel());


					StartBLService startController=new StartController();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
