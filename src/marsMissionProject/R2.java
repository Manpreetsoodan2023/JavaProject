package marsMissionProject;

public class R2 extends Rocket {

	R2() {

		super(120, 18000, 29000);
	}

	/*
	 * land and launch methods to calculate the corresponding chance of exploding
	 * and return either true or false based on a random number using the
	 * probability equation for each.
	 */

	@Override
	public boolean launch() {

		double random = (Math.random());

		/* Chance of launch explosion = 4% * (cargo carried / cargo limit) */

		double probabilityOfExplosion = (0.04 * getWeightOfRocket() / getMaximumWeight());
		if (random > probabilityOfExplosion) {
			return true;
		}

		return false;

	}

	@Override
	public boolean land() {

		double random = (Math.random());

		/* Chance of landing crash = 8% * (cargo carried / cargo limit) */

		double probabilityOfCrash = (0.08 * getWeightOfRocket() / getMaximumWeight());
		if (random > probabilityOfCrash) {
			return true;
		}

		return false;

	}

}
