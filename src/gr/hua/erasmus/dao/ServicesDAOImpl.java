package gr.hua.erasmus.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import gr.hua.erasmus.dbconn.dbconnection;
import gr.hua.erasmus.entities.Services;

public class ServicesDAOImpl implements ServicesDAO {


	dbconnection connection = new dbconnection();


	@Override
	public void save(Services serv) {
		String query = "insert into Services (user_services, headsecretary_id, student_id) values (?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, serv.getUser_services());
			ps.setInt(2, serv.getHeadsecretary_id());
			ps.setInt(3, serv.getStudent_id());

			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Service saved" + serv.getUser_services());
			}else System.out.println("Service save failed" + serv.getUser_services());
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


	
	@Override
	public void update(Services serv) {
		String query = "update Services set user_services=?, headsercretary_id=?, student_id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, serv.getUser_services());
			ps.setInt(2, serv.getHeadsecretary_id());
			ps.setInt(3, serv.getStudent_id());
			
			int out = ps.executeUpdate();
			
			if(out !=0){
				System.out.println("Services updated" + serv.getUser_services());
			}else System.out.println("No Service found" + serv.getUser_services());
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

	@Override
	public void delete(String user_services) {
		String query = "delete from Services where user_services=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, user_services);
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Service deleted" + user_services);
			}else System.out.println("No Service found" + user_services);
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

	@Override
	public List<Services> getAll() {
		String query = "select user_services, headsecretary_id, student_id from Services";
		List<Services> servList = new ArrayList<Services>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()){
				Services serv = new Services();
				serv.setUser_services(rs.getString("user_services"));
				serv.setHeadsecretary_id(rs.getInt("headsecretary_id"));
				serv.setStudent_id(rs.getInt("student_id"));				
				
				servList.add(serv);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return servList;
	}

}


