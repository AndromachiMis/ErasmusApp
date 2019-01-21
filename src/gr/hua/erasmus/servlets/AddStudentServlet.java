package gr.hua.erasmus.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.hua.erasmus.dao.StudentDAOImpl;
import gr.hua.erasmus.entities.Student;


@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String  username = request.getParameter("username");
		String password = request.getParameter("password");
		String fullname = request.getParameter("fullname");
		String fathername = request.getParameter("fathername");
		String mothername = request.getParameter("mothername");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String status = request.getParameter("status");
		int year= Integer.parseInt(request.getParameter("year"));
		int grades= Integer.parseInt(request.getParameter("grades"));
		int lessons= Integer.parseInt(request.getParameter("lessons"));
		
		Student student = new Student(username, password, fullname, fathername, mothername, phone, status, year, grades, lessons);
		StudentDAOImpl studentDaoImpl = new StudentDAOImpl();
		studentDaoImpl.save(student);
		
		response.sendRedirect("servicespage");
		
	}

}
