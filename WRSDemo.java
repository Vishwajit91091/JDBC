package jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;

public class WRSDemo {

	public static void main(String[] args)throws Exception {
	
		
			WebRowSet wrs=new OracleWebRowSet();
			wrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			wrs.setUsername("system");
			wrs.setPassword("tiger");
			wrs.execute();
			FileOutputStream fos=new FileOutputStream("D:/student.xml");
			wrs.writeXml(fos);
		
		
	 
	}

}
