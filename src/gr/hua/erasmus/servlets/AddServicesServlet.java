package gr.hua.erasmus.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.hua.erasmus.dao.ServicesDAOImpl;
import gr.hua.erasmus.entities.Services;


@WebServlet("/AddServicesServlet")
public class AddServicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServicesServlet() {
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
		String  user_services = request.getParameter("user_services");
		int headsecretary_id = Integer.parseInt(request.getParameter("headsecretary_id"));
		int student_id = Integer.parseInt(request.getParameter("student_id"));
		
		Services serv = new Services();
		ServicesDAOImpl servDaoImpl = new ServicesDAOImpl();
		servDaoImpl.save(serv);
	}

}
