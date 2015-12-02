package PaquetA;
import java.util.Scanner;
public class Principale {
 
      public static void main(String[] args) {
    	  
        
    	 
           Methode.Syracuse();
           Formes.sautlignes(2);
      
           Methode.Conversion();
           Formes.sautlignes(2);
           Methode.Premier();
           Formes.sautlignes(2);

           System.out.println("Donner le nombre de lignes de la Table de Pytagore à afficher :");
           int n=new Scanner(System.in).nextInt();
           Pythagore.PythagoreBis(n);
     
           
      }// Fin du main
}// FIn de Principale
