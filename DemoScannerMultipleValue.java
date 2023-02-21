package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DemoScannerMultipleValue {

	public static void main(String[] args) throws Exception{
		String option2;
		Scanner s=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "tiger");
	    PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");	
	    do {
	    System.out.println("Enter RollNo:");
		int rollno=s.nextInt();
		System.out.println("Enter Name:");
		String name=s.next();
		System.out.println("Enter Marks:");
		int marks=s.nextInt();
	    pstmt.setInt(1, rollno);
	    pstmt.setString(2, name);
	    pstmt.setInt(3, marks);
	    pstmt.executeUpdate();
	    System.out.println("Do You Want Save/Cancel");
	    String option=s.next();
	    if(option.equalsIgnoreCase("save")) 
	    {
	    // con.commit();
	     System.out.println("One Record Inserted Sussfully");
	    
	    }
	    else if(option.equalsIgnoreCase("cancel")){
	    	con.rollback();
	    }else{
	    	System.out.println("Invalid Option");
	    }
	    System.out.println("Do You Want To Continue:");
	    option2=s.next();
	    }while(option2.equalsIgnoreCase("Yes"));
	   
	  }

}
