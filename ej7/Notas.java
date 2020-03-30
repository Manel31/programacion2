package Arrat7;

import java.util.Scanner;

public class Notas {
	
	private float[] notas = new float[10];
	float media = 0;
	Scanner sc = new Scanner(System.in);
		
	public Notas() {
	}
	
	
	public void Mostrar() {
		for (int cont = 0; cont < 5; cont++) {
			System.out.print("\nLa nota de la asignatura asignatura nº" + (cont+1) + ": " + notas[cont]);
			System.out.println("");
		}
	}
	
	public void leer() {
		media = 0;
		for (int cont = 0; cont < 5; cont++) {
			System.out.print("Introduce la nota de la asignatura numero " + (cont+1) + ": ");
				notas[cont] = sc.nextFloat();
				media = media + notas[cont];
		}
	}
	
	public float media() {
		return media/5;
	}	
}