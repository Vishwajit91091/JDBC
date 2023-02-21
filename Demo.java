package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@orcl","system", "tiger");
		 System.out.println("Connection Establish Succefully Type 2");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
