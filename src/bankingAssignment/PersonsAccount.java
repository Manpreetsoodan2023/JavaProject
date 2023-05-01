package bankingAssignment;

public class PersonsAccount {

	private String accountNumber;
	private String accountHolderName;
	private double totalFunds = 1500;
	private String password = "soodan";
	private int pin = 1234;

	public String getAccountHolderName() {

		return accountHolderName;
	}
	
	public double gettotalFundsAvailable() {
		return totalFunds;
	}

	public int getPin() {
		return pin;
	}

	public String getPassword() {
		return password;
	}

}