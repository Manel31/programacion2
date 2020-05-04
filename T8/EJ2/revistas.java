//Autor: Manel Sebastian Alvarez
package EJ2;

public class revistas extends publicaciones{

	//ATRIBUTOS
	private int numero;
	
	//CONSTRUCTORES
	public revistas() {
		
	}
	
	public revistas(int codigo, int anopublicaiones, boolean atr_pres, int numero) {
		this.codigo = codigo;
		this.anopublicacion = anopublicacion;
		this.atr_pres = atr_pres;
		this.numero = numero;
	}

	//GETTERS Y SETTERS
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//METODOS
	@Override
	public String toString() {
		String inforevista = "El codigo de esta revista es "+this.codigo+", se publicó el año "+this.anopublicacion+", el atributo prestado es "+this.atr_pres+" y el numero de la revista es "+this.numero;
		return inforevista;
		}
}
