package isima.supermercado.modelo.negocio;

	import java.io.Serializable;
	import java.util.*;

	public class Venta implements Serializable {
	    private Integer clave;
		private Calendar fechaVenta;
		private Usuario usuario;
		private Articulo articulo;
		
		public Venta(){
		}

		public Integer getClave() {
			return clave;
		}

		public void setClave(Integer clave) {
			this.clave = clave;
		}

		public Calendar getFechaVenta() {
			return fechaVenta;
		}

		public void setFechaVenta(Calendar fechaVenta) {
			this.fechaVenta = fechaVenta;
		}
		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public Articulo getArticulo() {
			return articulo;
		}

		public void setArticulo(Articulo articulo) {
			this.articulo = articulo;
		}

	}



