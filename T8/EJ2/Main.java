//Autor : Manel Sebastian Alvarez
package EJ2;

public abstract class Main {

	public static void main(String[] args) {

		publicaciones[] publi = new publicaciones[3];
		libros libro = new libros(31, 2001, false, "JRR Tolkien");
		revistas revista = new revistas(20, 2020, false, 12);
		libros libro1 = new libros(31, 1997, true, "Lucia Garcia");
		
		publi[0] = libro;
		publi[1] = revista;
		publi[2] = libro1;
		

	}

}
