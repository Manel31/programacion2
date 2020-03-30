package String8_1;

import java.util.Scanner;

public class S8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 1, pos;
		String frase, auxiliar="";
		
		System.out.println("Introduzir una frase");
		Scanner sc=new Scanner(System.in);
		frase=sc.nextLine();
				
		    frase = frase.trim();
		    if (frase.isEmpty()) { 
		        cont = 0;
		    } else {
		            pos = frase.indexOf(" "); 
		            while (pos != -1) { 
		                   cont++; 
		                   pos = frase.indexOf(" ", pos + 1);
    }                                              
 }
 System.out.println("La frase intruducida, "+ frase + ",  contiene "+ cont +" palabras");
	}

}
