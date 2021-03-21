package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletImc
 */
@WebServlet("/calcularImc")
public class ServletImc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletImc() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       float altura = Float.parseFloat(request.getParameter("altura"));
       float peso = Float.parseFloat(request.getParameter("peso"));
		
		float imc= peso / (altura * altura);
		
		request.setAttribute("imc", imc);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
