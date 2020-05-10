//Manel Sebastian Alvarez
package packej6;

public class empleado {

	//ATRIBUTOS
	protected String nombre;
	protected int edad;
	protected double salario;
	protected final double PLUS = 500;
	
	
	//CONSTRUCTORES
	public empleado(String nombre, int edad, double salario) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public empleado() {
		
	}

	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getPLUS() {
		return PLUS;
	}
	
	//METODOS
	public String toString() {
		String info = "Nombre: "+this.nombre+" ,la edad es: "+this.edad+" y el salario: "+this.salario;
		return info;
	}
	
	public void plus() {
		salario = salario +PLUS;
	}
	
}
