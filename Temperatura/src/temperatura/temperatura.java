package temperatura;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int NP = 1, mediaP = 0, NN = 1, mediaN = 1;
		Scanner sc = new Scanner(System.in);
		int [] temperatura = new int[10];
		
		
		
		for(int cont = 0; cont < 10; cont++) {
			temperatura [cont] = sc.nextInt();
			if (temperatura [cont] > 0) {
				NP++;
				mediaP = mediaP + temperatura [cont];
			}else {
				NN++;
				mediaN = mediaN + temperatura [cont];
			}
		}
		mediaP = mediaP/NP;
		mediaN = mediaN/NN;
		
		if(NN == 1) {
			mediaN = 0;
		}
		
		System.out.println("La media positiva es : "+mediaP);
		System.out.println("La media negativa es : "+mediaN);
	}

}
