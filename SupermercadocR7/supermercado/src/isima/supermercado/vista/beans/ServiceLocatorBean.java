package isima.supermercado.vista.beans;

import isima.supermercado.controlador.servicio.SupermercadoServicio;

import javax.servlet.ServletContext;
import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


public class ServiceLocatorBean implements Serializable {
	
	private ApplicationContext appContext;
	private SupermercadoServicio supermercadoServicio;
	

	public SupermercadoServicio getSupermercadoServicio() {
		return supermercadoServicio;
	}

	public void setSupermercadoServicio(SupermercadoServicio supermercadoServicio) {
		this.supermercadoServicio = supermercadoServicio;
	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public void setAppContext(ApplicationContext appContext) {
		this.appContext = appContext;
	}
	
	public ServiceLocatorBean() {
		super();
	}
	
	public ServiceLocatorBean(ServletContext servletContext){
		this.appContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		this.supermercadoServicio = (SupermercadoServicio)appContext.getBean("supermercadoServicio");
		
	}
}
