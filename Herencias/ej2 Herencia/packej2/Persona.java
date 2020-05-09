package packej2;

public class Persona {

	// ATRIBUTOS
	protected int edad;
	protected String nombre;
	
	// CONSTRUCTORES
	public Persona()
	{
		
	}
	public Persona(String n, int edad)
	{
		nombre = n;
		edad = 0;
	}
	// METODOS (CONSTRUCTORES)
	// SETERS
	public void setNombre(String n) {
		this.nombre = n;
	}
	public void setEdad(int e) {
		this.edad = e;
	}
	// GETERS
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	// METODOS
	
}
