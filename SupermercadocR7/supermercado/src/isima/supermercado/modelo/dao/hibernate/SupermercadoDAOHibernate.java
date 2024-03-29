package isima.supermercado.modelo.dao.hibernate;

import java.util.List;

import isima.supermercado.modelo.dao.SupermercadoDAO;
import isima.supermercado.modelo.negocio.Venta;
import isima.supermercado.modelo.negocio.Articulo;
import isima.supermercado.modelo.negocio.Departamento;
import isima.supermercado.modelo.negocio.Usuario;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class SupermercadoDAOHibernate extends HibernateDaoSupport implements SupermercadoDAO {

		
	@Override
	public void registrarDepartamento(Departamento departamento){
		this.getHibernateTemplate().save(departamento);

	}

	@Override
	public void actualizarDepartamento(Departamento departamento) {
		this.getHibernateTemplate().update(departamento);

	}

	@Override
	public void eliminarDepartamento(Departamento departamento) {
		this.getHibernateTemplate().delete(departamento);

	}

	@Override
	public Departamento obtenerDepartamento(Integer clave) {
		return(Departamento)this.getHibernateTemplate().get(Departamento.class, clave);
	}

	@Override
	public List<Departamento> obtenerDepartamentos() {
		return this.getHibernateTemplate().find("FROM Departamento d ORDER BY d.nombre");
	}

	@Override
	public void registrarVenta(Venta venta) {
		this.getHibernateTemplate().save(venta);

	}

	@Override
	public void actualizarVenta(Venta venta) {
		this.getHibernateTemplate().update(venta);

	}

	@Override
	public void eliminarVenta(Venta venta) {
		this.getHibernateTemplate().delete(venta);

	}

	@Override
	public Venta obtenerVenta(Integer clave) {
		return (Venta)this.getHibernateTemplate().get(Venta.class, clave);
	}

	@Override
	public List<Venta> obtenerVentas() {
		return this.getHibernateTemplate().find("FROM Venta v ORDER BY v.nombre");
	}

	@Override
	public void registrarArticulo(Articulo articulo) {
		this.getHibernateTemplate().save(articulo);

	}

	@Override
	public void actualizarArticulo(Articulo articulo) {
		this.getHibernateTemplate().update(articulo);

	}

	@Override
	public void eliminarArticulo(Articulo articulo) {
		this.getHibernateTemplate().delete(articulo);

	}

	@Override
	public Articulo obtenerArticulo(Integer clave) {
		return (Articulo)this.getHibernateTemplate().get(Articulo.class, clave);
	}

	@Override
	public List<Articulo> obtenerArticulos() {
		return this.getHibernateTemplate().find("FROM Articulo a ORDER BY a.nombre");
	}

	@Override
	public void registrarUsuario(Usuario usuario) {
		this.getHibernateTemplate().save(usuario);

	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		this.getHibernateTemplate().update(usuario);

	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		this.getHibernateTemplate().delete(usuario);

	}

	@Override
	public Usuario obtenerUsuario(Integer clave) {
		return (Usuario)this.getHibernateTemplate().get(Usuario.class, clave);
	}

	@Override
	public List<Usuario> obtenerUsuarios() {
		return this.getHibernateTemplate().find("FROM Usuario u ORDER BY u.nombre");
	}

	@Override
	public List<Articulo> obtenerArticulos(Departamento departamento) {
		return this.getHibernateTemplate().find("FROM Articulo a WHERE a.departamento.clave=? ORDER BY a.nombre" ,departamento.getClave());
	}

	
}
