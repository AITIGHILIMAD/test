
public class methodes {

	public static void main(String[] args) {
		int soustraction2513 = soustraction(25, 13);
		System.out.println(soustraction2513);

		int soustraction4530 = soustraction(45, 30);
		System.out.println(soustraction4530);

		int soustraction2533 = soustraction(25, 33);
		System.out.println(soustraction2533);
		
		// soustraction ..........................................................................//
		
		int addition1215 = addition(12, 15);
		System.out.println(addition1215);

		int addition2516 = addition(25, 16);
		System.out.println(addition2516);

		int addition2533 = addition(25, 33);
		System.out.println(addition2533);
       // addition..................................................................................//
		
		int multiplication1215 = multiplication(12, 15);
		System.out.println(multiplication1215);

		int multiplication1516 = multiplication(15, 16);
		System.out.println(multiplication1516);

		int multiplication2533 = multiplication(25, 33);
		System.out.println(multiplication2533);
		
		//multiplication ..............................................................................//
		
		double division1215 = division(30, 15);
		System.out.println(division1215);

		double division1516 = division(19, 16);
		System.out.println(division1516);

		double division2533 = division(77, 33);
		System.out.println(division2533);
		
	}

	/*
	 * Déclaration de la méthode soustraction 
	 */
	public static int soustraction(int nombre1, int nombre2) {
		int resultat = nombre1 - nombre2;
		return resultat;
		

	}
	
	/*
	 * Déclaration de la méthode addition
	 */
		
	public static int addition(int nombre1, int nombre2) {
		int resultat = nombre1 + nombre2;
		return resultat;
		
		
	}

	/*
	 * Déclaration de la méthode multiplication
	 */
	public static int multiplication(int nombre1, int nombre2) {
		int resultat = nombre1 * nombre2;
		return resultat;
		
		
	}
	
	/*
	 * Déclaration de la méthode division
	 */
	public static int division(int nombre1, int nombre2) {
		int resultat = nombre1 / nombre2;
		return resultat;
	}
	
	public static double division(double nombre1, double nombre2) {
		double resultat = nombre1 / nombre2;
		return resultat;
	}
}



