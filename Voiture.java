package tp7;

public class Voiture {
	private String  marque,modele;
	public Voiture(String marque, String modele, int anp, int pl) {
		this.marque = marque;
		this.modele = modele;
		this.anp = anp;
		this.pl = pl;
	}
	private int anp,pl;
	public String toString() {
		return "la marque de voiture est "+this.marque+" de modéle "+this.modele+" avec un prix : "+this.pl;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getAnp() {
		return anp;
	}
	public void setAnp(int anp) {
		this.anp = anp;
	}
	public int getPl() {
		return pl;
	}
	public void setPl(int pl) {
		this.pl = pl;
	}
	
	
}

