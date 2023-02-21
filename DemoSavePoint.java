package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class DemoSavePoint {

	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
	 Statement stmt=con.createStatement();
	 con.setAutoCommit(false);
	 Savepoint s=con.setSavepoint();
	 stmt.executeUpdate("update student set marks=70 where rollno=1");
	 con.rollback();
	 stmt.executeUpdate("delete from student where rollno=8");
	 con.commit();
	}

}
