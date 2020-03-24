package Array5;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int posi1 = 0, posi2 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero 10");
		max = sc.nextInt();
		
		String[] nombres = new String[max];
		int[] sueldos = new int [max];
		
		System.out.println("Introduce 10 nombres");
		for(int cont = 0; cont < max; cont++) {
			nombres[cont] = sc.next();
		}
		
		System.out.println("Introducir 10 sueldos");
		for(int cont = 0; cont < max; cont++) {
			sueldos[cont] = sc.nextInt();
			if(sueldos[cont]>posi1) {
				posi1 = sueldos[cont];
				posi2 = cont;
			}
		}
		System.out.println("Empleado con sueldo mas alto: " + nombres[posi2] + " " + sueldos[posi2]);
		sc.close();
	}

}
