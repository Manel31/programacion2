//MANEL SEBASTIAN ALVAREZ
package packej6;

public class comercial extends empleado{

	//ATRIBUTOS
	protected double comision;
	
	//CONSTRUCTORES
	public comercial(String nombre, int edad, double salario, double comision) {
		this.comision = comision;
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	public comercial() {
		
	}
	
	//GETTERS & SETTERS
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	//METODOS
	public String toString() {
		String info = "Nombre: "+this.nombre+" ,la edad es: "+this.edad+", el salario: "+this.salario+"y la comision: "+this.comision;
		return info;
	}
	
	public void plus() {
		if (edad >= 30 && comision >= 200) {
			salario = salario + PLUS;
		}
	}
}
