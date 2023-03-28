package driverLicenceProgram;

public class DriverLicence {

	int age;
    boolean G1;
    boolean G2;
    boolean G;
	
	void licenceEligibility() {
		
		if(age<16) {
		
			System.out.println("Person is not eligible to get licence");
		}
		
		else if(G1)
		{
			System.out.println("Person is 16 years of age or older and has G1 licence, and eligible for G2 licence");
		
		}
	
		else if(G2)
		{
			System.out.println("Person is 16 years of age or older and has G2 licence, and eligible for G licence");
		}
		
		else if(G)
		{
			System.out.println("Person is 16 years of age or older and has G licence");	
				
			}
		
		else {
			System.out.println("Person is 16 year of age or older and is eligible to apply for a driving licence");
		}
		
		}
	}

