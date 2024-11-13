package tp7;

public class CriterePrix implements Critere {
	public int prix;
	
	public CriterePrix(int prix) {
		this.prix = prix;
	}

	public boolean estSatisfaitPar(Voiture v) {
		if(v.getPl()<this.prix) {
			return true;
			
		}
		else 
			return false;
		
	}

}
