package isima.supermercado.vista.actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import isima.supermercado.controlador.servicio.SupermercadoServicio;
import isima.supermercado.modelo.negocio.Venta;
import isima.supermercado.modelo.negocio.Articulo;
import isima.supermercado.modelo.negocio.Usuario;
import isima.supermercado.vista.beans.ServiceLocatorBean;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class VentaAction extends DispatchAction {
	public ActionForward registrarVenta(ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request, 
		HttpServletResponse response) throws Exception{
	HttpSession sesion = request.getSession();
	ServiceLocatorBean serviceLocatorBean = null;
	SupermercadoServicio supermercadoServicio = null;

	serviceLocatorBean = new ServiceLocatorBean(sesion.getServletContext());
	supermercadoServicio = serviceLocatorBean.getSupermercadoServicio();

	Integer claveArticulo = new Integer(request.getParameter("a"));
	Integer claveUsuario = new Integer(request.getParameter("usu"));

	Venta venta = new Venta();
	Articulo articulo= new Articulo();
	articulo.setClave(claveArticulo);
	Usuario usuario= new Usuario();
	usuario.setClave(claveUsuario);
	venta.setArticulo(articulo);
	venta.setUsuario(usuario);

	supermercadoServicio.registrarVenta(venta);
	return null;
	}
}
