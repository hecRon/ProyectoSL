package isima.supermercado.vista.actions;

import isima.supermercado.controlador.servicio.SupermercadoServicio;
import isima.supermercado.modelo.negocio.Articulo;
import isima.supermercado.modelo.negocio.Departamento;
import isima.supermercado.modelo.negocio.Usuario;
import isima.supermercado.vista.beans.ServiceLocatorBean;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ArticuloAction extends DispatchAction {
	
public ActionForward obtenerArticulos(ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request, 
		HttpServletResponse response) throws Exception{
	HttpSession sesion = request.getSession();
	ServiceLocatorBean serviceLocatorBean = null;
	SupermercadoServicio supermercadoServicio = null;
			
	//Obtener el objeto de servicio

	serviceLocatorBean = new ServiceLocatorBean(sesion.getServletContext());
	supermercadoServicio = serviceLocatorBean.getSupermercadoServicio();
	
	//Integer claveArticulo = new Integer(request.getParameter("art"));
	//Articulo articulo = supermercadoServicio.obtenerArticulo(claveArticulo);//
	/*******************************/
	Integer claveDepartamento = new Integer(request.getParameter("departamento"));
	Departamento departamento = new Departamento();
	departamento.setClave(claveDepartamento);
	List<Articulo> articulos = supermercadoServicio.obtenerArticulos(departamento);
/*
	response.setContentType("text/xml");
	response.setCharacterEncoding("utf-8");
	response.setHeader("cache-Control", "no-cache,must-revalidate");
	response.setLocale(new Locale("es","MX"));

	/*StringBuilder sb = new StringBuilder();
	sb.append("<?xml version='1.0' encoding='utf-8'?>");
	sb.append("<articulo>");
	sb.append("<nombre>").append(articulo.getNombre()).append("</nombre>");
	sb.append("<precio>").append(articulo.getPrecio()).append("</precio>");
	//sb.append("<apellido2>").append(usuario.getApellido2()).append("</apellido2>");
	sb.append("</articulo>");*/

	/*Integer claveDepartamento = new Integer(request.getParameter("departamento"));
	Departamento departamento = new Departamento();
	departamento.setClave(claveDepartamento);
	List<Articulo> articulos = supermercadoServicio.obtenerArticulos(departamento);
*/
	StringBuilder sb = new StringBuilder();
	sb.append("<?xml version='1.0' encoding='utf-8'?>");
	sb.append("<select id=\"articulo\">");
	sb.append("<option value=\"-1\"></option>");
	for(Iterator<Articulo> it=articulos.iterator(); it.hasNext();){
		Articulo a = it.next();
		sb.append("<option value=\"").append(a.getClave()).append("\">");
		sb.append(a.getNombre());
		sb.append("</option>");
	}

	sb.append("</select>");
	response.getWriter().println(sb);
	return null;
    }

	public ActionForward obtenerArticulo(ActionMapping mapping,
			ActionForm form,
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
		HttpSession sesion = request.getSession();
		ServiceLocatorBean serviceLocatorBean = null;
		SupermercadoServicio supermercadoServicio = null;

		serviceLocatorBean = new ServiceLocatorBean(sesion.getServletContext());
		supermercadoServicio = serviceLocatorBean.getSupermercadoServicio();

		Integer claveArticulo = new Integer(request.getParameter("art"));
		Articulo articulo = supermercadoServicio.obtenerArticulo(claveArticulo);

		response.setContentType("text/xml");
		response.setCharacterEncoding("utf-8");
		response.setHeader("cache-Control", "no-cache,must-revalidate");
		response.setLocale(new Locale("es","MX"));

		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version='1.0' encoding='utf-8'?>");
		sb.append("<articulo>");
		sb.append("<nombre>").append(articulo.getNombre()).append("</nombre>");
		sb.append("<precio>").append(articulo.getPrecio()).append("</precio>");
		sb.append("<cantidad>").append(articulo.getCantidad()).append("</cantidad>");
		//sb.append("<departamento>").append(articulo.getDepartamento().getNombre()).append("</departamento>");
		sb.append("</articulo>");

		/*Integer claveUsuario = new Integer(request.getParameter("usu"));
		Usuario usuario = supermercadoServicio.obtenerUsuario(claveUsuario);*/
		
		response.getWriter().println(sb);
		return null;
	   }

}	
