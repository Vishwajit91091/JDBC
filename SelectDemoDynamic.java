package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemoDynamic {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","tiger");
   PreparedStatement pstmt=con.prepareStatement("select marks from student where rollno=?");
		pstmt.setInt(1,Integer.parseInt(args[0]));
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		System.out.println(rs.getInt(1));
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   

	}

}
