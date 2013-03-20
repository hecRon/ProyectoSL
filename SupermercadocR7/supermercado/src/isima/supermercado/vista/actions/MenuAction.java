package isima.supermercado.vista.actions;

import java.util.*;

import isima.supermercado.controlador.servicio.SupermercadoServicio;
import isima.supermercado.modelo.negocio.Departamento;
import isima.supermercado.vista.beans.ServiceLocatorBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class MenuAction extends DispatchAction {

	public ActionForward mostrarRegistrarVenta(ActionMapping mapping,
			ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
			HttpSession sesion = request.getSession();
			ServiceLocatorBean serviceLocatorBean = null;
			SupermercadoServicio supermercadoServicio = null;

			serviceLocatorBean = new ServiceLocatorBean(sesion.getServletContext());
			supermercadoServicio = serviceLocatorBean.getSupermercadoServicio();

			List<Departamento> departamentos = supermercadoServicio.obtenerDepartamentos();
			sesion.setAttribute("vdepartamentos", departamentos);

			return mapping.findForward("registrarVenta");
			
			}
	public ActionForward mostrarConsultarArticulo(ActionMapping mapping,
			ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
			HttpSession sesion = request.getSession();
			ServiceLocatorBean serviceLocatorBean = null;
			SupermercadoServicio supermercadoServicio = null;

			serviceLocatorBean = new ServiceLocatorBean(sesion.getServletContext());
			supermercadoServicio = serviceLocatorBean.getSupermercadoServicio();

			List<Departamento> departamentos = supermercadoServicio.obtenerDepartamentos();
			sesion.setAttribute("departamentos", departamentos);
			
			return mapping.findForward("consultarArticulo");
			
			}
	//Aqui agregue la clase action mostrarImprimirVenta
	public ActionForward mostrarImprimirVenta(ActionMapping mapping,
			ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
			HttpSession sesion = request.getSession();
			ServiceLocatorBean serviceLocatorBean = null;
			SupermercadoServicio supermercadoServicio = null;

			serviceLocatorBean = new ServiceLocatorBean(sesion.getServletContext());
			supermercadoServicio = serviceLocatorBean.getSupermercadoServicio();

			List<Departamento> departamentos = supermercadoServicio.obtenerDepartamentos();
			sesion.setAttribute("departamentos", departamentos);
			
			return mapping.findForward("imprimirVenta");
			
			}

	public ActionForward Salir(ActionMapping mapping,
			 ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
			return null;

	}
}