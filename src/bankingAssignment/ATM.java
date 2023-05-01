package bankingAssignment;

public class ATM extends BankOperations{
	
	
	@Override
	public double withdrawMoney() {
		
		System.out.println("Enter the amount of money you would like to withdraw : ");
		moneyToBeWithdrawn = sc.nextDouble();
		if (account.gettotalFundsAvailable() > moneyToBeWithdrawn) {
			System.out.println("Please collect your money : " + moneyToBeWithdrawn);
			double existingAmount = account.gettotalFundsAvailable();
			totalMoney = existingAmount - moneyToBeWithdrawn;
			System.out.println("Remaining balance in account is : " + totalMoney);

		}
		else
			System.out.println("The money in account is not enough");
		return totalMoney;
	}

	@Override
	public double depositMoney() {
		System.out.println("Enter the amount of money you would like to deposit : ");
		moneyToBeDeposited = sc.nextDouble();
		double existingAmount = account.gettotalFundsAvailable();
		totalMoney = existingAmount + moneyToBeDeposited;
		System.out.println("The total amount available in the account is :" + totalMoney);
		return totalMoney;
	}
}
