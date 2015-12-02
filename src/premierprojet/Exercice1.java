package premierprojet;
import java.util.Scanner;
public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 	
 		char ch='0' ;
 		char rep='0';
 		
 		System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
		 	System.out.println("-------------------------------------------------");
 	do {
 			ch='0';
 	 		while (ch!='1' && ch!='2') {
 	 	 		System.out.println("Choisissez le mode de convertion :");
 	 	 		System.out.println("1 - Convertisseur CELSIUS - FAHRENHEIT");
 	 	 		System.out.println("2 - Convertisseur FAHRENHEIT - CELSIUS");
 	 	 		ch = sc.nextLine().charAt(0);
 			}
 	 		
 	 		System.out.println("Température à convertir :");
 	 		float temp = sc.nextFloat();
 	 		if (ch=='1') {
 	 			System.out.println(temp +" C correspond à "+ ((9*temp)/5+32)+" F");
 			} else {
 				System.out.println(temp +" F correspond à "+ ((temp-32)*5)/9+" C");
 			}
 	 			sc.nextLine();// penser a vider la ligne lue.
 	 			System.out.println("Souhaitez vous convertir une autre température: O/N");
 	 			rep = sc.nextLine().charAt(0);
 	 			
 	} while (rep=='O');
 	System.out.println("Au revoir.");
	}// fin du main
}// fin de la classe Exercice1
