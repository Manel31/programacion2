package packej0;

public class Estudiante extends Persona{


		private int NumExpediende;
		private String CursoActual;
		private double [] Notas = new double [7];
		
		public Estudiante(String nombre, int edad, String CursoActual, int NumExpediente) {
			this.nombre = nombre;
			this.edad = edad;
			this.NumExpediende = NumExpediente;
			this.CursoActual = CursoActual;
		}
		
		public int getNumExpediende() {
			return NumExpediende;
		}
		public void setNumExpediende(int numExpediende) {
			NumExpediende = numExpediende;
		}
		public String getCursoActual() {
			return CursoActual;
		}
		public void setCursoActual(String cursoActual) {
			CursoActual = cursoActual;
		}
		public double[] getNotas() {
			return Notas;
		}
		public void setNotas(double[] notas) {
			Notas = notas;
		}
		
		public double getNotaMedia() {
			
			double NotaMedia = 0;
			for (int cont = 0; cont < Notas.length; cont++) {
				NotaMedia = NotaMedia + Notas[cont];
				}
				NotaMedia = NotaMedia/7;
				return NotaMedia;
			
				
		}
}
