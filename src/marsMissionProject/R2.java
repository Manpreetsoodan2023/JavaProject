package marsMissionProject;

public class R2 extends Rocket {

	
	R2() {

		super(120000000, 18000, 29000);
	}

	
	/*
	 * land and launch methods to calculate the corresponding chance of exploding
	 * and return either true or false based on a random number using the
	 * probability equation for each.
	 */

	public boolean launch() {

		int random = (int) (Math.random());

		return random > (0.04 * getWeightOfRocket() / getMaximumWeight());

	}

	public boolean land() {

		int random = (int) (Math.random());

		return random > (0.08 * getWeightOfRocket() / getMaximumWeight());

	}

}
	
	