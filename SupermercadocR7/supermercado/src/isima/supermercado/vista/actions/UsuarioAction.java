package isima.supermercado.vista.actions;

import isima.supermercado.controlador.servicio.SupermercadoServicio;
import isima.supermercado.modelo.negocio.Usuario;
import isima.supermercado.vista.beans.ServiceLocatorBean;

import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class UsuarioAction extends DispatchAction {
public ActionForward obtenerUsuario(ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request, 
		HttpServletResponse response) throws Exception{
	HttpSession sesion = request.getSession();
	ServiceLocatorBean serviceLocatorBean = null;
	SupermercadoServicio supermercadoServicio = null;

	serviceLocatorBean = new ServiceLocatorBean(sesion.getServletContext());
	supermercadoServicio = serviceLocatorBean.getSupermercadoServicio();

	Integer claveUsuario = new Integer(request.getParameter("usu"));
	Usuario usuario = supermercadoServicio.obtenerUsuario(claveUsuario);

	response.setContentType("text/xml");
	response.setCharacterEncoding("utf-8");
	response.setHeader("cache-Control", "no-cache,must-revalidate");
	response.setLocale(new Locale("es","MX"));

	StringBuilder sb = new StringBuilder();
	sb.append("<?xml version='1.0' encoding='utf-8'?>");
	sb.append("<usuario>");
	sb.append("<nombre>").append(usuario.getNombre()).append("</nombre>");
	sb.append("<apellido1>").append(usuario.getApellido1()).append("</apellido1>");
	sb.append("<apellido2>").append(usuario.getApellido2()).append("</apellido2>");
	sb.append("</usuario>");
	
	response.getWriter().println(sb);
	return null;
   }

}