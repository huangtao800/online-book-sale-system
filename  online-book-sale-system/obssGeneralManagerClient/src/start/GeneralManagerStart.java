package start;

import java.awt.EventQueue;
import javax.swing.UIManager;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import presentationController.strat.StartController;
import bussinessLogicService.StartBLService;

public class GeneralManagerStart {

	/**
	 * @param args
	 */
	public static void run(){
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
//		EventQueue.invokeLater(new Runnable() {
//			@SuppressWarnings("unused")
//			public void run() {
//				try {
//					UIManager.setLookAndFeel(new AluminiumLookAndFeel());
//					StartBLService startController=new StartController();
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

}
