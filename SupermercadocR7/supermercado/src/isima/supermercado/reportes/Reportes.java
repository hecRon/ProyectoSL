package isima.supermercado.reportes;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class Reportes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Reportes(){
		super();
	}
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response)throws ServletException, IOException{
						
			try{
			Class.forName("org.postgresql.Driver").newInstance();
			
			Connection conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/supermercadodb","postgresql","placebo");
			String nombreReporte = request.getParameter("nombreReporte");
			HashMap<String, Object> parametros=new HashMap<String, Object>();
			String rutaReporte=(new StringBuilder()).append(getServletContext().getRealPath("Reportes")).append("\\").append(nombreReporte).toString();
			String rutaReporteJasper=(new StringBuilder()).append(rutaReporte).append(".jasper").toString();
			String rutaReportePDF=(new StringBuilder()).append(rutaReporte).append(".pdf").toString();
			JasperPrint jasperPrint=JasperFillManager.fillReport(rutaReporteJasper, parametros, conexion);
			JasperExportManager.exportReportToPdfFile(jasperPrint, rutaReportePDF);
	
			response.sendRedirect((new StringBuilder()).append("/supermercado/Reportes").append("/").append(nombreReporte).append(".pdf").toString());
	
			}	catch (Exception e){
			response.getWriter().println((new StringBuilder()).append("Error al genrerar Reporte:").append(e.getMessage()).toString());
		}
	}
}