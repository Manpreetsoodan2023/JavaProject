package bankingAssignment;

import java.util.Scanner;

public class BankOperations {

	
	Scanner sc = new Scanner(System.in);

	PersonsAccount account = new PersonsAccount();

	double moneyToBeWithdrawn;
	double moneyToBeDeposited;
	double totalMoney = account.gettotalFundsAvailable();

	public double withdrawMoney() {
		System.out.println("Enter the amount of money you would like to withdraw : ");
		moneyToBeWithdrawn = sc.nextDouble();
		if(moneyToBeWithdrawn <= totalMoney) {
			System.out.println("Please collect your money : " + moneyToBeWithdrawn);
			 totalMoney -= moneyToBeWithdrawn;
			System.out.println("Remaining balance in account is : " + totalMoney);

		} else
			System.out.println("The money in account is not enough");
		return totalMoney;
	}

	public double depositMoney() {
		System.out.println("Enter the amount of money you would like to deposit : ");
		moneyToBeDeposited = sc.nextDouble();
		 totalMoney += moneyToBeDeposited;
		System.out.println("The total amount available in the account is :" + totalMoney);
		return totalMoney;
	}

	public void displayBalance() {

		System.out.println("Balance in the account is : " + totalMoney);

	}
}
