//Autor : Manel Sebastián Álvarez
package packev5;

public class Perecedero extends Producto{

	//ATRIBUTOS
	protected int diasACaducar = 0;
	protected double AverageMark;
	
	//CONSTRUCTORES
	public 	Perecedero () {
		
	}
	
	public Perecedero(String nombre, double precio, int diasACaducar, double AverageMark) {
		this.nombre = nombre;
		this.precio = precio;
		this.diasACaducar = diasACaducar;
		this.AverageMark = AverageMark;
	}

	//GETTERS Y SETTERS
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	public double getAverageMark() {
		return AverageMark;
	}

	public void setAverageMark(double averageMark) {
		AverageMark = averageMark;
	}
	//METODOS
	@Override
	public void calcular(int cantidad) {
		if(diasACaducar == 1){
			precio = precio / 4;
		}else if(diasACaducar == 2){
			precio = precio / 3;
		}else if(diasACaducar == 3) {
			precio = precio / 2;
		}
		precio = precio * cantidad;
	}
	
}
