package isima.supermercado.modelo.dao;

import java.util.List;

import isima.supermercado.modelo.negocio.*;

public interface SupermercadoDAO {

	void registrarDepartamento(Departamento departamento);
	void actualizarDepartamento(Departamento departamento);
	void eliminarDepartamento(Departamento departamento);
	Departamento obtenerDepartamento(Integer clave);
	
	List<Departamento>obtenerDepartamentos();
	
	void registrarUsuario(Usuario usuario);
	void actualizarUsuario(Usuario usuario);
	void eliminarUsuario(Usuario usuario);
	Usuario obtenerUsuario(Integer clave);
	
	List<Usuario>obtenerUsuarios();
	
	void registrarVenta(Venta venta);
	void actualizarVenta(Venta venta);
	void eliminarVenta(Venta venta);
	Venta obtenerVenta(Integer clave);
	
	List<Venta>obtenerVentas();
	
	void registrarArticulo(Articulo articulo);
	void actualizarArticulo(Articulo articulo);
	void eliminarArticulo(Articulo articulo);
	Articulo obtenerArticulo(Integer clave);
	
	List<Articulo>obtenerArticulos();
	
	List<Articulo>obtenerArticulos(Departamento departamento);
	
	}



