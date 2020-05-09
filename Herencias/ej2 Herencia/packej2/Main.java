package packej2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor prof = new Profesor("Miguel", "3A");
		ProfesorEnfermo profEnf = new ProfesorEnfermo("Juan", "4A");
		
		prof.getConsultas();
		profEnf.getConsultas();
	}

}
