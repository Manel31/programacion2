package packej0;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante e1 = new Estudiante("Juan", 20, "1º DAM",12345);
		double[] Notas = new double[7];
		Notas[0] = 5;
		Notas[1] = 5;
		Notas[2] = 7;
		Notas[3] = 8;
		Notas[4] = 6;
		Notas[5] = 10;
		Notas[6] = 9;
		e1.setNotas(Notas);
		
		Profesor p1 = new Profesor("Fernando", 45, "Despacho D104");
		p1.setHorarioTutorias("Lunes de 10:00 a 13:00");
		
		System.out.println(e1.getNombre()+" tiene una media de "+e1.getNotaMedia()+" /10" );
		p1.getConsultas();
	}

}
