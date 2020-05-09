package packej3;

public class empleado {

	protected String nombre;
	
	public empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public empleado() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		String info = this.nombre+ " es un objeto de la clase Empleado";
		return info;
	}
}
