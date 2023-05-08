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

				switch (selectTransaction) {
				case "withdraw":
					bankOperations.withdrawMoney();
					bankOperations.displayBalance();
					break;
				case "deposit":
					bankOperations.depositMoney();
					bankOperations.displayBalance();
					break;
				case "updatepin":
					bankOperations.changePinPassword();
					break;
				default:
					System.out.println("Invalid selection");
					break;
				}
			}

			break;

		case "OnlineBanking":
			bankOperations = new OnlineBanking();

			if (bankOperations.flag)
				System.out.println(
						"Please select whether you want to withdraw money or deposit money or update password: ");
			String selectTransaction = sc.next();
			switch (selectTransaction) {
			case "withdraw":
				bankOperations.withdrawMoney();
				bankOperations.displayBalance();
				break;
			case "deposit":
				bankOperations.depositMoney();
				bankOperations.displayBalance();
				break;
			case "updatepassword":
				bankOperations.changePinPassword();
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}

			break;

		default:
			System.out.println("Please enter a valid operation");
			break;
		}
	}
}
