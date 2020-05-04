//Autor: Manel Sebastian Alvarez
package EJ2;

public class libros extends publicaciones{

	//ATRIBUTOS
	private String autor;
	
	//CONSTRUCTORES
	public libros() {
		
	}
	
	public libros(int codigo, int anopublicaiones, boolean atr_pres, String autor) {
		this.codigo = codigo;
		this.anopublicacion = anopublicacion;
		this.atr_pres = atr_pres;
		this.autor = autor;
	}
	
	//GETTERS Y SETTERS
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//METODOS
	@Override
	public String toString() {
		String infolibros = "El codigo de este libro es "+this.codigo+", se publicó el año "+this.anopublicacion+", el atributo prestado es "+this.atr_pres+" y el autor es "+this.autor;
		return infolibros;
		}
}
