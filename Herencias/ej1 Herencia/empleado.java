package packej1;

public class empleado {
	
	protected String nombre, dni;
	protected int edad;
	protected boolean casado;
	protected double salario;
	
	public empleado(String nombre, String dni, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public empleado() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//METODOS
	
	public String clasificacion() {
			String años = "";
			
			if (edad <= 18) {
				años = "Novato";
			}else if(edad >= 19 && edad <= 25) {
				años = "Junior";
			}else if (edad > 25) {
				años = "Senior";
			}
			return años;
	}
	
	public void MostrarDatos(){
		System.out.println("Nombre: "+this.nombre+". DNI: "+this.dni+". Edad: "+this.edad+".  Posicion: "+this.casado+". Salario: "+this.salario);
	}
	
	public void aumentarSueldo(double percent) {
		percent = 1+(percent/100);
		salario = salario*percent;
	}
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
