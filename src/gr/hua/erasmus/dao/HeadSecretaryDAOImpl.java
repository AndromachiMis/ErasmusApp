package gr.hua.erasmus.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import gr.hua.erasmus.dbconn.dbconnection;
import gr.hua.erasmus.entities.HeadSecretary;

public class HeadSecretaryDAOImpl implements HeadSecretaryDAO {


	dbconnection connection = new dbconnection();
	
	
	@Override
	public void update(HeadSecretary headsec) {
		String query = "update HeadSecretary set username=?, password=?, fullname=? from HeadSecretary where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			ps.setInt(1, headsec.getId());
			ps.setString(2, headsec.getUsername());
			ps.setString(3, headsec.getPassword());
			ps.setString(4, headsec.getFullname());
			
			int out = ps.executeUpdate();
			
			if(out !=0){
				System.out.println("HeadSecretary updated with id=" + headsec.getId());
			}else System.out.println("No HeadSecretary found with id=" + headsec.getId());
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
	public List<HeadSecretary> getHeadSecretary() {
		String query = "select id, username, password, fullname from HeadSecretary";
		List<HeadSecretary> headsecList = new ArrayList<HeadSecretary>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = connection.condb();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()){
				HeadSecretary headsec = new HeadSecretary();
				headsec.setId(rs.getInt("id"));
				headsec.setUsername(rs.getString("username"));
				headsec.setPassword(rs.getString("password"));
				headsec.setFullname(rs.getString("fullname"));


				headsecList.add(headsec);
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
		return headsecList;
	}

}



