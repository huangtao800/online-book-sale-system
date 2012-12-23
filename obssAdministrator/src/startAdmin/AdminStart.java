package startAdmin;

import java.awt.EventQueue;

import java.awt.EventQueue;
import javax.swing.UIManager;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceAutumnLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceDustCoffeeLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteAquaLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteGlassLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceMagellanLookAndFeel;
import org.pushingpixels.substance.api.skin.SubstanceOfficeSilver2007LookAndFeel;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;

import bussinessLogicService.StartBLService;
import presentation.StartView;
import presentationController.start.StartController;

public class AdminStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    //UIManager.setLookAndFeel(new NoireLookAndFeel());
					//UIManager.setLookAndFeel(new SubstanceDustCoffeeLookAndFeel());
					//UIManager.setLookAndFeel(new SubstanceGraphiteGlassLookAndFeel());
					//UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
					UIManager.setLookAndFeel(new AluminiumLookAndFeel());
					StartBLService startController=new StartController();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}