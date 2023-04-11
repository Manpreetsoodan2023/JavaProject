package arrayExample;

import java.util.Scanner;

public class PizzaProgram {
	
	int n;
	int smallPizzaPrice = 15;
	int mediumPizzaPrice = 20;
	int largePizzaPrice = 25;
	int totalPrice;
	String pizzaSize;
	int pepperoniTopping;
	boolean extraCheeseRequired;

	Scanner sc = new Scanner(System.in);

	void displayPrice() {
		System.out.println("How many pizzas would you like to order?");
		n = sc.nextInt();
		System.out.println("Enter size of pizza required");
		pizzaSize = sc.next();

		switch (pizzaSize) {

		case "Small":
			System.out.println("Price of " + n + " Small pizza is " + n*smallPizzaPrice);

			System.out.println("How many toppings of pepperoni would you like to add?");
			pepperoniTopping = sc.nextInt();
			
			if (pepperoniTopping >= 1) {
				totalPrice = n*smallPizzaPrice + 2*pepperoniTopping;
				System.out.println("Total price of pizza is " + totalPrice);
				}

				else if (pepperoniTopping == 0) {
					
					totalPrice = n*smallPizzaPrice;
					System.out.println("Total price of pizza is " + totalPrice);
				}
				
			break;

		case "Medium":

			System.out.println("Price of " + n + " Medium pizza is " + n*mediumPizzaPrice);

			System.out.println("How many toppings of pepperoni would you like to add?");
			pepperoniTopping = sc.nextInt();
			
			if (pepperoniTopping >= 1) {
				totalPrice = n*mediumPizzaPrice + 3*pepperoniTopping;
				System.out.println("Total price of pizza is " + totalPrice);

			} else if (pepperoniTopping == 0) {
				
				totalPrice = n*mediumPizzaPrice;
				System.out.println("Total price of pizza is " + totalPrice);
			}
			break;
			
		case "Large":

			System.out.println("Price of " + n + " Large pizza is " + n*largePizzaPrice);

			System.out.println("How many toppings of pepperoni would you like to add?");
			pepperoniTopping = sc.nextInt();
			
			if (pepperoniTopping >= 1) {
				totalPrice = n*largePizzaPrice + 3*pepperoniTopping;
				System.out.println("Total price of pizza is " + totalPrice);

			}
			else if (pepperoniTopping == 0) {
				
				totalPrice = n*smallPizzaPrice;
				System.out.println("Total price of pizza is " + totalPrice);
			}
			break;

		}
			
		System.out.println("Do you want to add extraCheese?");
		extraCheeseRequired = sc.nextBoolean();
		if(extraCheeseRequired) {
			
			System.out.println("Total price that customer has to pay in dollars : " + (totalPrice + 1));
			
		}
		else {
			
			System.out.println("Total price that customer has to pay in dollars : " + totalPrice);
		}

	}

}
