//MANEL SEBASTIAN ALVAREZ
package packej6;

public class repartidor extends empleado{

	//ATRIBUTOS
	protected String zona;
	
	
	//CONSTRUCTORES
	public repartidor(String nombre, int edad, double salario, String zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.zona = zona;
	}
	public repartidor() {
		
	}
	
	//GETTERS & SETTERS
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	//METODOS
	public String toString() {
		String info = "Nombre: "+this.nombre+" ,la edad es: "+this.edad+", el salario: "+this.salario+" y la zona:"+this.zona;
		return info;
	}
	public void plus() {
		if (edad < 25 && zona == "zona 3") {
			salario = salario + PLUS;
		}
	}
}
