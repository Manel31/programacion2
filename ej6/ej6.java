package Array6;

public class ej6 {

	public static void main(String[] args) {
		
		double[] decimal = new double[10];
		
		for (int cont = 0; cont < 10; cont++) {
				double random = (double) (Math.random()*1);
				decimal[cont] = random;
			
		System.out.println("Se ha guardado el " +decimal[cont]+ " en la posición "+cont);
	}

}
}
