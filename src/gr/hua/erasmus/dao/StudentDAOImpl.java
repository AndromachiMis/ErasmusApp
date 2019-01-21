package gr.hua.erasmus.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import gr.hua.erasmus.dbconn.dbconnection;
import gr.hua.erasmus.entities.Student;

public class StudentDAOImpl implements StudentDAO {


	dbconnection connection = new dbconnection();

	@Override
	public void save(Student student) {
		String query = "insert into Student (username, password, fullname, fathername, mothername, phone, status, year, grades, lessons) values (?,?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, student.getUsername());
			ps.setString(2, student.getPassword());
			ps.setString(3, student.getFullname());
			ps.setString(4, student.getFathername());
			ps.setString(5, student.getMothername());
			ps.setInt(6, student.getPhone());
			ps.setString(7, student.getStatus());
			ps.setInt(8, student.getYear());
			ps.setInt(9, student.getGrades());
			ps.setInt(10, student.getLessons());
			
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Student saved with id="+student.getId());
			}else System.out.println("Student save failed with id="+student.getId());
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
	public Student getById(int id) {
		String query = "select username, password, fullname, fathername, mothername, phone, status, year, grades, lessons from Student where id = ?";
		Student stud = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				stud = new Student();
				stud.setId(id);
				stud.setUsername(rs.getString("username"));
				stud.setPassword(rs.getString("password"));
				stud.setFullname(rs.getString("fullname"));
				stud.setFathername(rs.getString("fathername"));
				stud.setMothername(rs.getString("mothername"));
				stud.setPhone(rs.getInt("phone"));
				stud.setStatus(rs.getString("status"));
				stud.setYear(rs.getInt("year"));
				stud.setGrades(rs.getInt("grades"));
				stud.setLessons(rs.getInt("lessons"));
					
				
				
				System.out.println("Student Found::"+stud);
			}else{
				System.out.println("No Student found with id="+id);
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
		return stud;
	}

	@Override
	public void update(Student student) {
		String query = "update Student set username=?, password=?, fullname=?, fathername=?, mothername=?, phone=?, status=?, year=?, grades=?, lessons=? where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setString(1, student.getUsername());
			ps.setString(2, student.getPassword());
			ps.setString(3, student.getFullname());
			ps.setString(4, student.getFathername());
			ps.setString(5, student.getMothername());
			ps.setInt(6, student.getPhone());
			ps.setString(7, student.getStatus());
			ps.setInt(8, student.getYear());
			ps.setInt(9, student.getGrades());
			ps.setInt(10, student.getLessons());
			ps.setInt(11, student.getId());
			
			int out = ps.executeUpdate();
			
			if(out !=0){
				System.out.println("Student updated with id="+student.getId());
			}else System.out.println("No Student found with id="+student.getId());
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
	public void deleteById(int id) {
		String query = "delete from Student where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("Student deleted with id="+id);
			}else System.out.println("No Student found with id="+id);
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
	public List<Student> getAll() {
		String query = "select id, username, password, fullname, fathername, mothername, phone, status, year, grades, lessons from Student";
		List<Student> studList = new ArrayList<Student>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()){
				Student stud = new Student();
				stud.setId(rs.getInt("id"));
				stud.setUsername(rs.getString("username"));
				stud.setPassword(rs.getString("password"));
				stud.setFullname(rs.getString("fullname"));
				stud.setFathername(rs.getString("fathername"));
				stud.setMothername(rs.getString("mothername"));
				stud.setPhone(rs.getInt("phone"));
				stud.setStatus(rs.getString("status"));
				stud.setYear(rs.getInt("year"));
				stud.setGrades(rs.getInt("grades"));
				stud.setLessons(rs.getInt("lessons"));					
				
				studList.add(stud);
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
		return studList;
	}

}
