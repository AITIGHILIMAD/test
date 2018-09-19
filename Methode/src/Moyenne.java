
public class Moyenne {

	public static void main(String[] args) {
		float noteJava = 15f ; 
		float noteHtml = 13f ; 
		float noteJavascript = 9f ; 
		float noteCss = 2f ;


		int coefJava = 3 ; 
		int coefHtml = 2; 
		int coefJavascript = 3 ; 
		int coefCSs = 1;

		float moyenne = ((noteJava * coefJava ) 
				+ (noteHtml * coefHtml) 
				+ (noteJavascript * coefJavascript) 
				+ (noteCss * coefCSs)) 
				/ (coefJava + coefHtml + coefJavascript + coefCSs);



		System.out.println("La moyenne est : " + moyenne);

		if(moyenne > 18) {
			System.out.println("Très bien");
		}else if(moyenne > 15) {
			System.out.println("Bien");
		}else if(moyenne > 12) {
			System.out.println("Assez bien");
		}else if(moyenne > 10) {
			System.out.println("Moyen");
		}else if(moyenne > 8) {
			System.out.println("Il peut faire mieux");
		}else if(moyenne > 5) {
			System.out.println("Il faut plus de travail");
		}else {
			System.out.println("A l’année prochaine, même heure, même endroit ;)");
		}


		if (moyenne < 15) {

			System.out.println("La moyenne est < 15");
			coefJava = 1 ; 
			coefHtml = 3; 
			coefJavascript = 2 ; 
			coefCSs = 3;

			moyenne = ((noteJava * coefJava ) 
					+ (noteHtml * coefHtml) 
					+ (noteJavascript * coefJavascript) 
					+ (noteCss * coefCSs)) 
					/ (coefJava + coefHtml + coefJavascript + coefCSs);



			System.out.println("La moyenne est : " + moyenne);

			if(moyenne > 18) {
				System.out.println("Très bien");
			}else if(moyenne > 15) {
				System.out.println("Bien");
			}else if(moyenne > 12) {
				System.out.println("Assez bien");
			}else if(moyenne > 10) {
				System.out.println("Moyen");
			}else if(moyenne > 8) {
				System.out.println("Il peut faire mieux");
			}else if(moyenne > 5) {
				System.out.println("Il faut plus de travail");
			}else {
				System.out.println("A l’année prochaine, même heure, même endroit ;)");
			}


		}
		if (moyenne < 10) {
			System.out.println("La moyenne est < 10");
			coefJava = 5 ; 
			coefHtml = 6; 
			coefJavascript = 4 ; 
			coefCSs = 3;
			moyenne = ((noteJava * coefJava ) 
					+ (noteHtml * coefHtml) 
					+ (noteJavascript * coefJavascript) 
					+ (noteCss * coefCSs)) 
					/ (coefJava + coefHtml + coefJavascript + coefCSs);



			System.out.println("La moyenne est : " + moyenne);

			if(moyenne > 18) {
				System.out.println("Très bien");
			}else if(moyenne > 15) {
				System.out.println("Bien");
			}else if(moyenne > 12) {
				System.out.println("Assez bien");
			}else if(moyenne > 10) {
				System.out.println("Moyen");
			}else if(moyenne > 8) {
				System.out.println("Il peut faire mieux");
			}else if(moyenne > 5) {
				System.out.println("Il faut plus de travail");
			}else {
				System.out.println("A l’année prochaine, même heure, même endroit ;)");

			}
		}
	}

}
