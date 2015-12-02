package PaquetA;
 
public class Formes {
     
      // Méthode qui fait une pause d'un délai en milliseconde
      public static void pause(long delai){
            long t=System.currentTimeMillis();
            while( (System.currentTimeMillis()-t)<delai);
            }// Fin de pause.
     
      // Méthode qui saut un nombres de lignes données.
      public static void sautlignes(int a){
            System.out.println();
            for (int i = 0; i < a; i++) {
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");        
            }
            System.out.println();
      }// Fin de sautlignes
     
      // Méthodes qui renvoie le nombre de caratères d'un entier.
      public static int longueur (int p){
            String aux=String.valueOf(p);
            int nb=aux.length();
            return nb;
      }// Fin de longueur
     
}// Fin de Formes