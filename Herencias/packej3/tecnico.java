package packej3;

public class tecnico extends operario{

	public tecnico() {
		
	}
	
	public tecnico (String nombre) {
		this.setNombre(nombre);
	}
	
	public String toString() {
		String info = this.nombre+ " es un objeto de la clase Empleado --> Operario --> Tecnico";
		return info;
	}
}
