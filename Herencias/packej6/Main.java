package packej6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		empleado emple = new empleado("Jonnhy", 25, 1800);
		System.out.println(emple.toString());
		
		comercial com = new comercial("Joseph", 23, 1200, 100);
		System.out.println(com.toString());
		
		repartidor rep = new repartidor("Jonathan", 45, 43, "zona2");
		System.out.println(rep.toString());
		
	}

}
