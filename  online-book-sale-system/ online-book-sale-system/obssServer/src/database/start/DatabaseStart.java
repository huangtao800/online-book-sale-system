package database.start;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import javax.swing.JOptionPane;

import database.book.BookDatabase;
import database.customer.CustomerDatabase;
import database.init.InitDatabase;
import database.present.PresentDatabase;
import database.promotion.PromotionDatabase;
import database.sales.OrderDatabase;
import database.user.UserDatabase;
import databaseService.book.BookDatabaseService;
import databaseService.customer.CustomerDatabaseService;
import databaseService.init.InitDatabaseService;
import databaseService.present.PresentDatabaseService;
import databaseService.promotion.PromotionDatabaseService;
import databaseService.sales.OrderDatabaseService;
import databaseService.user.UserDatabaseService;

public class DatabaseStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LocateRegistry.createRegistry(5000);
			InitDatabaseService initDatabase=InitDatabase.getInstance();
			InetAddress addr = InetAddress.getLocalHost();
		    String ip=addr.getHostAddress();
			if(ip == null){
				JOptionPane.showMessageDialog(null, "输入错误！");
				System.exit(1);
			}
			Naming.rebind("rmi://"+ ip+ ":5000/InitDatabase", initDatabase);
			
			CustomerDatabaseService memberDatabase=CustomerDatabase.getInstance();
			Naming.rebind("rmi://"+ ip+ ":5000/MemberDatabase", memberDatabase);
			
			OrderDatabaseService orderDatabase = OrderDatabase.getInstance();
			Naming.rebind("rmi://"+ ip+ ":5000/OrderDatabase", orderDatabase);
			
			BookDatabaseService bookDatabase = BookDatabase.getInstance();
			Naming.rebind("rmi://"+ ip+ ":5000/BookDatabase", bookDatabase);
			
			UserDatabaseService userDatabase = UserDatabase.getInstance();
			Naming.rebind("rmi://"+ ip+ ":5000/UserDatabase", userDatabase);
			
			PresentDatabaseService presentDatabase=PresentDatabase.getInstance();
			Naming.rebind("rmi://"+ ip+ ":5000/PresentDatabase",presentDatabase);
			
			PromotionDatabaseService promotionDatabase=PromotionDatabase.getInstance();
			Naming.rebind("rmi://"+ ip+ ":5000/PromotionDatabase", promotionDatabase);
			
			JOptionPane.showMessageDialog(null, "服务器已开启！");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
