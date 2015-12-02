package PaquetA;
import java.util.Scanner;
public class Methode {
      public static void Syracuse() {
            // demander un nombre entier à l'utilisateur
            // s'il est pair le diviser par deux.
            // s'il est impaire le multiplier par 3 et ajouter 1.
            // et ansi de suite tant que cette suite n'affiche pas 1.
            // afficher tous les termes de la suite.
      int cpt = 0;
     int alt = 0;
      System.out.println("saisir un nombre :");
     Scanner sc = new Scanner(System.in);
     int nb = sc.nextInt();
     alt = nb;
     while (nb != 1) {
            if (nb%2 == 0){ nb = nb/2;
            } else { nb = nb * 3 + 1;
            }
           if (nb > alt) { alt = nb;
            }
     System.out.print(nb+ " ");
     cpt = cpt + 1;
     Formes.pause(100);
     if (cpt %10 == 0 ) { System.out.println();
     }
     }//fin du while  
     System.out.println();
     System.out.println("la durée du vol est de : "+cpt);
     System.out.println("l'altitude est de : "+alt);
      }// Fin de Syracuse
     
     
      public static void Conversion(){
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
           if (ch=='1') { System.out.println(temp +" C correspond à "+ ((9*temp)/5+32)+" F");
           } else { System.out.println(temp +" F correspond à "+ ((temp-32)*5)/9+" C");
           }
           sc.nextLine();// penser a vider la ligne lue.
           System.out.println("Souhaitez vous convertir une autre température: O/N");
           rep = sc.nextLine().charAt(0);                
      } while (rep=='O');
     System.out.println("Au revoir.");
      }// Fin de Conversion
 
     
      public static void Premier(){
      int borne, compteur=2;
      boolean premier=true;
      System.out.println("Saisir un nombre entier positif plus grand que 3 : ");
      borne = new Scanner (System.in).nextInt();
      System.out.println("Les nombres entiers plus petits que "+borne+" sont : ");
      System.out.print( "1 2 ");
      for (int n=3;n<=borne;n++){// Pour chaque nombre plus petit que le nombre donné.
            for (int k = 2; k <n; k++) {// Je le divise par tout les entiers qui lui sont inférieurs
           if (n%k==0) {premier=false;// si la division tombe juste c'est qu'il n'est pas premier
                 }
           }// Fin du For k
           if (premier) {//s'il est resté premier
           System.out.print(n+" ");// je l'affiche
           compteur=compteur+1; // En plus je compte les nombres premier
            if (compteur%15==0) {System.out.println(); // histoire d'aller à la ligne de temps en temps ici tout tout les 15 nombres
                                        }
                 }else {premier=true; // Sinon je remet premier à vrai pour le nombre suivant.
                  }
      } // Fin du For n
      }// de Premier
 
}
