
public class Mastermind {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modèle m=new Modèle();
		Contrôleur c = new Contrôleur(m);
		Vue v= new Vue(m,c);

	}

}
