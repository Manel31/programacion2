package packej3;

public class operario extends empleado{

	public operario() {
		
	}
	public operario(String nombre) {
		this.setNombre(nombre);
	}

	//METODOS
	public String toString() {
		String info = this.nombre+ " es un objeto de la clase Empleado --> Operario";
		return info;
	}
}
