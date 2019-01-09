package gr.hua.erasmus.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.hua.erasmus.dao.StudentDAOImpl;
import gr.hua.erasmus.dao.UniversitiesDAOImpl;

/**
 * Servlet implementation class DeleteUniversityServlet
 */
@WebServlet("/DeleteUniversityServlet")
public class DeleteUniversityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteUniversityServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		int id = Integer.parseInt(request.getParameter("id"));

		UniversitiesDAOImpl uniDaoImpl = new UniversitiesDAOImpl();
		uniDaoImpl.deleteById(id);

		response.sendRedirect("servicespage");

	}

}
