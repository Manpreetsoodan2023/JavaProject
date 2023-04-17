package methodProgram;

import java.util.Scanner;

public class PriceMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PizzaPrice totalAmount = new PizzaPrice();
		totalAmount.numberOfPizzasRequired();
		totalAmount.requiredPizzaSize();
		totalAmount.pepperoniAddOn();
		totalAmount.ifExtraCheeseRequired();
		
	}

}
