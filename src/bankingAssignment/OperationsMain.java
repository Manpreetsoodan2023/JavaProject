package bankingAssignment;

import java.util.Scanner;

public class OperationsMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PersonsAccount account = new PersonsAccount();
		BankOperations bo = null;

		System.out.println("What operation would you like to perform? : ATM or Online Banking ");
		String selectOperation = sc.next();

		if (selectOperation.equalsIgnoreCase("ATM")) {
			bo = new ATM();

			System.out.println("Enter ATM pin : ");
			int enteredPin = sc.nextInt();

			for (int counter = 1; counter <= 3; counter++) {

				if (account.getPin() == enteredPin) {
					System.out.println("Please select whether you want to withdraw money or deposit money : ");
					String selectTransaction = sc.next();
					if (selectTransaction.equalsIgnoreCase("withdraw")) {
						System.out.println(bo.withdrawMoney());

					}
					if (selectTransaction.equalsIgnoreCase("deposit")) {
						System.out.println(bo.depositMoney());
					}
					break;
				} else {

					if (account.getPin() != enteredPin && counter == 3) {
						System.out.println("Entered PIN is incorrect and your account is locked");
					} else {
						System.out.println("Entered PIN is incorrect");
					}
				}
			}
		}

			if (selectOperation.equalsIgnoreCase("Online Banking")) {
				bo = new OnlineBanking();
				System.out.println("Enter bank account password :");
				String enteredPassword = sc.next();

				for (int i = 1; i <= 3; i++) {

					if (account.getPassword().equals(enteredPassword)) {
						System.out.println("Passoword is correct");
						System.out.println("Please select whether you want to withdraw money or deposit money : ");
						String selectTransaction = sc.next();
						if (selectTransaction.equalsIgnoreCase("withdraw")) {
							System.out.println(bo.withdrawMoney());

						}
						if (selectTransaction.equalsIgnoreCase("deposit")) {
							System.out.println(bo.depositMoney());
						}

						break;
					}

					else {
						if (account.getPassword() != enteredPassword && i == 3) {
							System.out.println("Entered PIN is incorrect and your account is locked");
						} 
						else {

						}
						System.out.println("Entered PIN is incorrect");
					}

				}
			}
		}
	}
