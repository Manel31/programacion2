package arranque;

public class RegistroMes {
	
	private int ano;
	private String Mes;

	Temperaturas temp = new Temperaturas();
	
	public RegistroMes() {
		
	}
	
	public RegistroMes(String Mes, int ano, Temperaturas temp) {
		
		this.Mes = Mes;
		this.ano = ano;
		this.temp = temp;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMes() {
		return Mes;
	}

	public void setMes(String mes) {
		Mes = mes;
	}

	public Temperaturas getTemp() {
		return temp;
	}

	public void setTemp(Temperaturas temp) {
		this.temp = temp;
	}
	
	public String toString() {
		
		String string = "Temperaturas";
		
		string = string +temp.Mostrar();
		
		string = string + "\nLa temperatura media es de : " + temp.media();
		string = string + "\nLa temperatura maxima es de : " + temp.maxima();
		string = string + "\nLa temperatura minima es de : "+ temp.minima();
		
		return string;
	}
	
}
