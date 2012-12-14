package startAdmin;

import java.awt.EventQueue;

import javax.swing.UIManager;

import presentationController.Admin.AdminStartController;
import presentationController.Admin.AdminStartService;
import presentationController.start.StartController;
import bussinessLogicService.StartBLService;

import com.jtattoo.plaf.mcwin.McWinLookAndFeel;

public class AdminStart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(new McWinLookAndFeel());
					AdminStartService adminStartController = AdminStartController.getInstance();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
