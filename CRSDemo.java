package jdbc;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class CRSDemo {

	public static void main(String[] args)throws Exception {
		CachedRowSet crs=new OracleCachedRowSet();
		crs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		crs.setUsername("system");
		crs.setPassword("tiger");
		crs.setCommand("select * from student");
		crs.execute();
		while(crs.next()) {
			System.out.print(crs.getInt(1)+"\t");
			System.out.print(crs.getString(2)+"\t");
			System.out.println(crs.getInt(3));
		}

	}

}
