package marsMissionProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Simulation {

	/*
	 * loadItems method read the text file line by line and create an Item object
	 * for each and then add it to an ArrayList of Items. The method should then
	 * return that ArrayList.
	 */

	public ArrayList<Item> loadItems() throws Exception {

		ArrayList<Item> items = new ArrayList<Item>();

		File file = new File("C:\\Users\\parte\\OneDrive\\Desktop\\phase-1(1).txt");

		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {

			String line = scanner.nextLine();
			int index = line.indexOf("=");

			String name = line.substring(0, index);
			int weight = Integer.parseInt(line.substring(index + 1));

			Item item = new Item(name, weight);

			items.add(item);
		}
		return items;
	}

	/*
	 * this method takes the ArrayList of Items returned from loadItems and starts
	 * creating R1 rockets. It first tries to fill up 1 rocket with as many items as
	 * possible before creating a new rocket object and filling that one until all
	 * items are loaded. The method then returns the ArrayList of those R1 rockets
	 * that are fully loaded.
	 */

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

		ArrayList<Rocket> R1RocketList = new ArrayList<Rocket>();

		Rocket rocketOne = new R1(); /* Rocket class reference variable with R1 class */

		for (Item currentItem : items) {
			if (rocketOne.canCarry(currentItem)) {
				rocketOne.carry(currentItem);
				R1RocketList.add(rocketOne);
			}
		}

		return R1RocketList;

	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

		ArrayList<Rocket> R2RocketList = new ArrayList<Rocket>();

		Rocket rocketTwo = new R2(); /* Rocket class reference variable with R1 class */

		for (Item currentItem : items) {
			if (rocketTwo.canCarry(currentItem)) {
				rocketTwo.carry(currentItem);
				R2RocketList.add(rocketTwo);
			}
		}

		return R2RocketList;

	}

	/*
	 * this method takes an ArrayList of Rockets and calls launch and land methods
	 * for each of the rockets in the ArrayList. Every time a rocket explodes or
	 * crashes (i.e if launch or land return false) it will have to send that rocket
	 * again. All while keeping track of the total budget required to send each
	 * rocket safely to Mars. runSimulation then returns the total budget required
	 * to send all rockets (including the crashed ones).
	 */

	public double runSimulation(ArrayList<Rocket> allRockets) {

		double totalBudget = 0;

		for (Rocket rocket : allRockets) {

			totalBudget += rocket.getCostOfRocket();

			while (!rocket.launch() || !rocket.land()) {

				totalBudget += rocket.getCostOfRocket();
			}

		}

		return totalBudget;
	}

}
