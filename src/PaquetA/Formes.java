package PaquetA;
 
public class Formes {
     
      // M�thode qui fait une pause d'un d�lai en milliseconde
      public static void pause(long delai){
            long t=System.currentTimeMillis();
            while( (System.currentTimeMillis()-t)<delai);
            }// Fin de pause.
     
      // M�thode qui saut un nombres de lignes donn�es.
      public static void sautlignes(int a){
            System.out.println();
            for (int i = 0; i < a; i++) {
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");        
            }
            System.out.println();
      }// Fin de sautlignes
     
      // M�thodes qui renvoie le nombre de carat�res d'un entier.
      public static int longueur (int p){
            String aux=String.valueOf(p);
            int nb=aux.length();
            return nb;
      }// Fin de longueur
     
}// Fin de Formes