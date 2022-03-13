package centroEducativo;

public class Main {

	public static void main(String[] args) {
		
		Profesor p1 = new Profesor ("Carlos Robles","49144798P","Calle Ugena",608518839, "Matematicas y Lengua");
		Alumno p2 = new Alumno ("Alicia Perez", "5458745H","Calle Illescas",77777564,"1º BACH");
		Administrativo p3 = new Administrativo ("Rosa Perez","8792485X","Calle Madrid",678994648,"Gestionar matriculas");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println("\n");
		System.out.println(p1.trabajar());
		System.out.println(p2.trabajar());
		System.out.println(p3.trabajar());
		System.out.println("\n");
		System.out.println(p1.llamar()+p2.getNombre());
		System.out.println(p3.llamar() + p1.getNombre());
		System.out.println("\n");
		
		

	}

}
