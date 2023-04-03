package loopsExample;

import java.util.Scanner;

public class ForLoopExample {

	int actualPIN;
	int enteredPIN;
	int withdrawAmount;
	int accountBalance;

	Scanner sc = new Scanner(System.in);

	void checkPinIsCorrect() {
		for (int counter = 1; 
				counter <= 3; 
				counter++) {
			System.out.println("Enter the PIN");
			enteredPIN = sc.nextInt();

			if (actualPIN == enteredPIN) {
				System.out.println("Entered PIN is correct");
				System.out.println("Enter the amount to be withdrawn:");

				withdrawAmount = sc.nextInt();

				if (withdrawAmount <= accountBalance) {
					System.out.println("Cash withdrawn in amount of: " + withdrawAmount);
				} else {
					System.out.println("Amount in the account is not enough");
				}

				break;

			} else {

				if (actualPIN != enteredPIN && counter == 3) {
					System.out.println("Entered PIN is incorrect and your account is locked");
				} else {
					System.out.println("Entered PIN is incorrect");
				}
			}
		}

	}
}
