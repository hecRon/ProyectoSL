package isima.supermercado.modelo.negocio;

import java.io.Serializable;

public class Departamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer clave;
	private String nombre;
	
	
	public Departamento(){	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getClave() {
		return clave;
	}

	public void setClave(Integer clave) {
		this.clave = clave;
	}

}
