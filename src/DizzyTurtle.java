import java.util.Random;

public class DizzyTurtle extends RaceTurtle{
	
	private int level;
	
	public DizzyTurtle(RaceWindow w, int nbr, int level){
		super(w, nbr);
		this.level = level;
	}
	
	public void raceStep (){
		Random rand = new Random();
		left(level * rand.nextInt(2));
		super.raceStep();
	
	}
	public String toString(){
		return super.toString() + " - DizzyTurtle (Yrsel: " + level + ")";
	}
}
