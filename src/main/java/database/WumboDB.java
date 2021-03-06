package database;

import java.sql.*;

public class WumboDB {
	// JDBC driver name and database URL
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 static final String DB_URL = "jdbc:mysql://wumbo-db-instance.cw661l5aptwb.us-west-2.rds.amazonaws.com:3306/wumboideas_database";

	 //  Database credentials
	 static final String USER = "wumbology";
	 static final String PASS = "loyalty1";
	 
	 public static void addUser(String username, String password, String salt) {
	 Connection conn = null;
	 Statement stmt = null;
	 try{
	    //STEP 2: Register JDBC driver
	    Class.forName("com.mysql.jdbc.Driver");

	    //STEP 3: Open a connection
	    System.out.println("Connecting to a selected database...");
	    conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    System.out.println("Connected database successfully...");
	    
	    //STEP 4: Execute a query
	    String queryCheck = "SELECT * from User WHERE username = '" + username + "';";
	    ResultSet rs = stmt.executeQuery(queryCheck);
	    if (rs.next()) {
	    	System.out.println("username already exists");
	    }
	    System.out.println("Inserting records into the table...");
	    stmt = conn.createStatement();
	    
	    String sql = "INSERT INTO User " +
                "VALUES ('" + username + "', '" + password + "', '" + salt + "');";
	    stmt.executeUpdate(sql);
	    System.out.println("Inserted records into the table...");

	 }catch(SQLException se){
	    //Handle errors for JDBC
	    se.printStackTrace();
	 }catch(Exception e){
	    //Handle errors for Class.forName
	    e.printStackTrace();
	 }finally{
	    //finally block used to close resources
	    try{
	       if(stmt!=null)
	          conn.close();
	    }catch(SQLException se){
	    }// do nothing
	    try{
	       if(conn!=null)
	          conn.close();
	    }catch(SQLException se){
	       se.printStackTrace();
	    }//end finally try
	 }//end try
	}
	 
	 public static boolean query(String username, String password) {
		 boolean ans = false;

		 Connection conn = null;
		 Statement stmt = null;
		 try{
		    //STEP 2: Register JDBC driver
		    Class.forName("com.mysql.jdbc.Driver");

		    //STEP 3: Open a connection
		    System.out.println("Connecting to a selected database...");
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    System.out.println("Connected database successfully...");
		    
		    //STEP 4: Execute a query
		    String queryCheck = "SELECT * from User WHERE username = '" + username + "' &&"
		    		+ " password = '" + password + "';";
		    ResultSet rs = stmt.executeQuery(queryCheck);
		    if (rs.next()) {
		    	return true;
		    }
		 }catch(SQLException se){
		    //Handle errors for JDBC
		    se.printStackTrace();
		 }catch(Exception e){
		    //Handle errors for Class.forName
		    e.printStackTrace();
		 }finally{
		    //finally block used to close resources
		    try{
		       if(stmt!=null)
		          conn.close();
		    }catch(SQLException se){
		    }// do nothing
		    try{
		       if(conn!=null)
		          conn.close();
		    }catch(SQLException se){
		       se.printStackTrace();
		    }//end finally try
		 }//end try
		 
		 return ans;
	 }
	 
	 public static void addGroup(String groupName) {
	 Connection conn = null;
	 Statement stmt = null;
	 try{
	    //STEP 2: Register JDBC driver
	    Class.forName("com.mysql.jdbc.Driver");

	    //STEP 3: Open a connection
	    System.out.println("Connecting to a selected database...");
	    conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    System.out.println("Connected database successfully...");
	    
	    //STEP 4: Execute a query
	    String queryCheck = "SELECT * from User WHERE username = '" + groupName + "';";
	    ResultSet rs = stmt.executeQuery(queryCheck);
	    if (rs.next()) {
	    	System.out.println("username already exists");
	    }
	    System.out.println("Inserting records into the table...");
	    stmt = conn.createStatement();
	    
	    String sql = "INSERT INTO Groups " +
                "VALUES ('" + groupName + "';)";
	    stmt.executeUpdate(sql);
	    System.out.println("Inserted records into the table...");

	 }catch(SQLException se){
	    //Handle errors for JDBC
	    se.printStackTrace();
	 }catch(Exception e){
	    //Handle errors for Class.forName
	    e.printStackTrace();
	 }finally{
	    //finally block used to close resources
	    try{
	       if(stmt!=null)
	          conn.close();
	    }catch(SQLException se){
	    }// do nothing
	    try{
	       if(conn!=null)
	          conn.close();
	    }catch(SQLException se){
	       se.printStackTrace();
	    }//end finally try
	 }//end try
	}
}
