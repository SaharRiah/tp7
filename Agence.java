package tp7;

public class Agence {
	public Voiture [] voitures;
	public int nbrv=0;
	private int cap;
	public Agence( int cap) {
		this.cap = cap;
		voitures=new Voiture[cap];
	}
	public void ajout(Voiture v) {
		if(nbrv<cap) {
			this.voitures[nbrv]=v;
			nbrv++;
		}
		
		
	}
	public void afficheSelection(Critere c) {
		for(int i=0;i<nbrv;i++) {
			if(c.estSatisfaitPar(voitures[i]) ) {
				System.out.println(voitures[i]);
				
			}
		}
		
	}
	
	

}
