//Autor : Manel Sebastián Álvarez
package packev5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioTotalPerec = 0;
		double precioTotalNOPerec = 0;
		
		Producto prod[]=new Producto[10];
		prod[0] = new Perecedero("Yogurt", 1, 1, 10);
		prod[1] = new Perecedero("Cheetos", 3, 2, 10);
		prod[2] = new Perecedero("Helado", 5, 3, 10);
		prod[3] = new Perecedero("Flan", 2, 1, 10);
		prod[4] = new Perecedero("Fuet", 3, 2, 10);
		prod[5] = new NoPerecedero("Pan", 3, "Integral");
		prod[6] = new NoPerecedero("Agua", 1, "Natural" );
		prod[7] = new NoPerecedero("Casalla", 11, "Anis Tenis" );
		prod[8] = new NoPerecedero("V.Tinto", 8, "Don Simon" );
		prod[9] = new NoPerecedero("Piña", 4, "Tropical" );
		
		for(int cont = 0; cont < prod.length; cont++) {
			if(prod[cont] instanceof Perecedero) {
				precioTotalPerec = precioTotalPerec + prod[cont].precio;
			}
			if(prod[cont] instanceof NoPerecedero) {
				precioTotalNOPerec = precioTotalNOPerec +prod[cont].precio;
			}
		}
		//Probando que el metodo calcular iba bien,
		prod[0].calcular(2);
		
		
		System.out.println("El precio total de los productos perecederos es "+precioTotalPerec);
		System.out.println("El precio total de los productos perecederos es "+precioTotalNOPerec);
	}

}
