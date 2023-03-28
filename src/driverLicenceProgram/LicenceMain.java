package driverLicenceProgram;

public class LicenceMain {

	public static void main(String[] args) {
	
		DriverLicence licenceDetails = new DriverLicence();
	
		licenceDetails.age = 16;
		licenceDetails.G2 = true;
		licenceDetails.licenceEligibility();

	}

}

