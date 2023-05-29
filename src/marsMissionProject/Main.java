package marsMissionProject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {

		/*
		 * 1. Create a Simulation object 2. Load Items for the Mission 3. Load a fleet
		 * of R1 rockets for the Mission 4. Run the simulation using the fleet of R1
		 * rockets and display the total budget required.
		 */

		Simulation simulation = new Simulation();

		try {

			ArrayList<Item> items = simulation.loadItems();
			ArrayList<Rocket> R1RocketList = simulation.loadU1(items);

			System.out.println("Total cost of R1 fleet: " + simulation.runSimulation(R1RocketList));

			ArrayList<Rocket> R2RocketList = simulation.loadU2(items);

			System.out.println("Total cost of R2 fleet: " + simulation.runSimulation(R2RocketList));

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
