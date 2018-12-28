package main.java.gr.hua.erasmus.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.gr.hua.erasmus.dao.StudentDAOImpl;
import main.java.gr.hua.erasmus.entities.Student;

/**
 * Servlet implementation class UpdateStudentServlet
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		String  username = request.getParameter("user");
		String password = request.getParameter("pass");
		String fullname = request.getParameter("name");
		String fathername = request.getParameter("fname");
		String mothername = request.getParameter("mname");
		 int phone = Integer.parseInt(request.getParameter("phone"));
		String status = request.getParameter("status");
		String year = request.getParameter("year");
		//Double grades = request.getParameter("grades");
		int lessons= Integer.parseInt(request.getParameter("les"));
		
		
		Student student = new Student();
		StudentDAOImpl studentDaoImpl = new StudentDAOImpl();
		studentDaoImpl.update(student);
	}

}
