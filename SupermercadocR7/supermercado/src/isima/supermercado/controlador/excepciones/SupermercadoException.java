package isima.supermercado.controlador.excepciones;

public class SupermercadoException extends Exception {
	public SupermercadoException(String mensaje){
		super(mensaje);
	}
	public SupermercadoException(String mensaje, Throwable causa){
		super(mensaje, causa);
	}
}
