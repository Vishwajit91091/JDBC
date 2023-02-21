package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
      CallableStatement cstmt=con.prepareCall("{call insertpro(?,?,?)}");
      
      cstmt.setInt(1, Integer.parseInt(args[0]));
      cstmt.setString(2, args[1]);
      cstmt.setInt(3, Integer.parseInt(args[2]));
      cstmt.execute();
      System.out.println("One Record Sussfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
