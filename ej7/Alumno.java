package Arrat7;

public class Alumno {

	private Notas notaAlumno;
	private String nombre;
	private int nExp;
	
	public Alumno() {
	}
	
	public Alumno(Notas notaAlumno, String nombre, int nExp) {
		this.notaAlumno = notaAlumno;
		this.nombre = nombre;
		this.nExp = nExp;
	}
	
	
	public Notas getNotaAlumno() {
		return notaAlumno;}

	public void setNotaAlumno(Notas notaAlumno) {
		this.notaAlumno = notaAlumno;}

	public String getNombre() {
		return nombre;}

	public void setNombre(String nombre) {
		this.nombre = nombre;}

	public int getnExp() {
		return nExp;}

	public void setnExp(int nExp) {
		this.nExp = nExp;}

	
	public String toString() {
		String string = null;
		float media = 0;
		media = notaAlumno.media();
		string = "\nEl alumno " + nombre + ". Su nº de Exp " + nExp + ".";
			System.out.println(string);
		notaAlumno.Mostrar();
			System.out.println("Su media es de : " + media+ " / 10.0");
		
		
	return string;
	}
}
