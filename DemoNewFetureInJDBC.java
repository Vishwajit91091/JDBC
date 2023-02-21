package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoNewFetureInJDBC {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
	System.out.println("Connection established Sussfully");
	}

}
