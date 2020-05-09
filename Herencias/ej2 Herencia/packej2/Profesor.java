package packej2;

public class Profesor extends Persona{

	protected String Despacho, HorarioTutorias;

	public Profesor() {
		
	}
	
	public Profesor(String nombre, String despacho) {
		this.nombre = nombre;
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
