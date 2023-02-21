package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args)throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter RollNo:");
		int rollno=s.nextInt();
		System.out.println("Enter Name:");
		String name=s.next();
		System.out.println("Enter Marks:");
		int marks=s.nextInt();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
	    PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");	
	    pstmt.setInt(1, rollno);
	    pstmt.setString(2, name);
	    pstmt.setInt(3, marks);
	    pstmt.executeUpdate();
	    System.out.println("One Record Inserted Sussfully");
	}

}
