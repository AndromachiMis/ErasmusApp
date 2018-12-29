package gr.hua.erasmus.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.hua.erasmus.dao.UniversitiesDAOImpl;
import gr.hua.erasmus.entities.Universities;

/**
 * Servlet implementation class UpdateUniversitiesServlet
 */
@WebServlet("/UpdateUniversitiesServlet")
public class UpdateUniversitiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUniversitiesServlet() {
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
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		int num_acceptants = Integer.parseInt(request.getParameter("num_acceptants"));
		int student_id= Integer.parseInt(request.getParameter("student_id"));
		
		
		Universities uni = new Universities();
		UniversitiesDAOImpl uniDaoImpl = new UniversitiesDAOImpl();
		uniDaoImpl.update(uni);
	}

}
