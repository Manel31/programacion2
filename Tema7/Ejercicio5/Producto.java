//Autor : Manel Sebastián Álvarez
package packev5;

public class Producto {

	//ATRIBUTOS
	protected String nombre;
	protected double precio;
	
	//CONSTRUCTORES
	public Producto() {
		
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//METODOS
	public void calcular(int cantidad) {
		precio = precio * cantidad;
	}

	public String toString() {
		String InfoProducto = "El nombre del producto es " +this.nombre+ " y su precio es de "+this.precio;
		return InfoProducto;
	}
	
}
