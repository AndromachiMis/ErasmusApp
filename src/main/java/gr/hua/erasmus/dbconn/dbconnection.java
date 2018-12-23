package main.java.gr.hua.erasmus.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
	
	String jdbcUrl = "jdbc:mysql://localhost/it21489?useSSL=false";
    String user = "it21489";
    String pass = "changeit";
    
    
    public Connection condb() {

    	
    	Connection con = null;
    	
        try {
            System.out.println("Connecting to database: " + jdbcUrl);
            con = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection success");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;
    
     }

}
