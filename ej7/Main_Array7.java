package Arrat7;

public class Main_Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notas notas1 = new Notas();
		Notas notas2 = new Notas();
		
		notas1.leer();
		
		Alumno alumno1 = new Alumno(notas1, "Manel", 57958);
		alumno1.toString();
		
		notas2.leer();
		
		Alumno alumno2 = new Alumno(notas2, "Juanan", 598632);
		alumno2.toString();
		
		//Me salian errores en el constructor por defecto, asi que hice los dos parametrizados.
	}
}


