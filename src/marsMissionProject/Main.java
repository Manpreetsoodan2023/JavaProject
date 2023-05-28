package marsMissionProject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {

		Simulation simulation = new Simulation();

		try {

			ArrayList<Item> items = simulation.loadItems();
			ArrayList<Rocket> R1RocketList = simulation.loadU1(items);

			System.out.println("Total cost of R1 fleet: " + simulation.runSimulation(R1RocketList));

			ArrayList<Rocket> R2RocketList = simulation.loadU1(items);

			System.out.println("Total cost of R2 fleet: " + simulation.runSimulation(R2RocketList));

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
