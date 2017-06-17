import java.util.ArrayList;
import java.util.Random;

public class TurtleRace {
	public static void main(String[] args) {
		RaceWindow w = new RaceWindow();

		ArrayList<RaceTurtle> turtles = new ArrayList<RaceTurtle>();
		ArrayList<RaceTurtle> finished = new ArrayList<RaceTurtle>();
		for (int i = 0; i < 8; i++) {
			Random rand = new Random();
			int turtleType = rand.nextInt(3);
			if (turtleType == 0) {
				turtles.add(new MoleTurtle(w, (i + 1)));
				System.out.println(turtles.get(i));
			} else if (turtleType == 1) {
				int absentLevel = rand.nextInt(100) + 1;
				turtles.add(new AbsentMindedTurtle(w, i + 1, absentLevel));
				System.out.println(turtles.get(i));
			} else {
				int level = rand.nextInt(5) + 1;
				turtles.add(new DizzyTurtle(w, i + 1, level));
				System.out.println(turtles.get(i));

			}
		}

		int place = 0;
		
	
		while (!turtles.isEmpty()) {
			for (int i = 0; i < turtles.size(); i++) {
				turtles.get(i).raceStep();
				RaceWindow.delay(10);

				if (turtles.get(i).getX() > RaceWindow.X_END_POS) {
					finished.add(turtles.get(i));
					if (place < 3) {
						place++;
						System.out.println("På plats " + place + ":" + turtles.get(i).toString());

					}
					turtles.remove(i);
					i--;
				}
			}
			}
		}
	
}