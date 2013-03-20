package isima.supermercado.controlador.servicio;

import isima.supermercado.controlador.excepciones.SupermercadoException;
import isima.supermercado.modelo.negocio.Articulo;
import isima.supermercado.modelo.negocio.Departamento;
import isima.supermercado.modelo.negocio.Usuario;
import isima.supermercado.modelo.negocio.Venta;

import java.util.List;

public interface SupermercadoServicio {
	
	List<Departamento> obtenerDepartamentos() throws SupermercadoException;
	List<Articulo> obtenerArticulos(Departamento departamento) throws SupermercadoException;
	
	Articulo obtenerArticulo(Integer clave) throws SupermercadoException;
	Usuario obtenerUsuario(Integer clave) throws SupermercadoException;
	void registrarVenta(Venta venta) throws SupermercadoException;
	
}
