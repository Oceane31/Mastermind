import java.awt.Color;

public class Rangée {

	Color [] jetons;
	int indiceJeton;
	int nbnoirs,nbblancs;
	
	public Rangée () {
		this.jetons = new Color[Modèle.difficulté];
		this.indiceJeton=0;
		this.nbnoirs=0;
		this.nbblancs=0;
	}
	
}
