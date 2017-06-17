import java.util.Random;

public class AbsentMindedTurtle extends RaceTurtle {

	private int absentLevel;

	public AbsentMindedTurtle(RaceWindow w, int nbr, int absentLevel) {
		super(w, nbr);
		this.absentLevel = absentLevel;
		

	}

	public void raceStep (){
		Random rand = new Random();
		if (absentLevel < rand.nextInt(100)+1){
		super.raceStep();
		}
		}
	
	public String toString(){
		return super.toString() + " - AbsentMindedTurtle(" + absentLevel + ")% Frånvarande";
	}
}