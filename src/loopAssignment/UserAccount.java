package loopAssignment;

import java.util.Scanner;

public class UserAccount {

	String UserId;
	String password;
	String enteredId;
	String enteredPassword;

	Scanner sc = new Scanner(System.in);

	void userCredentials() {
		

		for (int counter = 1;
				counter<=3;
				counter++)
			
		{
			System.out.println("Enter your UserId");
			enteredId = sc.next();
			System.out.println("Enter your password");
			enteredPassword = sc.next();
			
	    if ((enteredId == UserId) && (enteredPassword == password)){
			
			System.out.println("You are logged into the application");
		}
	 
	    
	    else  {
		
			System.out.println("Incorrect User id or password. Try again");
				
	    }
	
		if (UserId != enteredId || password != enteredPassword && counter ==3){
			
			System.out.println("Account locked");
			
		}
			else {
				
				System.out.println("Incorrect User id or password. Try again");
			}
		
			}
	}

}
