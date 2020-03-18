package Array3;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		
		int num_lim = 20;		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introuzca "+num_lim+" numeros");
		int[] pares = new int[20];

		for (int cont = 0; cont < num_lim; cont++) {
			pares[cont] = sc.nextInt();
		}	
		for (int cont = 0; cont < num_lim; cont++) {
			if (pares[cont]% 2 == 0) {
				System.out.print(pares[cont]+ " ");
			}
		}
		sc.close();
	}

}
