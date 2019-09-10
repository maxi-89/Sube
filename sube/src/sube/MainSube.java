package sube;

public class MainSube {

	public static void main(String[] args) {
	Sube s1=new Sube ();
	
	System.out.println("mostrar saldo");
	System.out.println(s1.saldo());
	System.out.println("cargar 50 pesos");
	System.out.println(s1.cargar(50));
	System.out.println("mostrar nuevo saldo");
	System.out.println(s1.saldo());
	System.out.println("viajar");
	s1.viajar(20);
	System.out.println("mostrar nuevo saldo");
	System.out.println(s1.getSaldo());
	System.out.println("mostrar id");
	System.out.println(s1.getId());
	System.out.println(s1.toString());
<<<<<<< HEAD
	System.out.println(s1.getSaldo());
	System.out.println(s1.cargar(500));
	System.out.println(s1.getSaldo());
	System.out.println(s1.cargar(300));
	System.out.println(s1.saldo());
=======
//	
>>>>>>> branch 'master' of https://github.com/maxi-89/Sube.git
	

	}

}
