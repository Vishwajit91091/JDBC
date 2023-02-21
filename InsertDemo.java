package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");

		Statement stmt=con.createStatement();
        stmt.executeUpdate("insert into student values(1,'aaa',93)");

		System.out.println("Record inserted succifully");
		}catch(Exception e){
			System.err.println(e);
		}
	  }
}
