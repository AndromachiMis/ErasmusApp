package gr.hua.erasmus.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
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
		doGet(request, response);
		boolean valid = true;
		int id = Integer.parseInt(request.getParameter("id"));
		String  username = request.getParameter("username");
		String fullname = request.getParameter("fullname");					
		String fathername = request.getParameter("fathername");
		String mothername = request.getParameter("mothername");
		int year = Integer.parseInt(request.getParameter("year"));
		int lessons = Integer.parseInt(request.getParameter("lessons"));
		String[] universities = request.getParameterValues("universities");
		String cert = request.getParameter("cert");
		
		if (year < 3 || year > 4) {
			valid = false;
		} else if (lessons > 5) {
			valid = false;
		} else if (universities.length > 3) {
			valid = false;
		}
		
		if (valid) {
			response.sendRedirect("invalidlogin");
		} else {
			response.sendRedirect("fail");
			
		}
	}

}