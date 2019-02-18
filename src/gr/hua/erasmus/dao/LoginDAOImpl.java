package gr.hua.erasmus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import gr.hua.erasmus.dbconn.dbconnection;


@Component
public class LoginDAOImpl implements LoginDAO {
	

	dbconnection connection = new dbconnection();

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub		
		dbconnection connection = new dbconnection();
		String query = "select * from users where username=? and password=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;		
		try {	
			con = connection.condb();
			ps = con.prepareStatement(query);			
			ps.setString(1, username);
			ps.setString(2, password);	
			rs = ps.executeQuery();		

			if (rs.next()) {		
				
					System.out.println("Success login ");			
				
			} else {
				System.out.println("Invalid login");;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
