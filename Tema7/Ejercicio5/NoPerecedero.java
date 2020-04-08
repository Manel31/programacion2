//Autor : Manel Sebastián Álvarez
package packev5;

public class NoPerecedero extends Producto{

	//ATRIBUTOS
	protected String tipo;
	
	//CONSTRUCTORES
	public NoPerecedero() {
		
	}
	
	public NoPerecedero(String nombre, double precio, String tipo) {
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
	}

	//GETTERS Y SETTERS
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//METODOS
	@Override
	public void calcular(int cantidad) {
		precio = precio * cantidad;
	}
}
