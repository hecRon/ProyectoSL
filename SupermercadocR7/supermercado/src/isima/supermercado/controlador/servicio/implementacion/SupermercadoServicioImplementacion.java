package isima.supermercado.controlador.servicio.implementacion;

import java.util.Calendar;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import isima.supermercado.controlador.excepciones.SupermercadoException;
import isima.supermercado.controlador.servicio.SupermercadoServicio;
import isima.supermercado.modelo.dao.SupermercadoDAO;
import isima.supermercado.modelo.negocio.Articulo;
import isima.supermercado.modelo.negocio.Departamento;
import isima.supermercado.modelo.negocio.Usuario;
import isima.supermercado.modelo.negocio.Venta;

public class SupermercadoServicioImplementacion implements SupermercadoServicio {
	private SupermercadoDAO supermercadoDAO;
	

	public SupermercadoDAO getSupermercadoDAO() {
		return supermercadoDAO;
	}

	public void setSupermercadoDAO(SupermercadoDAO supermercadoDAO) {
		this.supermercadoDAO = supermercadoDAO;
	}

	@Override
	public List<Departamento> obtenerDepartamentos() throws SupermercadoException{
		try{
			return this.supermercadoDAO.obtenerDepartamentos();
		}
		catch (Exception e){
			throw new SupermercadoException("Error al obtener los Departamentos",e);
		}
	}

	@Override
	public List<Articulo> obtenerArticulos(Departamento departamento) throws SupermercadoException {
		try{
			return this.supermercadoDAO.obtenerArticulos(departamento);
		}
		catch (Exception e){
			throw new SupermercadoException("Error al obtener Articulos por Departamento",e);
		}
	}

	@Override
	public Articulo obtenerArticulo(Integer clave) throws SupermercadoException {
		try{
			return this.supermercadoDAO.obtenerArticulo(clave);
		}
		catch (Exception e){
			throw new SupermercadoException("Error al obtener Articulo",e);
		}
	}

	@Override
	public Usuario obtenerUsuario(Integer clave) throws SupermercadoException {
		try{
			return this.supermercadoDAO.obtenerUsuario(clave);
		}
		catch (Exception e){
			throw new SupermercadoException("Error al obtener usuario",e);
		}
	}

	@Override
	@Transactional
	public void registrarVenta(Venta venta) throws SupermercadoException {
		try{			
			venta.setFechaVenta(Calendar.getInstance());			
			Articulo a = supermercadoDAO.obtenerArticulo
			(venta.getArticulo().getClave());
			/*  //Se omite esta parte para poder registrar la Venta, 
			    //ya que no actualiza el descuento de acticulo
			Integer cantidadDisponible=a.getCantidad();
			cantidadDisponible --;
			a.setCantidad(cantidadDisponible);
			
			this.supermercadoDAO.actualizarArticulo(a); */ 
			this.supermercadoDAO.registrarVenta(venta);
		}
		catch(Exception e){
		    throw new SupermercadoException("Error al Registrar Venta",e); 	
		}
	}
	
	//Aqui agregue la funcion de Imprimir la Venta
	/*@Override
	@Transactional
	public void imprimirVenta(Venta venta) throws SupermercadoException {
		try{			
			String fileJasper = "G:/Proyecto Completo Supermercado/supermercado/Ventas.jasper";
            //G:\Proyecto Completo Supermercado\supermercado   
			JasperPrint print = JasperFillManager.fillReport(fileJasper,null,con);
			JasperViewer jviewer = new JasperViewer(print,false);
			jviewer.setVisible(true);
			
			venta.setFechaVenta(Calendar.getInstance());			
			Articulo a = supermercadoDAO.obtenerArticulo
			(venta.getArticulo().getClave());
			  //Se omite esta parte para poder registrar la Venta, 
			    //ya que no actualiza el descuento de acticulo
			Integer cantidadDisponible=a.getCantidad();
			cantidadDisponible --;
			a.setCantidad(cantidadDisponible);
			
			this.supermercadoDAO.actualizarArticulo(a);  
			this.supermercadoDAO.registrarVenta(venta);
		}
		catch(Exception e){
		    throw new SupermercadoException("Error al Imprimir Venta",e); 	
		}
	}
	/*
	 *try{
				Class.forName(driver);
				 con = DriverManager.getConnection(connectString, user , password);
				}

				catch ( Exception e ){
				System.out.println(e.getMessage());
				}
			          try{
			                  String fileJasper = "G:/Proyecto Completo Supermercado/supermercado/Ventas.jasper";
			                                       //G:\Proyecto Completo Supermercado\supermercado   
			                JasperPrint print = JasperFillManager.fillReport(fileJasper,null,con);
			                JasperViewer jviewer = new JasperViewer(print,false);
			                jviewer.setVisible(true);
			                
			            }catch(Exception ex){
			                ex.printStackTrace();
			                JOptionPane.showMessageDialog(null,"Se produjo un error al leer el archivo .jasper");
			            }  
			        
			    }	*/
}
