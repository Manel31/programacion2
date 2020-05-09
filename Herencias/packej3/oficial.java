package packej3;

public class oficial extends operario{

	public oficial() {
		
	}	
	public oficial(String nombre) {
		this.setNombre(nombre);
	}
	
	
	//METODOS
	public String toString() {
		String info = this.nombre+ " es un objeto de la clase Empleado --> Operario --> Oficial";
		return info;
	}
}
