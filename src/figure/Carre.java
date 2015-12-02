package figure;

import java.util.Scanner;

public class Carre extends Rectangle{

	public Carre (double cote1, double cote2){
		super(cote1, cote2);
	}

	public Carre (double cote) {
		super (cote,cote);
	}
	
	public static double getSaisieCote(final Scanner sc){
		System.out.println("Saisir le coté");
		return sc.nextDouble();
	}

}
