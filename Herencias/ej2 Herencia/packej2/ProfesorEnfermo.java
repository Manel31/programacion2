package packej2;

public class ProfesorEnfermo extends Profesor{


	public ProfesorEnfermo(String nombre, String despacho) {
		this.nombre = nombre;
		this.Despacho = Despacho;
	}
	
	public ProfesorEnfermo() {
		
	}
	
	@Override
	public void getConsultas() {
		System.out.println("El profesor está enfermo. Se suspenden las consultas hasta que se recupere. Disculpe las molestias.");
	}
}
