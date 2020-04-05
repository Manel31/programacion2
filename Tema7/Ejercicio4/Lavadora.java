package packev4;

public class Lavadora extends Electrodomestico {
	
	protected double carga = 5;

	public Lavadora() {
		
	}
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.precioBase = precioBase;
		this.peso = peso;
	}
	public Lavadora(double carga, double precioBase, double peso, String color, char consumoEnergetico){
		this.carga = carga;
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	@Override
	public double precioFinal() {
		double pesoPrecio = super.precioFinal();
		if(this.carga > 30){
			pesoPrecio = pesoPrecio + 50;
		}
		return pesoPrecio;
	}
}