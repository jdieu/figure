package methodes;

public class Ecran {

	public String reference;
	public boolean etat;
	public static int nbEcran;
	
	
	
	public Ecran() {
		nbEcran++;
	}
	
	public Ecran(String reference) {
		nbEcran++;
		this.reference = reference;
	}

	public void allumer(){
		etat = true;
	}
	public void eteindre(){
		etat = false;
	}
}
