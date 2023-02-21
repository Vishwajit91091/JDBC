package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@licalhost:1521:orcl", "system", "tiger");
			
			Statement stmt=(Statement) con.createStatement();
			stmt.execute("create table student(rollno number(3),name varchar2(10),marks number(3))");
			System.out.println("Table Create Successfully");
		 
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
