package gr.hua.erasmus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import gr.hua.erasmus.dbconn.dbconnection;
import gr.hua.erasmus.entities.Form;

@Component
public class FormDAOImpl implements FormDAO {
	
	dbconnection connection = new dbconnection();
	
	@Override
	public void save(Form form) {
		String query = "insert into Form (username, fullname, fathername, mothername, phone, year, lessons, university_1, university_2, university_3, cert) values (?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, form.getUsername());
			ps.setString(2, form.getFullname());
			ps.setString(3, form.getFathername());
			ps.setString(4, form.getMothername());
			ps.setInt(5, form.getPhone());
			ps.setInt(6, form.getYear());
			ps.setInt(7, form.getLessons());
			String[] unis = form.getUniversities();
			for (int i=0;i<3;i++) {
				if (i < unis.length) {
					ps.setString(8+i, unis[i]);
				} else {
					ps.setString(8+i, null);
				}
			}
			ps.setString(11, form.getCert());
			
			
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Form saved with id="+form.getId());
			}else System.out.println("Form saved failed with id="+form.getId());
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}