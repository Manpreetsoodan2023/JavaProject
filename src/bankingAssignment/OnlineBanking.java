package bankingAssignment;

public class OnlineBanking extends BankOperations {

	OnlineBanking() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter bank account password :");
			String enteredPassword = sc.next();

			if (account.getPassword().equals(enteredPassword)) {
				flag = true;
				break;
			} else {
				if (account.getPassword() != enteredPassword && i == 3) {
					System.out.println("Entered Password is incorrect and your account is locked");
				} else {

					System.out.println("Entered Password is incorrect. Please try again!");
				}
			}
		}
	}

	
	@Override
	public void changePinPassword() {

		System.out.println("Enter new password");
		String newPassword = sc.next();

		while (newPassword.contains("&") || newPassword.contains("$") || newPassword.contains("@")
				|| (newPassword.length() < 8) || (newPassword.equals(account.getPassword()))) {
			if (newPassword.contains("&") || newPassword.contains("$") || newPassword.contains("@")) {
				System.out.println("Password cannot have special characters. Please try again!");
			}
			if (newPassword.length() < 8) {
				System.out.println("Password should have atleast 8 characters. Please try again!");
			}
			if (newPassword.equals(account.getPassword())) {
				System.out.println("New password should not be same as old password. Please try again!");
			}
			System.out.println("Enter new password");
			newPassword = sc.next();
		}
		System.out.println("New password is " + newPassword);
	}
}
