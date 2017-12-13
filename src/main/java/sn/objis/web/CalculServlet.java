package sn.objis.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.calcul.CalculMetier;

/**
 * Servlet implementation class CalculServlet
 */
@WebServlet("/calculservlet")
public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculServlet() {
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
		double a = 0 ;
		double b = 0;
		double resultat;
		String action = request.getParameter("");
		CalculMetier calculmetier = new CalculMetier();
		
		if(action != null){
			a = Double.parseDouble(request.getParameter("a"));
			b = Double.parseDouble(request.getParameter("b"));
			
		}
		if(action.equalsIgnoreCase("Somme")){
			resultat = calculmetier.somme(a, b);
		}else{
			resultat = calculmetier.produit(a, b);
		}
		
		// Placer le rsultat du traitement dans un scope
		request.setAttribute("result", resultat);
		
		// Soumtre la valeur de la somme ou du produit à la page jsp pour l'afficher.
		RequestDispatcher reqDisp = request.getRequestDispatcher("index.jsp");
		reqDisp.forward(request, response);
	}

}
