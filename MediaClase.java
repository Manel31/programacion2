package MClase;

import java.util.Scanner;

public class MediaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alumnos; 
		float summ = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introducir numero de alumnos");
		alumnos = sc.nextInt();
		float [] notas = new float[alumnos];
		
		for(int cont = 0; cont < notas.length; cont++) {
			
			System.out.println("Introduzca la nota del alumno "+(cont+1));
			notas[cont] = sc.nextInt();
			
			summ = summ + notas[cont];
		}
		float media = summ/notas.length;
		System.out.println("Esta es la media de las notas de los alumnos " + media);
		System.out.println("Alumnos con la nota mas alta que la media: ");
		for(int cont = 0; cont < notas.length; cont++) {
			if(notas[cont]>media) {
				System.out.println("El alumno "+(cont+1)+": "+notas[cont]);
			}
		}
	}

}
