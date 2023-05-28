package marsMissionProject;

public class R1 extends Rocket {

	R1() {

		super(10000000, 10000, 18000);
	}

	
	/*
	 * land and launch methods to calculate the corresponding chance of exploding
	 * and return either true or false based on a random number using the
	 * probability equation for each.
	 */

	public boolean launch() {

		int random = (int) (Math.random());

		return random > (0.05 * getWeightOfRocket()/ getMaximumWeight());

	}

	public boolean land() {

		int random = (int) (Math.random());

		return random > (0.01 * getWeightOfRocket() / getMaximumWeight());

	}

}
