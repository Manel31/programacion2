package packev4;

public class Television extends Electrodomestico{

	protected double resolucion = 20;
	protected boolean smartTV = false;
	
	public Television() {
		
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Television(double precioBase, double peso, String color, char consumoEnergetico, double resolucion, boolean smartTV) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.resolucion = resolucion;
		this.smartTV = smartTV;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	@Override
	public double precioFinal(){
		double resolucionYSmart = super.precioFinal();
		if(this.resolucion > 40 && smartTV == true) {
			resolucionYSmart = (resolucionYSmart * 0.3)+50;
		}else if(this.resolucion > 40 && smartTV == false) {
			resolucionYSmart = resolucionYSmart * 0.3;
		}else if(this.resolucion < 40 && smartTV == true) {
			resolucionYSmart = resolucionYSmart +50;
		}else if(this.resolucion < 40 && smartTV == false) {
	}return resolucionYSmart;
 }
}
