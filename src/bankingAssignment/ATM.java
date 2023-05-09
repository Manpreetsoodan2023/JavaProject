package bankingAssignment;

public class ATM extends BankOperations {

	ATM(int pin) {

		for (int counter = 1; counter <= 3; counter++) {
			System.out.println("Enter ATM pin : ");
			int enteredPin = sc.nextInt();

			if (pin == enteredPin) {
				flag = true;
				break;
			} else {

				if (pin != enteredPin && counter == 3) {
					System.out.println("Entered PIN is incorrect and your account is locked");
				} else {
					System.out.println("Entered PIN is incorrect. Please try again!");
				}
			}
		}
	}

	@Override
	public void changePinPassword(PersonsAccount account) {
		System.out.println("Enter new ATM pin number");
		int newPin = sc.nextInt();

		while (newPin == account.getPin() || (String.valueOf(newPin).length() < 4)) {

			if (newPin == account.getPin()) {
				System.out.println("Entered pin is same as old pin. Please use different pin");
			}
			if (String.valueOf(newPin).length() < 4) {
				System.out.println("Entered pin should have atleast 4 characters. Please try again!");
			}
			System.out.println("Enter new ATM pin number");
			newPin = sc.nextInt();

		}
		System.out.println("Updated pin is : " + newPin);

	}

}