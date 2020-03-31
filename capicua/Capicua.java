package LaCapicua;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		
		System.out.println("Introduce una cadena:");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine().toLowerCase();
		palabra = palabra.trim();
		int cont2 = palabra.length()-1;
		
		boolean capicua = true;
		while (cont < cont2) {
			if(palabra.charAt(cont) != palabra.charAt(cont2))
				capicua = false;
				cont++;
				cont2--;
		}
		if(capicua) {
			System.out.println("La palabra introducida, "+palabra+", SÍ que es capicúa!");
		}else {
			System.out.println("La palabra introducida, "+palabra+", NO es capicúa!");
			
		}
	}

}
