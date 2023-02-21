package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2 {
	public static void main(String[] args)  {
		try {
			Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
		 System.out.println("Connection Estsblish Succefully Type 4");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
		
	


