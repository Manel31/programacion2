//Autor : Manel Sebastián Alvaréz
package packev4;

public class Electrodomestico {

	//ATRIBUTOS
	protected double precioBase, peso;
	protected String color;
	protected char consumoEnergetico;
	
	//CONSTRUCTORES
	public Electrodomestico(String color, char consumoEnergetico, double precioBase, double peso) {
		this.color = color;
		consumoEnergetico = 'F';
		precioBase = 100;
		peso = 5;
	}
	public Electrodomestico() {
		color = "blanco";
		consumoEnergetico = 'F';
		precioBase = 100;
		peso = 5;
		
	}
	public Electrodomestico(double precioBase, double peso) {
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		precioBase = 100;
		peso = 5;
	}
	//GETTERS Y SETTERS
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	//METODOS
	public void comprobarConsumo(char letra) {
		letra = this.consumoEnergetico;
		boolean comprobar=false;
		char letraConsumo[]= {'A', 'B', 'C', 'D', 'E', 'F'};
		
			for(int cont = 0; cont < letraConsumo.length; cont++) {
				if(letraConsumo[cont]==letra){
					comprobar= true;
		}
				if(comprobar) {this.consumoEnergetico=letra;}
							else {this.consumoEnergetico='F';}
	}
	}
	public void comprobarColor(String color) {
		if(color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
			System.out.println("Color añadido");
		}else {
			color = "blanco";
		}
	}
	public double precioFinal() {
		double precioBaseConConsumoPeso = this.precioBase;
		
		if(this.consumoEnergetico == 'A') {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 100;
		}else if(this.consumoEnergetico == 'B') {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 80;
		}else if(this.consumoEnergetico == 'C') {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 60;
		}else if(this.consumoEnergetico == 'D') {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 50;
		}else if(this.consumoEnergetico == 'E') {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 30;
		}else if(this.consumoEnergetico == 'F') {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 10;
		}
		
		if(this.peso < 19) {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 10;
		}else if(this.peso >19 && this.peso <50) {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 50;
		}else if(this.peso >49 && this.peso <80) {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 80;
		}else if(this.peso < 80) {
			precioBaseConConsumoPeso = precioBaseConConsumoPeso + 100;
		}
		return precioBaseConConsumoPeso;
	}
	
}
