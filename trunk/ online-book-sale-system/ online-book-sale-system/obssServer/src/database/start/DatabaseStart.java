package database.start;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import database.init.InitDatabase;
import database.member.MemberDatabase;
import database.sales.OrderDatabase;
import database.user.UserDatabase;
import databaseService.init.InitDatabaseService;
import databaseService.member.MemberDatabaseService;
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
			Naming.rebind("rmi://127.0.0.1:5000/InitDatabase", initDatabase);
			
			MemberDatabaseService memberDatabase=MemberDatabase.getInstance();
			Naming.rebind("rmi://127.0.0.1:5000/MemberDatabase", memberDatabase);
			
			OrderDatabaseService orderDatabase = OrderDatabase.getInstance();
			Naming.rebind("rmi://127.0.0.1:5000/OrderDatabase", orderDatabase);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
