package figure;

public abstract class Figure implements IFigure{

	protected double surface;
	protected double perimetre;
	protected String couleur;
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	public double getPerimetre() {
		return perimetre;
	}
	public void setPerimetre(double perimetre) {
		this.perimetre = perimetre;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
