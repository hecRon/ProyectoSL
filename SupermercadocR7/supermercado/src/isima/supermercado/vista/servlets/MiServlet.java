package isima.supermercado.vista.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException; 

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MiServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{

	try{
		String parametro1 = request.getParameter("p1");
		String parametro2 = request.getParameter("p2");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");	
		out.println("<body>");
		out.println("<h1>Bienvenido a Desarrollo Web:</h1>&nbsp;" + parametro1 + parametro2);
		out.println("<h3>Este es mi primer servlet con GET</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		}catch (Exception e){

		}

	   }


	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{

	try{
		String parametro1 = request.getParameter("p1");
		String parametro2 = request.getParameter("p2");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");	
		out.println("<body>");
		out.println("<h1>Bienvenido a Desarrollo Web:</h1>&nbsp;" + parametro1 + parametro2);
		out.println("<h3>Este es mi primer servlet con POST</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();

		}catch (Exception e){

		}

	   }

}
