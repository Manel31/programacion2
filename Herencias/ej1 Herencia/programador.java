package packej1;

public class programador extends empleado{

	private int lineasCodigoPorHora;
	private String lenguajeDominante;
	
	public programador(String nombre, String dni, String lenguajeDominante, int lineasCodigoPorHora, int edad, boolean casado, double salario) {

		this.nombre = nombre;
		this.dni = dni;
		this.lenguajeDominante = lenguajeDominante;
		this.lineasCodigoPorHora = lineasCodigoPorHora;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public programador() {
		
	}

	public int getLineasCodigoPorHora() {
		return lineasCodigoPorHora;
	}

	public void setLineasCodigoPorHora(int lineasCodigoPorHora) {
		this.lineasCodigoPorHora = lineasCodigoPorHora;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public String nivelProgramacion() {
		String nivel = "";
		if (lineasCodigoPorHora < 200) {
			nivel = "Level 1";
		}else if (lineasCodigoPorHora >= 200 && lineasCodigoPorHora <= 500) {
			nivel = "Level 2";
		}else if (lineasCodigoPorHora > 500) {
			nivel = "Level 3";
		}
		return nivel;
	}
}
