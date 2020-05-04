//Autor Manel Sebastian Alvarez
package EJ2;

public class publicaciones implements Interface{

	//ATRIBUTOS
	protected int codigo, anopublicacion;
	protected boolean atr_pres = false;
	
	//CONSTRUCTORES
	
	public publicaciones() {
		
	}
	
	public publicaciones(int codigo, int anopublicaiones, boolean atr_pres){
		this.codigo = codigo;
		this.anopublicacion = anopublicaiones;
		this.atr_pres = atr_pres;		
	}

	//GETTERS Y SETTERS
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnopublicacion() {
		return anopublicacion;
	}

	public void setAnopublicacion(int anopublicacion) {
		this.anopublicacion = anopublicacion;
	}

	public boolean isAtr_pres() {
		return atr_pres;
	}

	public void setAtr_pres(boolean atr_pres) {
		this.atr_pres = atr_pres;
	}
	
	//METODOS
	
	public String toString() {
	String info = "El codigo de esta publicaion es "+this.codigo+", se publicó el año "+this.anopublicacion+" y el atributo prestado es "+this.atr_pres;
	return info;
	}
	
	@Override
	public void prestar() {
		this.atr_pres=false;
		}
	
	@Override
	public void devolver() {
		this.atr_pres=false;
	}
	
	@Override
	public boolean prestado() {
	return this.atr_pres=true;

	}
}
