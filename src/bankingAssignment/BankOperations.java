package bankingAssignment;

import java.util.Scanner;

public abstract class BankOperations {

	Scanner sc = new Scanner(System.in);

	PersonsAccount account = new PersonsAccount("86478309", "Manpreet", 1500, "soodanmanpreet", 1234);

	double moneyToBeWithdrawn;
	double moneyToBeDeposited;
	double totalMoney = account.gettotalFundsAvailable();
	public boolean flag;

	public abstract void changePinPassword();

	public double withdrawMoney() {
		System.out.println("Enter the amount of money you would like to withdraw : ");
		moneyToBeWithdrawn = sc.nextDouble();
		if (moneyToBeWithdrawn <= totalMoney) {
			System.out.println("Please collect your money : " + moneyToBeWithdrawn);
			totalMoney -= moneyToBeWithdrawn;
		}
		return totalMoney;
	}

	public double depositMoney() {
		System.out.println("Enter the amount of money you would like to deposit : ");
		moneyToBeDeposited = sc.nextDouble();
		totalMoney += moneyToBeDeposited;

		return totalMoney;
	}

	public void displayBalance() {

		System.out.println("Balance in the account is : " + totalMoney);

	}

}
