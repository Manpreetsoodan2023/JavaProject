package bankingAssignment;

import java.util.Scanner;

public abstract class BankOperations {

	Scanner sc = new Scanner(System.in);

	double moneyToBeWithdrawn;
	double moneyToBeDeposited;
	double newBalance;
	public boolean flag;

	public abstract void changePinPassword(PersonsAccount account);

	public double withdrawMoney(double totalFunds) {
		System.out.println("Enter the amount of money you would like to withdraw : ");
		moneyToBeWithdrawn = sc.nextDouble();
		if (moneyToBeWithdrawn < totalFunds) {
			System.out.println("Please collect your money : " + moneyToBeWithdrawn);
			newBalance = totalFunds - moneyToBeWithdrawn;
		}
		return newBalance;
	}

	public double depositMoney(double totalFunds) {
		System.out.println("Enter the amount of money you would like to deposit : ");
		moneyToBeDeposited = sc.nextDouble();
		newBalance = totalFunds + moneyToBeDeposited;

		return newBalance;
	}

	public void displayBalance() {

		System.out.println("Balance in the account is : " + newBalance);

	}
}
