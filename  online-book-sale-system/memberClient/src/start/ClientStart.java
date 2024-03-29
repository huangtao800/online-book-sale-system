package start;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.InputStream;
import java.net.URISyntaxException;

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
				java.io.File file=null;
				
				InputStream is = this.getClass().getResourceAsStream("Font11.ttf");
				
//				if (is.) {
//					System.out.println("file not found");
//					return;
//				}
					try {
//					       java.io.FileInputStream fi = new java.io.FileInputStream(file);
					      java.io.BufferedInputStream fb = new java.io.BufferedInputStream(is);
					    Font nf = Font.createFont(Font.TRUETYPE_FONT, fb);
					  
					   nf = nf.deriveFont(Font.PLAIN, 16);
					   UIManager.setLookAndFeel(new net.sourceforge.napkinlaf.NapkinLookAndFeel());
						setUIFont(new FontUIResource(nf));
						StartBLService startController=new StartController();
					
					}
					catch (Exception e) {
					     System.out.println(e.getMessage());
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
