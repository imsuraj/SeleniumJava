package database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import org.testng.annotations.Test;


public class ConnectMySql {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		String connectionURL = "jdbc:mysql://localhost:3306/selenium?autoReconnect=true&useSSL=false";
		
		Connection  con = DriverManager.getConnection(connectionURL,"root", "Suraj@123");
		System.out.println("Connection established to the database");
		
		Statement statement = con.createStatement();
		
		ResultSet result= statement.executeQuery("SELECT * FROM selenium.SeleniumUser");
		
		while(result.next()) {
			String firstName = result.getString("FirstName");
			System.out.println("Database  record is: "+firstName);
			
			String lastName = result.getString("LastName");
			System.out.println("Database  record is: "+lastName);
			
			String email = result.getString("Email");
			System.out.println("Database  record is: "+email);
		}
		
		
		
		int size =0;
		if (result != null) 
		{
		  result.last();    // moves cursor to the last row
		  size = result.getRow(); // get row id 
		}
		System.out.println(size);
		con.close();
	}

}
