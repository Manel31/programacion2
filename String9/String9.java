package String9;

import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("El String introducido por el usuario es:");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		frase = frase.trim();
		
		String[] fraseArray = frase.split(" ");
		
		System.out.println("Después de eliminar la ultima palabra, la frase que queda es:");
		
		for(int cont = 0; cont < fraseArray.length-1; cont++) {
			System.out.print(fraseArray[cont] + " ");
		}
	}

}
