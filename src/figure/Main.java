package figure;

import java.util.Scanner;

public class Main {
	private static final Scanner sc = new Scanner(System.in);
	
	public static void menu(){
		System.out.println("==============================");
		System.out.println("=============MENU=============");
		System.out.println("==============================");
		System.out.println("1- Créer un carré");
		System.out.println("2- Créer un cercle");
		System.out.println("3- Créer un rectangle");
		System.out.println("4- Créer un carré bis");
	}
	public static boolean continuer(){
		System.out.println("Voulez vous continuer O/N?");
		String reponse = sc.next();
		return reponse.equals("O");
	}
	
	public static void faireAction(){
		Main.menu();
		
		int action = sc.nextInt();
		switch (action){
		case 1 :
			double cote = Carre.getSaisieCote(sc);
			Carre c1 = new Carre(cote);
			System.out.println("La surface de votre carré est: "+c1.getSurface());
			System.out.println("Le périmètre de votre carré est: "+c1.getPerimetre());
			if (continuer() == true)
					faireAction();
			break;
		
		case 2 :
			double rayon = Cercle.getSaisieRayon(sc);
			Cercle c2 = new Cercle(rayon);
			System.out.println("La surface de votre cercle est: "+c2.getSurface());
			System.out.println("Le périmètre de votre cercle est: "+c2.getPerimetre());
			if (continuer() == true)
				faireAction();
			break;
		
		case 3 :
			double longueur = Rectangle.getSaisieLongueur(sc);
			double largeur = Rectangle.getSaisieLargeur(sc);
			Rectangle c3 = new Rectangle(longueur,largeur);
			System.out.println("La surface de votre rectangle est: "+c3.getSurface());
			System.out.println("Le périmètre de votre rectangle est: "+c3.getPerimetre());
			if (continuer() == true)
				faireAction();
			break;
			
		case 4 :
			double cote1 = Carre.getSaisieCote(sc);
			double cote2 = Carre.getSaisieCote(sc);
			try{
				if (cote1!=cote2) throw new Exception("Les côtés ne sont pas égaux.");
				Carre c4 = new Carre(cote1,cote2);
				System.out.println("La surface de votre carré est: "+c4.getSurface());
				System.out.println("Le périmètre de votre carré est: "+c4.getPerimetre());
				
			}
			catch(Exception e){
				System.err.println(e);
			}
			if (continuer() == true)
				faireAction();
			break;
		
			
		default : 
			System.out.println("Choix incorrecte!");
			faireAction();
			break;
	}
	}
	
	public static void main(String[] args) {
		faireAction();
		
	/*	System.out.println(continuer());
		
		
		
	
		
		Cercle c1 = new Cercle(rayon);
		
		System.out.println(c1.getPerimetre());
		System.out.println(c1.getSurface());
		
		double cote = 5;
		Carre c2 = new Carre(cote);
		System.out.println(c2.getPerimetre());
		System.out.println(c2.getSurface());
		
		double longueur = 5;
		double largeur = 6;
		Rectangle c3 = new Rectangle(longueur,largeur);
		System.out.println(c3.getPerimetre());
		System.out.println(c3.getSurface());
		*/
		
	}

}
