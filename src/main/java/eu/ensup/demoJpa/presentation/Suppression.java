package eu.ensup.demoJpa.presentation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.demoJpa.service.GestionEcoleService;

/**
 * Servlet implementation class Suppression
 */

@WebServlet("/supression")
public class Suppression extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Suppression() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ici dans la servlet");

		String id = request.getParameter("id");
		int i; 
		i = Integer.parseInt(id); 
		System.out.println("idd : " + id);
		
		GestionEcoleService ges = new GestionEcoleService();
		boolean result = ges.supprimerEtudiant(i);
		
		if (result == true)
		{
			RequestDispatcher rs = request.getRequestDispatcher("pageAccueil.jsp");
			rs.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"utf-8\" />");
			out.println("<title>Liste de formations du catalogue</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>Il y a eu une erreur veuillez recommencer</p>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
