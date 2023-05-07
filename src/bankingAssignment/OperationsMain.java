package bankingAssignment;

import java.util.Scanner;

public class OperationsMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PersonsAccount account = new PersonsAccount("86478309", "Manpreet", 1500);
		System.out.println("Account holder's name : " + account.getAccountHolderName() + " and Account number : "
				+ account.getAccountNumber());

		BankOperations bankOperations = null;

		System.out.println("What operation would you like to perform? : ATM or Online Banking ");
		String selectOperation = sc.next();

		switch (selectOperation) {

		case "ATM":
			bankOperations = new ATM();

			if (bankOperations.flag) {
				System.out
						.println("Please select whether you want to withdraw money or deposit money or update pin : ");
				String selectTransaction = sc.next();
				if (selectTransaction.equalsIgnoreCase("withdraw")) {
					bankOperations.withdrawMoney();
				}
				if (selectTransaction.equalsIgnoreCase("deposit")) {
					bankOperations.depositMoney();
				}
				if (selectTransaction.equalsIgnoreCase("updatepin")) {
					bankOperations.changePinPassword();
				}
			}

			break;

		case "OnlineBanking":
			bankOperations = new OnlineBanking();

			if (bankOperations.flag)
				System.out.println(
						"Please select whether you want to withdraw money or deposit money or update password: ");
			String selectTransaction = sc.next();
			if (selectTransaction.equalsIgnoreCase("withdraw")) {
				bankOperations.withdrawMoney();
			}
			if (selectTransaction.equalsIgnoreCase("deposit")) {
				bankOperations.depositMoney();
			}
			if (selectTransaction.equalsIgnoreCase("updatepassword")) {
				bankOperations.changePinPassword();
			}

			break;

		default:
			System.out.println("Please enter a valid operation");
			break;
		}
	}
}
