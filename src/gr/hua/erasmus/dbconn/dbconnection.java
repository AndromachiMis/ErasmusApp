package gr.hua.erasmus.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnection {
	
	String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
    String user = "it21489";
    String pass = "root";
    //String user = "root";
    //String pass = "root";
    
    
    public Connection condb() {

    	
    	Connection con = null;
    	
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database: " + jdbcUrl);
            con = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection success");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;
    
     }

}
