package arranque;

import arranque.Temperaturas;

public class Ppal {

	public static void main(String[] args) {
		
		
		RegistroMes r1=new RegistroMes(); //Creando el Registro del mes con el constructor por defecto
		e1.setMes("Enero");
		r1.setAno(2020);
		
		Temperaturas t1=new Temperaturas(); //Creando el array t1 en el que guardaremos las temperaturas para después asignarlas al RegistroMes r1
		t1.leer();
		
		e1.setTemp(t1);
		e1.mostrar();
		

	}

}
