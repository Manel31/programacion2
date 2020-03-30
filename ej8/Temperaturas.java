package arranque;

import java.util.Scanner;

public class Temperaturas {

	private RegistroMes mes = new RegistroMes();
	private float[] temp = new float[31];
	private Scanner sc = new Scanner(System.in);
	private int dia = 31;
	public Temperaturas() {
		
	}
	
	
	public void leer() {
		switch (mes.getMes()) {
		case "Enero":
			dia = 31;
			break;
		case "Febrero":
			dia = 28;
			break;
		case "Marzo":
			dia = 31;
			break;
		case "Abril":
			dia = 30;
			break;
		case "Mayo":
			dia = 31;
			break;
		case "Junio":
			dia = 30;
			break;
		case "Julio":
			dia = 31;
			break;
		case "Agosto":
			dia = 31;
			break;
		case "Septiembre":
			dia = 30;
			break;
		case "Octubre":
			dia = 31;
			break;
		case "Noviembre":
			dia = 30;
			break;
		case "Diciembre":
			dia = 31;
			break;
		}
		for (int cont = 0; cont < dia; cont++) {
			
				System.out.println("La temperatura del dia "+(cont+1)+": ");
				temp[cont] = sc.nextFloat();
		}
	}
	
	public String Mostrar() {
		String string = "";
		for (int cont = 0; cont < dia; cont++) {
			string = string + ("\nDia " + (cont+1) + ": ") + temp[cont];
		}
		return string;
	}
	
	public float media() {
		float media = 0;
		for (int cont = 0; cont < dia; cont++) {
			media = media + temp[cont];
		}
		media = media / dia;
		return media;
	}
	
	public double minima( ) {
		double min = 9999999;
		
		for (int cont = 0; cont < dia; cont++) {
			if (temp[cont] < min) {
				min = temp[cont];
			}
		}
		
		return min;
	}
	
	public double maxima() {
		double max = 0;
		
		for (int cont = 0; cont < dia; cont++) {
			if (temp[cont] > max) {
				max = temp[cont];
			}
		}
		
		return max;
	}
}
