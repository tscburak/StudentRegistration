package studentRegistration.dataAccess.concretes;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class ConnectDb {

	public Connection connectDb() {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/registration", "postgres", "12345");
//			System.out.println("Connected to Database.");
			return connection;
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Veritaban�na Ba�lanamad�.");
	        e.printStackTrace();
			return null;
		}
		
	}
	
}
