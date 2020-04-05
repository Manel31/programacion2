package packev4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioTotalLavadora = 0;
		double precioTotalElectrodomestico = 0;
		double precioTotalTelevision = 0;
		
		Electrodomestico electro[]=new Electrodomestico[10];
		electro[0] = new Lavadora(6, 500, 20, "negro", 'F');
		electro[1] = new Electrodomestico();
		electro[2] = new Television();
		electro[3] = new Lavadora(7, 1250, 63, "blanco", 'F');
		electro[4] = new Lavadora(9, 850, 45, "rojo", 'F');
		electro[5] = new Television();
		electro[6] = new Electrodomestico();
		electro[7] = new Lavadora(2, 785, 25, "azul", 'F');
		electro[8] = new Television();
		electro[9] = new Electrodomestico();	
		for(int cont = 0; cont < electro.length; cont++) {
			if(electro[cont] instanceof Electrodomestico) {
				precioTotalElectrodomestico = precioTotalElectrodomestico +electro[cont].precioFinal();
			}
			if(electro[cont] instanceof Television) {
				precioTotalTelevision = precioTotalTelevision +electro[cont].precioFinal();
			}
			if(electro[cont] instanceof Lavadora) {
				precioTotalLavadora = precioTotalLavadora +electro[cont].precioFinal();
			
		}
		}
		System.out.println(precioTotalLavadora);
		System.out.println(precioTotalElectrodomestico);
		System.out.println(precioTotalTelevision);
	}
}
