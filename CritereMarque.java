package tp7;

public class CritereMarque implements Critere {
	public String marque ;
	
	public CritereMarque(String marque) {
		this.marque = marque;
	}

	public boolean estSatisfaitPar(Voiture v) {
		if(v.getMarque().equals(this.marque)) {
			return true;
			
		}
		else 
			return false;
		
	}
}
