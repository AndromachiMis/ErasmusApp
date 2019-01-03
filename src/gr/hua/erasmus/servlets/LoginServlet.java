package gr.hua.erasmus.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import gr.hua.erasmus.dao.StudentDAOImpl;
import gr.hua.erasmus.dbconn.dbconnection;
import gr.hua.erasmus.entities.Student;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	dbconnection connection = new dbconnection();

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter out = response.getWriter();
		// TODO Auto-generated method stub
		boolean st = false;
		String username = request.getParameter("user");
		String password = request.getParameter("pwd");
		Connection con = connection.condb();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from users where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);			
			ResultSet rs = ps.executeQuery();
			st = rs.next();

			if (st) {
				
				if (rs.getString("role").equals("headsecretary")) {
					response.sendRedirect("servicespage");
				} else {
					response.sendRedirect("studentpage");
				}
			} else {
				response.sendRedirect("");
			}
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
