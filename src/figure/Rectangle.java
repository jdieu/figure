package figure;

import java.util.Scanner;

public class Rectangle extends Figure {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur,double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		calculPerimetre();
		calculSurface();
	}
	
	public static double getSaisieLongueur(final Scanner sc){
		System.out.println("Saisir la longueur");
		return sc.nextDouble();
	}
	
	public static double getSaisieLargeur(final Scanner sc){
		System.out.println("Saisir la largeur");
		return sc.nextDouble();
	}
	
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public void calculSurface() {
		this.surface = longueur*largeur;
	}

	@Override
	public void calculPerimetre() {
		this.perimetre = 2*(longueur+largeur);
		
	}

}
