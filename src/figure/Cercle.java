package figure;

import java.util.Scanner;

	public class Cercle extends Figure{
	private double rayon;
	
	public static double getSaisieRayon(final Scanner sc){
		System.out.println("Saisir le rayon");
		return sc.nextDouble();
	}
	
	public Cercle (double rayon){
		this.rayon = rayon;
		calculPerimetre();
		calculSurface();
	}
	public void calculSurface(){
		this.surface = Math.PI*rayon*rayon;
	}
	public void calculPerimetre(){
		this.perimetre = 2*Math.PI*rayon;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
}
