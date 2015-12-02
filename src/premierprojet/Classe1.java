package premierprojet;

import java.util.Scanner;

// demander un nombre entier à l'utilisateur
// s'il est pair le diviser par deux.
// s'il est impaire le multiplier par 3 et ajouter 1.
// et ansi de suite tant que cette suite n'affiche pas 1.
// afficher tous les termes de la suite. 

public class Classe1 {

	 	public static void main(String[] args) {
	 		
	 		int cpt = 0;
	 		int alt = 0; 
	 		System.out.println("saisir un nombre :");
	 		Scanner sc = new Scanner(System.in);
	 		int nb = sc.nextInt();
	 		alt = nb;
	 		while (nb != 1) {
				
			
	 		if (nb%2 == 0){
				nb = nb/2;
			} else {
				nb = nb * 3 + 1;
			}
	 		if (nb > alt) {
				alt = nb;
			} 
	 System.out.print(nb+ " ");
	 cpt = cpt + 1;
	 if (cpt %10 == 0 ) {
		System.out.println();
	}
	 
	 		}//fin du while	
	 		System.out.println();
	 	System.out.println("la durée du vol est de : "+cpt);
	 	System.out.println("l'altitude est de : "+alt);
	 	
	 	
	 }//Accolade fermante de main
} // Accolade de la Classe Classes1
	

	
	
