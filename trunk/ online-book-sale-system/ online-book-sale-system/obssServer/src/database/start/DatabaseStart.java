package database.start;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import database.init.InitDatabase;
import database.user.UserDatabase;
import databaseService.init.InitDatabaseService;
import databaseService.user.UserDatabaseService;

public class DatabaseStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LocateRegistry.createRegistry(5000);
			InitDatabaseService initDatabase=new InitDatabase();
			Naming.rebind("rmi://127.0.0.1:5000/InitDatabase", initDatabase);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
