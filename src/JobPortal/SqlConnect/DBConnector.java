package JobPortal.SqlConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	Connection conn=null;
	public static Connection dbConnector()
	{
	    try {
	    	
	    	String url = "jdbc:mysql://localhost:3307/jobportal";
	    	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	    	Connection conn = DriverManager.getConnection (url, "root", "password@123");
	    
	    	return conn;
	    	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	return null; 	
	    }
	}
}
