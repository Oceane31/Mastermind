import java.awt.Color;
import java.util.Random;

public class Mod�le {
	static Color[] couleurs = {Color.yellow, Color.green, Color.blue, Color.magenta, Color.red, Color.orange,Color.white,Color.black};
	static int n_tentatives=10;
	static int difficult�=4;
	enum Etats {EN_COURS,GAGNE,PERDU};
	Rang�e[] propositions;
	Etats �tat;
	int tentative;
	Rang�e combinaison;
	
	
	public Mod�le() {
		this.�tat=Etats.EN_COURS;
		this.tentative=0;
		this.propositions=new Rang�e[n_tentatives];
		this.propositions[this.tentative]=new Rang�e();
		this.combinaison=new Rang�e();
		Random random=new Random();
		int i;
		for (i=0; i<this.difficult�;i++) {
			int nb=random.nextInt(couleurs.length);
			this.combinaison.jetons[i]=couleurs[nb];
		}
		
		
	}

}
