package packej3;

public class directivo extends empleado{

	public directivo(String nombre) {
		this.nombre = nombre;
	}
	
	public directivo() {
		
	}
	
	public String toString() {
		String info = this.nombre+ " es un objeto de la clase Empleado --> Directivo";
		return info;
	}
}
