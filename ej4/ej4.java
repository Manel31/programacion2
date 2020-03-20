package Array4;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diez = 10, cont = 0, contp = 0, contn = 0, cont0 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca "+diez+ " numeros");
		int[] pn = new int[10];
		
		for(cont = 0; cont < diez; cont++) {
			pn[cont] = sc.nextInt();
				if(pn[cont]>0) {
					contp++;
				} else if(pn[cont]<0) {
					contn++;
				}else {
					cont0++;
				}
		}
		System.out.println("Entre los 10 numeros que ha introducido hay: "+contp+" positivo/s, "+contn+" negativo/s y "+cont0+" que sean 0.");
	}

}
