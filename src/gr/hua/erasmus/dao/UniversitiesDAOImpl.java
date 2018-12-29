package gr.hua.erasmus.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import gr.hua.erasmus.dbconn.dbconnection;
import gr.hua.erasmus.entities.Universities;

public class UniversitiesDAOImpl implements UniversitiesDAO {


	dbconnection connection = new dbconnection();


	@Override
	public void save(Universities university) {
		String query = "insert into Universities (id, name, location, num_acceptants, student_id) values (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, university.getId());
			ps.setString(2, university.getName());
			ps.setString(3, university.getLocation());
			ps.setInt(4, university.getNum_acceptants());
			ps.setInt(5, university.getStudent_id());
			
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("University saved with id=" + university.getId());
			}else System.out.println("University save failed with id="+ university.getId());
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
	public Universities getById(String id) {
		String query = "select name, location, num_acceptants, student_id from Universities where id = ?";
		Universities uni = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				uni = new Universities();
				uni.setId(id);
				uni.setName(rs.getString("name"));
				uni.setLocation(rs.getString("location"));
				uni.setNum_acceptants(rs.getInt("num_acceptants"));
				uni.setStudent_id(rs.getInt("student_id"));
					
				
				
				System.out.println("University Found::" + uni);
			}else{
				System.out.println("No University found with id=" + id);
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
		return uni;
	}

	@Override
	public void update(Universities university) {
		String query = "update University set id=?, name=?, location=?, num_acceptants=?, student_id=? from Universities where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, university.getId());
			ps.setString(2, university.getName());
			ps.setString(3, university.getLocation());
			ps.setInt(4, university.getNum_acceptants());
			ps.setInt(5, university.getStudent_id());
			
			int out = ps.executeUpdate();
			
			if(out !=0){
				System.out.println("University updated with id=" + university.getId());
			}else System.out.println("No Student found with id=" + university.getId());
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
	public void deleteById(String id) {
		String query = "delete from Universities where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, id);
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("university deleted with id=" + id);
			}else System.out.println("no university found with id=" + id);
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
	public List<Universities> getAll() {
		String query = "select id, name, location, num_acceptants from Universities";
		List<Universities> uniList = new ArrayList<Universities>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()){
				Universities uni = new Universities();
				uni.setId(rs.getString("id"));
				uni.setName(rs.getString("name"));
				uni.setLocation(rs.getString("location"));
				uni.setNum_acceptants(rs.getInt("num_acceptants"));
				uni.setStudent_id(rs.getInt("student_id"));				
				
				uniList.add(uni);
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
		return uniList;
	}

}



