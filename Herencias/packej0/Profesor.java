package packej0;

public class Profesor extends Persona{

	private String Despacho, HorarioTutorias;

	public Profesor(String nombre, int edad, String despacho) {
		this.nombre = nombre;
		this.edad = edad;
		this.Despacho = despacho;
	}
	
	public String getDespacho() {
		return Despacho;
	}

	public void setDespacho(String despacho) {
		Despacho = despacho;
	}

	public String getHorarioTutorias() {
		return HorarioTutorias;
	}

	public void setHorarioTutorias(String horarioTutorias) {
		HorarioTutorias = horarioTutorias;
	}
	
	public void getConsultas() {
		System.out.println(nombre+" tiene tutoria los "+HorarioTutorias+" en las sala de profesores.");
	}

}
