package PaquetA;
 
public class Pythagore {
      public static void Pythagore(){// La déclaration d'un tableau ne sert à rien ici.
            int tab[][]= new int [11][11];
           
            for (int i = 0; i < tab.length; i++) {
                  for (int j = 0; j < tab.length; j++) {
                        tab[i][j]=i*j;
                        if (i*j<10) {System.out.print(" "+tab[i][j]+" ");
                        }else
                        System.out.print(tab[i][j]+" ");
                        }
                  System.out.println();
            }
      }// Fin de Pythagore
     
      public static void PythagoreBis(int n){// sans déclaration de tableau.
            //String maxn=String.valueOf((n+1)*(n+1));
            //int decin=maxn.length();
            int decin=Formes.longueur((n+1)*(n+1));
            int p=0, decip=0;
            for (int i = 1; i < n+1; i++) {
                  for (int j = 1; j < n+1; j++) {
                        p=i*j;
                        decip=Formes.longueur(p);
                        for (int k = 0; k < decin-decip; k++) {
                             Formes.pause(100);
                             System.out.print(" "); 
                        }
                        System.out.print(p+" ");
                  }
                  System.out.println();
            }
      }// Fin de PythagoreBis
 
}