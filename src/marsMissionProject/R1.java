package marsMissionProject;

public class R1 extends Rocket {

	R1() {

		super(10000000, 10000, 18000);
	}

	/*
	 * land and launch methods-calculate the corresponding chance of exploding and
	 * return either true or false based on a random number using the probability
	 * equation for each.
	 */

	// Math.random - to create a random number of type double

	@Override
	public boolean launch() {

		double random = (Math.random());

		/* Chance of launch explosion = 5% * (cargo carried / cargo limit) */

		double probabilityOfExplosion = (0.05 * getWeightOfRocket() / getMaximumWeight());
		if (random > probabilityOfExplosion) {
			return true;
		}

		return false;

	}

	@Override
	public boolean land() {

		double random = (Math.random());

		/* Chance of landing crash = 1% * (cargo carried / cargo limit) */

		double probabilityOfCrash = (0.01 * getWeightOfRocket() / getMaximumWeight());
		if (random > probabilityOfCrash) {
			return true;
		}

		return false;
	}

}