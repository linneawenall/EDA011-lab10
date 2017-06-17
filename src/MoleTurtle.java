import java.util.Random;

public class MoleTurtle extends RaceTurtle {

	public MoleTurtle(RaceWindow w, int nbr) {
		super(w, nbr);
	

	}

	public void raceStep() {
		Random rand = new Random();
		int upOrDown = rand.nextInt(6);
		if (upOrDown > 4) {
			penUp();
		} else  {
			penDown();
			super.raceStep();
			
		}
	}
	
	public String toString(){
		return super.toString() + " - MoleTurtle";
}
}
