package tp7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agence a=new Agence(50);
		Voiture v1=new Voiture("BMW","aaa",2020,200);
		Voiture v2=new Voiture("renault","aaa",2010,90);
		Voiture v3=new Voiture("clio","aaa",2010,80);
		a.ajout(v1);
		a.ajout(v2);
		a.ajout(v3);
		CriterePrix cp=new CriterePrix(100);
		CritereMarque cm=new CritereMarque("clio");
		System.out.println("**************prix<100****************");
		a.afficheSelection(cp);
		System.out.println("**************marque = clio**************");
		a.afficheSelection(cm);


		
		
		

	}

}
