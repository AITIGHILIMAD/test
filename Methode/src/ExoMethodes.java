import java.util.Scanner;

public class ExoMethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Veillez saisir un nombre :" );
		int nombre1 = sc.nextInt();
		System.out.println("Veillez saisir l'operation :" );
		String operation = sc.next();
		System.out.println("Veillez saisir un deuxieme nombre :" );
		int nombre2 = sc.nextInt();
		
		int resultat = 0;
		if (operation.equals("+")) {
			resultat = addition(nombre1, nombre2) ;
		}else if(operation.equals("-") ) {
			resultat = soustraction(nombre1, nombre2) ;
		
		}else if(operation.equals("*") ) {
			resultat = multiplication(nombre1, nombre2) ;
			
		}else if(operation.equals("/")) {
			resultat = division(nombre1, nombre2) ; 
			
			
		}
		System.out.println("le resultat de l'operation est : " + resultat ) ;
	}

	
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
	
	
	
}
