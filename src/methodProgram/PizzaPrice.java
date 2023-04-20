package methodProgram;

import java.util.Scanner;

public class PizzaPrice {
	int n;
	int smallPizzaPrice = 15;
	int mediumPizzaPrice = 20;
	int largePizzaPrice = 25;
	int totalPrice;
	String pepperoni;
	String pizzaSize;
	boolean extraCheese;

	Scanner sc = new Scanner(System.in);

	void numberOfPizzasRequired() {

		System.out.println("How many pizzas would you like to order? ");
		n = sc.nextInt();
	}

	void requiredPizzaSize() {
		System.out.println("Enter size of pizza required ");
		pizzaSize = sc.next();

		switch (pizzaSize) {
		case "Small":
			System.out.println("Price of " + n + " Small pizza is " + n * smallPizzaPrice);
			break;

		case "Medium":

			System.out.println("Price of " + n + " Medium pizza is " + n * mediumPizzaPrice);
			break;

		case "Large":

			System.out.println("Price of " + n + " Large pizza is " + n * largePizzaPrice);
			break;
		}
	}

	void pepperoniAddOn() {
		System.out.println("Do you want to add pepperoni on " + pizzaSize + "pizza");
		pepperoni = sc.next();
		if ((pepperoni == "y") && (pizzaSize == "Small")) {
			totalPrice = (n * smallPizzaPrice) + 2;
		} else if (((pepperoni == "n") && (pizzaSize == "Small"))) {
			totalPrice = n * smallPizzaPrice;
		} else if ((pepperoni == "y") && (pizzaSize == "Medium")) {
			totalPrice = (n * mediumPizzaPrice) +3;
		} else if ((pepperoni == "n") && (pizzaSize == "Medium")) {
			totalPrice = n * mediumPizzaPrice;
		} else if ((pepperoni == "y") && (pizzaSize == "Large")) {
			totalPrice = (n * largePizzaPrice) + 3;
		} else if ((pepperoni=="n") && (pizzaSize == "Large")) {
			totalPrice = n * largePizzaPrice;
		}
	}

	void ifExtraCheeseRequired() {
		System.out.println("Do you want to add extraCheese? ");
		extraCheese = sc.nextBoolean();
		if (extraCheese) {
			System.out.println("Total price that customer has to pay in dollars : " + (totalPrice + 1));

		} else {

			System.out.println("Total price that customer has to pay in dollars : " + totalPrice);
		}

	}
}
