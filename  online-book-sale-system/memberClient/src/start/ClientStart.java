package start;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;




import bussinessLogicService.StartBLService;

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
					
					UIManager.setLookAndFeel(new net.sourceforge.napkinlaf.NapkinLookAndFeel());
					setUIFont(new FontUIResource(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16)));
					StartBLService startController=new StartController();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
    public static void setUIFont(javax.swing.plaf.FontUIResource f)
    {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while(keys.hasMoreElements())
        {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if(value instanceof javax.swing.plaf.FontUIResource)
            {
                UIManager.put(key,f);
            }
        }
    }

}
