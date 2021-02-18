import java.awt.Color;
import java.util.Random;

public class Modèle {
	static Color[] couleurs = {Color.yellow, Color.green, Color.blue, Color.magenta, Color.red, Color.orange,Color.white,Color.black};
	static int n_tentatives=10;
	static int difficulté=4;
	enum Etats {EN_COURS,GAGNE,PERDU};
	Rangée[] propositions;
	Etats état;
	int tentative;
	Rangée combinaison;
	
	
	public Modèle() {
		this.état=Etats.EN_COURS;
		this.tentative=0;
		this.propositions=new Rangée[n_tentatives];
		this.propositions[this.tentative]=new Rangée();
		this.combinaison=new Rangée();
		Random random=new Random();
		int i;
		for (i=0; i<this.difficulté;i++) {
			int nb=random.nextInt(couleurs.length);
			this.combinaison.jetons[i]=couleurs[nb];
		}
		
		
	}

}
