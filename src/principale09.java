import java.util.Scanner;


public class principale09 {

	static double prixSolder (double prixArticle,double tauxSolde){
		double prixSolde;
		prixSolde = (1 - tauxSolde/100)*prixArticle;
		return prixSolde;
	}
	
	public static void main(String[] args) {
		double prixArticle = 0., tauxSolde =0.;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println(" Pour saisir un chiffre decimal utilise la virgule");
		System.out.println("Combien coute votre article ?");
		prixArticle = clavier.nextDouble();
		System.out.println("Quel est le taux de reduction ?");
		tauxSolde = clavier.nextDouble();
		clavier.close();
		
		System.out.println("Le prix de l'article soldé est de "+ prixSolder(prixArticle, tauxSolde)+ "€");
		

	}

}
