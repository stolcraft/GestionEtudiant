package eu.ensup.demoJpa.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.demoJpa.domaine.Etudiant;
import eu.ensup.demoJpa.service.GestionEcoleService;

/**
 * Servlet implementation class Connection
 */
@WebServlet("/login")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connection() {
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
System.out.println("oui");
		
		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");
		GestionEcoleService ges = new GestionEcoleService();
		boolean result = ges.connection(login, pwd);
		
		
		RequestDispatcher rs = request.getRequestDispatcher("pageAccueil.jsp");
		rs.forward(request, response);
	}

}
