package bankingAssignment;

import java.util.Scanner;

public class OperationsMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PersonsAccount manpreetAccount = new PersonsAccount("897657", "manpreet", 2000, "soodanmanpreet", 1234);
		PersonsAccount jaspreetAccount = new PersonsAccount("845378", "jaspreet", 3000, "kaurjaspreet", 4567);
		PersonsAccount tajinderAccount = new PersonsAccount("814527", "tajinder", 5000, "singhtajinder", 7891);
		PersonsAccount parminderAccount = new PersonsAccount("804298", "parminder", 4000, "kaurparminder", 2345);
		PersonsAccount pawandeepAccount = new PersonsAccount("811288", "pawandeep", 2000, "soodanpawan", 6789);

		PersonsAccount[] nameList = { manpreetAccount, jaspreetAccount, tajinderAccount, parminderAccount,
				pawandeepAccount };
		PersonsAccount account = null;

		System.out.println("Please enter name of the customer : ");
		String name = sc.next();
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].getAccountHolderName().equals(name)) {
				account = nameList[i];
			}
		}

		System.out.println("What operation would you like to perform? : ATM or Online Banking ");
		String selectOperation = sc.next();

		BankOperations bankOperations = null;
		switch (selectOperation) {

		case "ATM":
			bankOperations = new ATM(account.getPin());

			if (bankOperations.flag) {
				System.out
						.println("Please select whether you want to withdraw money or deposit money or update pin : ");
				String selectTransaction = sc.next();

				switch (selectTransaction) {
				case "withdraw":
					bankOperations.withdrawMoney(account.gettotalFundsAvailable());
					bankOperations.displayBalance();
					break;
				case "deposit":
					bankOperations.depositMoney(account.gettotalFundsAvailable());
					bankOperations.displayBalance();
					break;
				case "updatepin":
					bankOperations.changePinPassword(account);
					break;
				default:
					System.out.println("Invalid selection");
					break;
				}
			}

			break;

		case "OnlineBanking":
			bankOperations = new OnlineBanking(account.getPassword());

			if (bankOperations.flag)
				System.out.println(
						"Please select whether you want to withdraw money or deposit money or update password: ");
			String selectTransaction = sc.next();
			switch (selectTransaction) {
			case "withdraw":
				bankOperations.withdrawMoney(account.gettotalFundsAvailable());
				bankOperations.displayBalance();
				break;
			case "deposit":
				bankOperations.depositMoney(account.gettotalFundsAvailable());
				bankOperations.displayBalance();
				break;
			case "updatepassword":
				bankOperations.changePinPassword(account);
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
