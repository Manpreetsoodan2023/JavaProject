package bankingAssignment;

public class PersonsAccount {

	private String accountNumber;
	private String accountHolderName;
	private double totalFunds = 1500;
	private String password = "soodanmanpreet";
	private int pin = 1234;

	public PersonsAccount(String accountNumber, String accountHolderName, double totalFunds) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.totalFunds = totalFunds;
		this.password = password;
		this.pin = pin;
	}

	public String getAccountNumber() {

		return accountNumber;
	}

	public String getAccountHolderName() {

		return accountHolderName;
	}

	public double gettotalFundsAvailable() {
		return totalFunds;
	}

	public int getPin() {
		return pin;
	}
	
	public void setPin(int newPin) {
		this.pin = newPin;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	

}