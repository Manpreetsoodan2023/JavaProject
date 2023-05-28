package marsMissionProject;

public class Rocket implements SpaceShip {

	
	private double costOfRocket;
	private double weightOfRocket;
	private double maximumWeight;
	public double currentWeight;
	
	
	public Rocket(double costOfRocket, double weightOfRocket, double maximumWeight) {

		this.costOfRocket = costOfRocket;
		this.weightOfRocket = weightOfRocket;
		this.maximumWeight = maximumWeight;
	}
	
	
	public double getCostOfRocket() {
		return costOfRocket;
	}



	public double getWeightOfRocket() {
		return weightOfRocket;
	}



	public double getMaximumWeight() {
		return maximumWeight;
	}



	@Override
	public boolean launch() {
		return true;
	}

	@Override
	public boolean land() {
	
		return true;
	}

	/* this method takes Item as an argument and returns true if the rocket can carry such item or false if it will exceed the weight limit. */
	
	@Override
	public boolean canCarry(Item item) {
		return (weightOfRocket + item.getWeight())<= maximumWeight;
	}

	/* this method takes an Item object and updates the current weight of the rocket. */
	
	
	@Override
	public void carry(Item item) {
		
		currentWeight += item.getWeight();
		
	}
	
}
